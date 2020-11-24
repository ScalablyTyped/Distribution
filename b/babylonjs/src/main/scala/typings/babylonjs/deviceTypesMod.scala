package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/DeviceInput/InputDevices/deviceTypes", JSImport.Namespace)
@js.native
object deviceTypesMod extends js.Object {
  
  trait _DeviceInput[T /* <: DeviceType */] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.deviceEnumsMod.SwitchInput
    - typings.babylonjs.deviceEnumsMod.XboxInput
    - typings.babylonjs.deviceEnumsMod.DualShockInput
    - typings.babylonjs.deviceEnumsMod.PointerInput
    - scala.Double
  */
  type DeviceInput[T /* <: DeviceType */] = _DeviceInput[T] | Double
}
