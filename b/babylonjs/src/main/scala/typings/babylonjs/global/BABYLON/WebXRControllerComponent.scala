package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.MotionControllerComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRControllerComponent")
@js.native
class WebXRControllerComponent protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRControllerComponent {
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
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: Unit,
    _axesIndices: js.Array[Double]
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRControllerComponent {
  
  @JSGlobal("BABYLON.WebXRControllerComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * button component type
    */
  @JSGlobal("BABYLON.WebXRControllerComponent.BUTTON_TYPE")
  @js.native
  def BUTTON_TYPE: MotionControllerComponentType = js.native
  inline def BUTTON_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * squeeze component type
    */
  @JSGlobal("BABYLON.WebXRControllerComponent.SQUEEZE_TYPE")
  @js.native
  def SQUEEZE_TYPE: MotionControllerComponentType = js.native
  inline def SQUEEZE_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQUEEZE_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * Thumbstick component type
    */
  @JSGlobal("BABYLON.WebXRControllerComponent.THUMBSTICK_TYPE")
  @js.native
  def THUMBSTICK_TYPE: MotionControllerComponentType = js.native
  inline def THUMBSTICK_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBSTICK_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * Touchpad component type
    */
  @JSGlobal("BABYLON.WebXRControllerComponent.TOUCHPAD_TYPE")
  @js.native
  def TOUCHPAD_TYPE: MotionControllerComponentType = js.native
  inline def TOUCHPAD_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCHPAD_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * trigger component type
    */
  @JSGlobal("BABYLON.WebXRControllerComponent.TRIGGER_TYPE")
  @js.native
  def TRIGGER_TYPE: MotionControllerComponentType = js.native
  inline def TRIGGER_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER_TYPE")(x.asInstanceOf[js.Any])
}
