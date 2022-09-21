package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputEventsMod.IUIEvent
import typings.babylonjs.inputInterfacesMod.IDeviceInputSystem
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventFactoryMod {
  
  @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory")
  @js.native
  open class DeviceEventFactory () extends StObject
  /* static members */
  object DeviceEventFactory {
    
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create device input events based on provided type and slot
      *
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      * @param currentState Current value for given input
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param elementToAttachTo HTMLElement to reference as target for inputs
      * @returns IUIEvent object
      */
    inline def CreateDeviceEvent(
      deviceType: DeviceType,
      deviceSlot: Double,
      inputIndex: Double,
      currentState: Nullable[Double],
      deviceInputSystem: IDeviceInputSystem
    ): IUIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDeviceEvent")(deviceType.asInstanceOf[js.Any], deviceSlot.asInstanceOf[js.Any], inputIndex.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], deviceInputSystem.asInstanceOf[js.Any])).asInstanceOf[IUIEvent]
    inline def CreateDeviceEvent(
      deviceType: DeviceType,
      deviceSlot: Double,
      inputIndex: Double,
      currentState: Nullable[Double],
      deviceInputSystem: IDeviceInputSystem,
      elementToAttachTo: Any
    ): IUIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDeviceEvent")(deviceType.asInstanceOf[js.Any], deviceSlot.asInstanceOf[js.Any], inputIndex.asInstanceOf[js.Any], currentState.asInstanceOf[js.Any], deviceInputSystem.asInstanceOf[js.Any], elementToAttachTo.asInstanceOf[js.Any])).asInstanceOf[IUIEvent]
    
    /**
      * Add parameters for non-character keys (Ctrl, Alt, Meta, Shift)
      * @param evt Event object to add parameters to
      * @param deviceInputSystem DeviceInputSystem to pull values from
      */
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory._CheckNonCharacterKeys")
    @js.native
    def _CheckNonCharacterKeys: Any = js.native
    inline def _CheckNonCharacterKeys_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CheckNonCharacterKeys")(x.asInstanceOf[js.Any])
    
    /**
      * Create base event object
      * @param elementToAttachTo Value to use as event target
      * @returns
      */
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory._CreateEvent")
    @js.native
    def _CreateEvent: Any = js.native
    inline def _CreateEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateEvent")(x.asInstanceOf[js.Any])
    
    /**
      * Create Keyboard Event
      * @param inputIndex Id of input to be checked
      * @param currentState Current value for given input
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param elementToAttachTo HTMLElement to reference as target for inputs
      * @returns IEvent object (Keyboard)
      */
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory._CreateKeyboardEvent")
    @js.native
    def _CreateKeyboardEvent: Any = js.native
    inline def _CreateKeyboardEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateKeyboardEvent")(x.asInstanceOf[js.Any])
    
    /**
      * Create Mouse Event
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      * @param currentState Current value for given input
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param elementToAttachTo HTMLElement to reference as target for inputs
      * @returns IUIEvent object (Mouse)
      */
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory._CreateMouseEvent")
    @js.native
    def _CreateMouseEvent: Any = js.native
    inline def _CreateMouseEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateMouseEvent")(x.asInstanceOf[js.Any])
    
    /**
      * Creates pointer event
      *
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      * @param currentState Current value for given input
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param elementToAttachTo HTMLElement to reference as target for inputs
      * @returns IUIEvent object (Pointer)
      */
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory._CreatePointerEvent")
    @js.native
    def _CreatePointerEvent: Any = js.native
    inline def _CreatePointerEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreatePointerEvent")(x.asInstanceOf[js.Any])
    
    /**
      * Create Mouse Wheel Event
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      * @param inputIndex Id of input to be checked
      * @param currentState Current value for given input
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param elementToAttachTo HTMLElement to reference as target for inputs
      * @returns IUIEvent object (Wheel)
      */
    @JSImport("babylonjs/DeviceInput/eventFactory", "DeviceEventFactory._CreateWheelEvent")
    @js.native
    def _CreateWheelEvent: Any = js.native
    inline def _CreateWheelEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateWheelEvent")(x.asInstanceOf[js.Any])
  }
}
