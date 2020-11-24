package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/motionController/webXRHTCViveMotionController", JSImport.Namespace)
@js.native
object webXRHTCViveMotionControllerMod extends js.Object {
  
  @js.native
  class WebXRHTCViveMotionController protected () extends WebXRAbstractMotionController {
    /**
      * Create a new Vive motion controller object
      * @param scene the scene to use to create this controller
      * @param gamepadObject the corresponding gamepad object
      * @param handedness the handedness of the controller
      */
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    
    var _modelRootNode: js.Any = js.native
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  @js.native
  object WebXRHTCViveMotionController extends js.Object {
    
    /**
      * The base url used to load the left and right controller models
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    var MODEL_FILENAME: String = js.native
  }
}
