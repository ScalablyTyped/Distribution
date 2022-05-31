package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import typings.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRHTCViveMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRHTCViveMotionController", "WebXRHTCViveMotionController")
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
    
    /* private */ var _modelRootNode: js.Any = js.native
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  object WebXRHTCViveMotionController {
    
    @JSImport("babylonjs/XR/motionController/webXRHTCViveMotionController", "WebXRHTCViveMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/XR/motionController/webXRHTCViveMotionController", "WebXRHTCViveMotionController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/XR/motionController/webXRHTCViveMotionController", "WebXRHTCViveMotionController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
}
