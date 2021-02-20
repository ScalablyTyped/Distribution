package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fxaaPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/fxaaPostProcess", "FxaaPostProcess")
  @js.native
  class FxaaPostProcess protected () extends PostProcess {
    def this(
      name: String,
      options: Double | PostProcessOptions,
      camera: js.UndefOr[Nullable[Camera]],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double]
    ) = this()
    
    var _getDefines: js.Any = js.native
  }
  /* static members */
  object FxaaPostProcess {
    
    /** @hidden */
    @JSImport("babylonjs/PostProcesses/fxaaPostProcess", "FxaaPostProcess._Parse")
    @js.native
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): FxaaPostProcess = js.native
  }
}
