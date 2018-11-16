package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Standard rendering pipeline
     * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
     * @see https://doc.babylonjs.com/how_to/using_standard_rendering_pipeline
     */
@JSImport("babylonjs", "StandardRenderingPipeline")
@js.native
class StandardRenderingPipeline protected ()
  extends babylonjsLib.BABYLONNs.StandardRenderingPipeline {
  /**
           * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
           * @constructor
           * @param name The rendering pipeline name
           * @param scene The scene linked to this pipeline
           * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
           * @param originalPostProcess the custom original color post-process. Must be "reusable". Can be null.
           * @param cameras The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: scala.Double) = this()
  /**
           * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
           * @constructor
           * @param name The rendering pipeline name
           * @param scene The scene linked to this pipeline
           * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
           * @param originalPostProcess the custom original color post-process. Must be "reusable". Can be null.
           * @param cameras The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: scala.Double, originalPostProcess: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PostProcess]) = this()
  /**
           * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
           * @constructor
           * @param name The rendering pipeline name
           * @param scene The scene linked to this pipeline
           * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
           * @param originalPostProcess the custom original color post-process. Must be "reusable". Can be null.
           * @param cameras The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: scala.Double, originalPostProcess: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PostProcess], cameras: js.Array[babylonjsLib.BABYLONNs.Camera]) = this()
}

/**
     * Standard rendering pipeline
     * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
     * @see https://doc.babylonjs.com/how_to/using_standard_rendering_pipeline
     */
@JSImport("babylonjs", "StandardRenderingPipeline")
@js.native
object StandardRenderingPipeline extends js.Object {
  /**
           * Luminance steps
           */
  var LuminanceSteps: scala.Double = js.native
  /**
           * Parse the serialized pipeline
           * @param source Source pipeline.
           * @param scene The scene to load the pipeline to.
           * @param rootUrl The URL of the serialized pipeline.
           * @returns An instantiated pipeline from the serialized object.
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.StandardRenderingPipeline = js.native
}

