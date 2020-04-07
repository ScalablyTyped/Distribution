package typings.babylonjs.renderPipelineIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/RenderPipeline/index", "SSAORenderingPipeline")
@js.native
class SSAORenderingPipeline protected ()
  extends typings.babylonjs.pipelinesIndexMod.SSAORenderingPipeline {
  /**
    * @constructor
    * @param name - The rendering pipeline name
    * @param scene - The scene linked to this pipeline
    * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
    * @param cameras - The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: Scene, ratio: js.Any) = this()
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
}

