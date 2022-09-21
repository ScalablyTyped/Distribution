package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RefractionPostProcess")
@js.native
open class RefractionPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RefractionPostProcess {
  /**
    * Initializes the RefractionPostProcess
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#refraction
    * @param name The name of the effect.
    * @param refractionTextureUrl Url of the refraction texture to use
    * @param color the base color of the refraction (used to taint the rendering)
    * @param depth simulated refraction depth
    * @param colorLevel the coefficient of the base color (0 to remove base color tainting)
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: typings.babylonjs.BABYLON.Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object RefractionPostProcess {
  
  @JSGlobal("BABYLON.RefractionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param parsedPostProcess
    * @param targetCamera
    * @param scene
    * @param rootUrl
    * @hidden
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typings.babylonjs.BABYLON.Camera,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): typings.babylonjs.BABYLON.RefractionPostProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.RefractionPostProcess]
}
