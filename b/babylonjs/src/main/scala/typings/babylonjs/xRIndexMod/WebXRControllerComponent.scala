package typings.babylonjs.xRIndexMod

import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRControllerComponent")
@js.native
class WebXRControllerComponent protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXRControllerComponent {
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
object WebXRControllerComponent {
  
  @JSImport("babylonjs/XR/index", "WebXRControllerComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * button component type
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerComponent.BUTTON_TYPE")
  @js.native
  def BUTTON_TYPE: MotionControllerComponentType = js.native
  @scala.inline
  def BUTTON_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * squeeze component type
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerComponent.SQUEEZE_TYPE")
  @js.native
  def SQUEEZE_TYPE: MotionControllerComponentType = js.native
  @scala.inline
  def SQUEEZE_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQUEEZE_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * Thumbstick component type
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerComponent.THUMBSTICK_TYPE")
  @js.native
  def THUMBSTICK_TYPE: MotionControllerComponentType = js.native
  @scala.inline
  def THUMBSTICK_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBSTICK_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * Touchpad component type
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerComponent.TOUCHPAD_TYPE")
  @js.native
  def TOUCHPAD_TYPE: MotionControllerComponentType = js.native
  @scala.inline
  def TOUCHPAD_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCHPAD_TYPE")(x.asInstanceOf[js.Any])
  
  /**
    * trigger component type
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerComponent.TRIGGER_TYPE")
  @js.native
  def TRIGGER_TYPE: MotionControllerComponentType = js.native
  @scala.inline
  def TRIGGER_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER_TYPE")(x.asInstanceOf[js.Any])
}
