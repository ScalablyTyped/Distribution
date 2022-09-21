package typings.babylonjs

import typings.babylonjs.anon.Filename
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRProfiledMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRProfiledMotionController", "WebXRProfiledMotionController")
  @js.native
  open class WebXRProfiledMotionController protected () extends WebXRAbstractMotionController {
    def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
    def this(
      scene: Scene,
      xrInput: XRInputSource,
      _profile: IMotionControllerProfile,
      _repositoryUrl: String,
      controllerCache: js.Array[Filename]
    ) = this()
    
    /* private */ var _buttonMeshMapping: Any = js.native
    
    /* private */ var _repositoryUrl: Any = js.native
    
    /* private */ var _touchDots: Any = js.native
    
    /* private */ var controllerCache: Any = js.native
  }
}
