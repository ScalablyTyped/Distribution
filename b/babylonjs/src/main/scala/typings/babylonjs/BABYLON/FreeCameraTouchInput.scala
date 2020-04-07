package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FreeCameraTouchInput")
@js.native
class FreeCameraTouchInput () extends ICameraInput[FreeCamera] {
  var _observer: js.Any = js.native
  var _offsetX: js.Any = js.native
  var _offsetY: js.Any = js.native
  var _onLostFocus: js.Any = js.native
  var _pointerInput: js.Any = js.native
  var _pointerPressed: js.Any = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraTouchInput: FreeCamera = js.native
  /**
    * Defines the touch sensibility for rotation.
    * The higher the faster.
    */
  var touchAngularSensibility: Double = js.native
  /**
    * Defines the touch sensibility for move.
    * The higher the faster.
    */
  var touchMoveSensibility: Double = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraTouchInput(): Unit = js.native
}

