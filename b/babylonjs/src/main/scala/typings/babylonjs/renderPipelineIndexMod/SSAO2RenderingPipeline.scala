package typings.babylonjs.renderPipelineIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/RenderPipeline/index", "SSAO2RenderingPipeline")
@js.native
class SSAO2RenderingPipeline protected ()
  extends typings.babylonjs.pipelinesIndexMod.SSAO2RenderingPipeline {
  /**
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: Scene, ratio: js.Any) = this()
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
}

/* static members */
@JSImport("babylonjs/PostProcesses/RenderPipeline/index", "SSAO2RenderingPipeline")
@js.native
object SSAO2RenderingPipeline extends js.Object {
  /**
    *  Support test.
    */
  def IsSupported: Boolean = js.native
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.ssao2RenderingPipelineMod.SSAO2RenderingPipeline = js.native
}

