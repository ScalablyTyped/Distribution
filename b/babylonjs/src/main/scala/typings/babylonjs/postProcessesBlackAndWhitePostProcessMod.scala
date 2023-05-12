package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesBlackAndWhitePostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/blackAndWhitePostProcess", "BlackAndWhitePostProcess")
  @js.native
  open class BlackAndWhitePostProcess protected () extends PostProcess {
    /**
      * Creates a black and white post process
      * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/usePostProcesses#black-and-white
      * @param name The name of the effect.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      */
    def this(name: String, options: Double, camera: Nullable[Camera]) = this()
    def this(name: String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
    def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Double) = this()
    def this(name: String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: Double) = this()
    def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Double, engine: Engine) = this()
    def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Unit, engine: Engine) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /**
      * Linear about to convert he result to black and white (default: 1)
      */
    var degree: Double = js.native
  }
  /* static members */
  object BlackAndWhitePostProcess {
    
    @JSImport("babylonjs/PostProcesses/blackAndWhitePostProcess", "BlackAndWhitePostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[BlackAndWhitePostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[BlackAndWhitePostProcess]]
  }
}
