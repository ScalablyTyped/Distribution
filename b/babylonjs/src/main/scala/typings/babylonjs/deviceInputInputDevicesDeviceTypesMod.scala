package typings.babylonjs

import typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputInputDevicesDeviceTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Keyboard | babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Generic ? number : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Mouse | babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Touch ? std.Exclude<babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.PointerInput, babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.PointerInput.Move | babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.PointerInput.MouseWheelX | babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.PointerInput.MouseWheelY | babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.PointerInput.MouseWheelZ> : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.DualShock ? babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DualShockInput : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Xbox ? babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.XboxInput : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.Switch ? babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.SwitchInput : T extends babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DeviceType.DualSense ? babylonjs.babylonjs/DeviceInput/InputDevices/deviceEnums.DualSenseInput : never
    }}}
    */
  @js.native
  trait DeviceInput[T /* <: DeviceType */] extends StObject
}
