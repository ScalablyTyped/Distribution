package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMinimalMotionControllerObject
import typings.babylonjs.BABYLON.IWebXRMotionControllerAxesValue
import typings.babylonjs.BABYLON.IWebXRMotionControllerComponentChanges
import typings.babylonjs.BABYLON.MotionControllerComponentType
import typings.babylonjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    _buttonIndex: Double,
    _axesIndices: js.Array[Double]
  ) = this()
  /* CompleteClass */
  override var _axes: js.Any = js.native
  /* CompleteClass */
  override var _axesIndices: js.Any = js.native
  /* CompleteClass */
  override var _buttonIndex: js.Any = js.native
  /* CompleteClass */
  override var _changes: js.Any = js.native
  /* CompleteClass */
  override var _currentValue: js.Any = js.native
  /* CompleteClass */
  override var _hasChanges: js.Any = js.native
  /* CompleteClass */
  override var _pressed: js.Any = js.native
  /* CompleteClass */
  override var _touched: js.Any = js.native
  /**
    * the id of this component
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * If axes are available for this component (like a touchpad or thumbstick) the observers will be notified when
    * the axes data changes
    */
  /* CompleteClass */
  override var onAxisValueChangedObservable: typings.babylonjs.BABYLON.Observable[Y] = js.native
  /**
    * Observers registered here will be triggered when the state of a button changes
    * State change is either pressed / touched / value
    */
  /* CompleteClass */
  override var onButtonStateChangedObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.WebXRControllerComponent] = js.native
  /**
    * the type of the component
    */
  /* CompleteClass */
  override var `type`: MotionControllerComponentType = js.native
  /**
    * The current axes data. If this component has no axes it will still return an object { x: 0, y: 0 }
    */
  /* CompleteClass */
  override def axes: IWebXRMotionControllerAxesValue = js.native
  /**
    * Get the changes. Elements will be populated only if they changed with their previous and current value
    */
  /* CompleteClass */
  override def changes: IWebXRMotionControllerComponentChanges = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Return whether or not the component changed the last frame
    */
  /* CompleteClass */
  override def hasChanges: Boolean = js.native
  /**
    * Are there axes correlating to this component
    * @return true is axes data is available
    */
  /* CompleteClass */
  override def isAxes(): Boolean = js.native
  /**
    * Is this component a button (hence - pressable)
    * @returns true if can be pressed
    */
  /* CompleteClass */
  override def isButton(): Boolean = js.native
  /**
    * is the button currently pressed
    */
  /* CompleteClass */
  override def pressed: Boolean = js.native
  /**
    * is the button currently touched
    */
  /* CompleteClass */
  override def touched: Boolean = js.native
  /**
    * update this component using the gamepad object it is in. Called on every frame
    * @param nativeController the native gamepad controller object
    */
  /* CompleteClass */
  override def update(nativeController: IMinimalMotionControllerObject): Unit = js.native
  /**
    * Get the current value of this component
    */
  /* CompleteClass */
  override def value: Double = js.native
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

