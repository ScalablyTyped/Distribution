package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceEnumsMod.PointerInput
import typings.babylonjs.deviceEnumsMod.PointerInput.Horizontal
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelX
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelY
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelZ
import typings.babylonjs.deviceEnumsMod.PointerInput.Vertical
import typings.babylonjs.deviceTypesMod.DeviceInput
import typings.babylonjs.inputInterfacesMod.IDeviceInputSystem
import typings.babylonjs.observableMod.Observable
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceSourceMod {
  
  @JSImport("babylonjs/DeviceInput/InputDevices/deviceSource", "DeviceSource")
  @js.native
  open class DeviceSource[T /* <: DeviceType */] protected () extends StObject {
    /**
      * Default Constructor
      * @param deviceInputSystem - Reference to DeviceInputSystem
      * @param deviceType - Type of device
      * @param deviceSlot - "Slot" or index that device is referenced in
      */
    def this(deviceInputSystem: IDeviceInputSystem, /** Type of device */
    deviceType: T) = this()
    def this(
      deviceInputSystem: IDeviceInputSystem,
      /** Type of device */
    deviceType: T,
      /** "Slot" or index that device is referenced in */
    deviceSlot: Double
    ) = this()
    
    /* private */ val _deviceInputSystem: Any = js.native
    
    /** "Slot" or index that device is referenced in */
    val deviceSlot: Double = js.native
    
    /** Type of device */
    val deviceType: T = js.native
    
    /**
      * Get input for specific input
      * @param inputIndex - index of specific input on device
      * @returns Input value from DeviceInputSystem
      */
    def getInput(inputIndex: DeviceInput[T]): Double = js.native
    
    /**
      * Observable to handle device input changes per device
      */
    val onInputChangedObservable: Observable[DeviceSourceEvent[T]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.deviceInputEventsMod.IPointerEvent
    - typings.babylonjs.deviceInputEventsMod.IWheelEvent
    - typings.babylonjs.deviceInputEventsMod.IKeyboardEvent
  */
  trait DeviceSourceEvent[T /* <: DeviceType */] extends StObject
  object DeviceSourceEvent {
    
    inline def IKeyboardEvent(
      altKey: Boolean,
      code: String,
      ctrlKey: Boolean,
      inputIndex: Double,
      key: String,
      keyCode: Double,
      metaKey: Boolean,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String
    ): typings.babylonjs.deviceInputEventsMod.IKeyboardEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.deviceInputEventsMod.IKeyboardEvent]
    }
    
    inline def IPointerEvent(
      altKey: Boolean,
      button: Double,
      buttons: Double,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      inputIndex: Exclude[PointerInput, Horizontal | Vertical | MouseWheelX | MouseWheelY | MouseWheelZ],
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      offsetX: Double,
      offsetY: Double,
      pageX: Double,
      pageY: Double,
      pointerId: Double,
      pointerType: String,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String,
      x: Double,
      y: Double
    ): typings.babylonjs.deviceInputEventsMod.IPointerEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.deviceInputEventsMod.IPointerEvent]
    }
    
    inline def IWheelEvent(
      altKey: Boolean,
      button: Double,
      buttons: Double,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      deltaMode: Double,
      deltaX: Double,
      deltaY: Double,
      deltaZ: Double,
      inputIndex: MouseWheelX | MouseWheelY | MouseWheelZ,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      offsetX: Double,
      offsetY: Double,
      pageX: Double,
      pageY: Double,
      preventDefault: () => Unit,
      shiftKey: Boolean,
      target: Any,
      `type`: String,
      x: Double,
      y: Double
    ): typings.babylonjs.deviceInputEventsMod.IWheelEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.deviceInputEventsMod.IWheelEvent]
    }
  }
}
