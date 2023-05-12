package typings.babylonjs

import typings.babylonjs.camerasCameraInputsManagerMod.ICameraInput
import typings.babylonjs.camerasFlyCameraMod.FlyCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsFlyCameraMouseInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/flyCameraMouseInput", "FlyCameraMouseInput")
  @js.native
  /**
    * Listen to mouse events to control the camera.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/customizingCameraInputs
    */
  open class FlyCameraMouseInput ()
    extends StObject
       with ICameraInput[FlyCamera] {
    
    /* private */ var _element: Any = js.native
    
    /* private */ var _noPreventDefault: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _pointerInput: Any = js.native
    
    /* private */ var _previousPosition: Any = js.native
    
    /* private */ var _rollObserver: Any = js.native
    
    /**
      * Rotate camera by mouse offset.
      * @param offsetX
      * @param offsetY
      */
    /* private */ var _rotateCamera: Any = js.native
    
    /**
      * Detect if any button is being pressed while mouse is moved.
      * -1 = Mouse locked.
      * 0 = Left button.
      * 1 = Middle Button.
      * 2 = Right Button.
      */
    var activeButton: Double = js.native
    
    /**
      * Defines the pointer's angular sensibility, to control the camera rotation speed.
      * Higher values reduce its sensitivity.
      */
    var angularSensibility: Double = js.native
    
    /**
      * Defines the buttons associated with the input to handle camera rotation.
      */
    var buttons: js.Array[Double] = js.native
    
    /**
      * Assign buttons for Pitch control.
      */
    var buttonsPitch: js.Array[Double] = js.native
    
    /**
      * Assign buttons for Roll control.
      */
    var buttonsRoll: js.Array[Double] = js.native
    
    /**
      * Assign buttons for Yaw control.
      */
    var buttonsYaw: js.Array[Double] = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FlyCameraMouseInput: FlyCamera = js.native
    
    /**
      * Defines if touch is enabled. (Default is true.)
      */
    var touchEnabled: Boolean = js.native
  }
}
