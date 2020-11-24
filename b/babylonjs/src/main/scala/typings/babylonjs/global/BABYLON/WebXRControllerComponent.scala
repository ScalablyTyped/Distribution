package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.MotionControllerComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRControllerComponent")
@js.native
class WebXRControllerComponent protected ()
  extends typings.babylonjs.BABYLON.WebXRControllerComponent {
  /**
    * Creates a new component for a motion controller.
    * It is created by the motion controller itself
    *
    * @param id the id of this component
    * @param type the type of the component
    * @param _buttonIndex index in the buttons array of the gamepad
    * @param _axesIndices indices of the values in the axes array of the gamepad
    */
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType
  ) = this()
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: Double
  ) = this()
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: js.UndefOr[scala.Nothing],
    _axesIndices: js.Array[Double]
  ) = this()
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: Double,
    _axesIndices: js.Array[Double]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.WebXRControllerComponent")
@js.native
object WebXRControllerComponent extends js.Object {
  
  /**
    * button component type
    */
  var BUTTON_TYPE: MotionControllerComponentType = js.native
  
  /**
    * squeeze component type
    */
  var SQUEEZE_TYPE: MotionControllerComponentType = js.native
  
  /**
    * Thumbstick component type
    */
  var THUMBSTICK_TYPE: MotionControllerComponentType = js.native
  
  /**
    * Touchpad component type
    */
  var TOUCHPAD_TYPE: MotionControllerComponentType = js.native
  
  /**
    * trigger component type
    */
  var TRIGGER_TYPE: MotionControllerComponentType = js.native
}
