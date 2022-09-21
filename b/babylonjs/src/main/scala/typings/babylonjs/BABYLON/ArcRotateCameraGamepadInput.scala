package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcRotateCameraGamepadInput
  extends StObject
     with ICameraInput[ArcRotateCamera] {
  
  /* private */ var _onGamepadConnectedObserver: Any = js.native
  
  /* private */ var _onGamepadDisconnectedObserver: Any = js.native
  
  /* private */ var _yAxisScale: Any = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraGamepadInput: ArcRotateCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraGamepadInput(): Unit = js.native
  
  /**
    * Defines the gamepad the input is gathering event from.
    */
  var gamepad: Nullable[Gamepad] = js.native
  
  /**
    * Defines the gamepad move sensibility.
    * This is the threshold from when moving starts to be accounted for for to prevent jittering.
    */
  var gamepadMoveSensibility: Double = js.native
  
  /**
    * Defines the gamepad rotation sensibility.
    * This is the threshold from when rotation starts to be accounted for to prevent jittering.
    */
  var gamepadRotationSensibility: Double = js.native
  
  /**
    * Gets or sets a boolean indicating that Yaxis (for right stick) should be inverted
    */
  def invertYAxis: Boolean = js.native
  def invertYAxis_=(value: Boolean): Unit = js.native
}
