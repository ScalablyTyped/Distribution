package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Render pipeline to produce ssao effect
     */
@JSImport("babylonjs", "SSAO2RenderingPipeline")
@js.native
class SSAO2RenderingPipeline protected ()
  extends babylonjsLib.BABYLONNs.SSAO2RenderingPipeline {
  /**
           * @constructor
           * @param name The rendering pipeline name
           * @param scene The scene linked to this pipeline
           * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
           * @param cameras The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: js.Any) = this()
  /**
           * @constructor
           * @param name The rendering pipeline name
           * @param scene The scene linked to this pipeline
           * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
           * @param cameras The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: js.Any, cameras: js.Array[babylonjsLib.BABYLONNs.Camera]) = this()
}

/**
     * Render pipeline to produce ssao effect
     */
@JSImport("babylonjs", "SSAO2RenderingPipeline")
@js.native
object SSAO2RenderingPipeline extends js.Object {
  /**
          *  Support test.
          */
  val IsSupported: scala.Boolean = js.native
  /**
           * Parse the serialized pipeline
           * @param source Source pipeline.
           * @param scene The scene to load the pipeline to.
           * @param rootUrl The URL of the serialized pipeline.
           * @returns An instantiated pipeline from the serialized object.
           */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.SSAO2RenderingPipeline = js.native
}

