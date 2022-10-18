package typings.babylonjs

import typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputInputDevicesDeviceTypesMod.DeviceInput
import typings.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputInputDevicesDeviceSourceMod {
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Keyboard ? babylonjs.babylonjs/Events/deviceInputEvents.IKeyboardEvent : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Mouse ? babylonjs.babylonjs/Events/deviceInputEvents.IWheelEvent | babylonjs.babylonjs/Events/deviceInputEvents.IPointerEvent : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Touch ? babylonjs.babylonjs/Events/deviceInputEvents.IPointerEvent : never
    }}}
    */
  @js.native
  trait DeviceSourceEvent[T /* <: DeviceType */] extends StObject
}
