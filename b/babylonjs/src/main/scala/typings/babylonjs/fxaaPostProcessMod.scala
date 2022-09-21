package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fxaaPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/fxaaPostProcess", "FxaaPostProcess")
  @js.native
  open class FxaaPostProcess protected () extends PostProcess {
    def this(
      name: String,
      options: Double | PostProcessOptions,
      camera: js.UndefOr[Nullable[Camera]],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double]
    ) = this()
    
    /* private */ var _getDefines: Any = js.native
  }
  /* static members */
  object FxaaPostProcess {
    
    @JSImport("babylonjs/PostProcesses/fxaaPostProcess", "FxaaPostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param parsedPostProcess
      * @param targetCamera
      * @param scene
      * @param rootUrl
      * @hidden
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): FxaaPostProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[FxaaPostProcess]
  }
}
