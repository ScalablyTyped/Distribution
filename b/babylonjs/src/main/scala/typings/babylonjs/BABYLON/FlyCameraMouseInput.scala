package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyCameraMouseInput extends ICameraInput[FlyCamera] {
  
  var _observer: js.Any = js.native
  
  var _onMouseMove: js.Any = js.native
  
  var _pointerInput: js.Any = js.native
  
  var _rollObserver: js.Any = js.native
  
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
  
  var element: js.Any = js.native
  
  var noPreventDefault: js.Any = js.native
  
  var previousPosition: js.Any = js.native
  
  /**
    * Rotate camera by mouse offset.
    */
  var rotateCamera: js.Any = js.native
  
  /**
    * Defines if touch is enabled. (Default is true.)
    */
  var touchEnabled: Boolean = js.native
}
