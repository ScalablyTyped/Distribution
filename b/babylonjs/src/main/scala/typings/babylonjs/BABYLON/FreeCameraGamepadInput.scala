package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraGamepadInput extends ICameraInput[FreeCamera] {
  
  var _cameraTransform: js.Any = js.native
  
  var _deltaTransform: js.Any = js.native
  
  var _onGamepadConnectedObserver: js.Any = js.native
  
  var _onGamepadDisconnectedObserver: js.Any = js.native
  
  var _vector2: js.Any = js.native
  
  var _vector3: js.Any = js.native
  
  var _yAxisScale: js.Any = js.native
  
  /**
    * Define the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraGamepadInput: FreeCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraGamepadInput(): Unit = js.native
  
  /**
    * Define the Gamepad controlling the input
    */
  var gamepad: Nullable[Gamepad] = js.native
  
  /**
    * Defines the gamepad rotation sensiblity.
    * This is the threshold from when rotation starts to be accounted for to prevent jittering.
    */
  var gamepadAngularSensibility: Double = js.native
  
  /**
    * Defines the gamepad move sensiblity.
    * This is the threshold from when moving starts to be accounted for for to prevent jittering.
    */
  var gamepadMoveSensibility: Double = js.native
  
  /**
    * Gets or sets a boolean indicating that Yaxis (for right stick) should be inverted
    */
  def invertYAxis: Boolean = js.native
  def invertYAxis_=(value: Boolean): Unit = js.native
}
