package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "SSAO2RenderingPipeline")
@js.native
class SSAO2RenderingPipeline protected ()
  extends typings.babylonjs.renderPipelineIndexMod.SSAO2RenderingPipeline {
  /**
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    * @param forceGeometryBuffer Set to true if you want to use the legacy geometry buffer renderer
    */
  def this(name: String, scene: Scene, ratio: js.Any) = this()
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
  def this(
    name: String,
    scene: Scene,
    ratio: js.Any,
    cameras: js.UndefOr[scala.Nothing],
    forceGeometryBuffer: Boolean
  ) = this()
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera], forceGeometryBuffer: Boolean) = this()
}
/* static members */
object SSAO2RenderingPipeline {
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  @JSImport("babylonjs/PostProcesses/index", "SSAO2RenderingPipeline.Parse")
  @js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.ssao2RenderingPipelineMod.SSAO2RenderingPipeline = js.native
}
