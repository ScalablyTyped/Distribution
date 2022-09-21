package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRGenericHandControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRGenericHandController", "WebXRGenericHandController")
  @js.native
  open class WebXRGenericHandController protected () extends WebXRAbstractMotionController {
    /**
      * Create a new hand controller object, without loading a controller model
      * @param scene the scene to use to create this controller
      * @param gamepadObject the corresponding gamepad object
      * @param handedness the handedness of the controller
      */
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    
    /* protected */ def _updateModel(): Unit = js.native
  }
}
