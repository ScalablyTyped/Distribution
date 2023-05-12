package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SSRRenderingPipeline")
@js.native
open class SSRRenderingPipeline protected ()
  extends typings.babylonjs.postProcessesIndexMod.SSRRenderingPipeline {
  /**
    * Constructor of the SSR rendering pipeline
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param cameras The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
    * @param forceGeometryBuffer Set to true if you want to use the legacy geometry buffer renderer (default: false)
    * @param textureType The texture type used by the different post processes created by SSR (default: Constants.TEXTURETYPE_UNSIGNED_BYTE)
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    forceGeometryBuffer: Boolean
  ) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene, cameras: Unit, forceGeometryBuffer: Boolean) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    forceGeometryBuffer: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: js.Array[typings.babylonjs.camerasCameraMod.Camera],
    forceGeometryBuffer: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: Unit,
    forceGeometryBuffer: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    cameras: Unit,
    forceGeometryBuffer: Unit,
    textureType: Double
  ) = this()
}
/* static members */
object SSRRenderingPipeline {
  
  @JSImport("babylonjs/index", "SSRRenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.postProcessesRenderPipelinePipelinesSsrRenderingPipelineMod.SSRRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePipelinesSsrRenderingPipelineMod.SSRRenderingPipeline]
}
