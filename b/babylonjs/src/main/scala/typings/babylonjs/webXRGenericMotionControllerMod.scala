package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRGenericMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRGenericMotionController", "WebXRGenericTriggerMotionController")
  @js.native
  open class WebXRGenericTriggerMotionController protected () extends WebXRAbstractMotionController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  object WebXRGenericTriggerMotionController {
    
    @JSImport("babylonjs/XR/motionController/webXRGenericMotionController", "WebXRGenericTriggerMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static version of the profile id of this controller
      */
    @JSImport("babylonjs/XR/motionController/webXRGenericMotionController", "WebXRGenericTriggerMotionController.ProfileId")
    @js.native
    def ProfileId: String = js.native
    inline def ProfileId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(x.asInstanceOf[js.Any])
  }
}
