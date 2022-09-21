package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceEnumsMod.PointerInput
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelX
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelY
import typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelZ
import typings.babylonjs.deviceEnumsMod.PointerInput.Move
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.deviceEnumsMod.DualSenseInput
    - typings.babylonjs.deviceEnumsMod.SwitchInput
    - typings.babylonjs.deviceEnumsMod.XboxInput
    - typings.babylonjs.deviceEnumsMod.DualShockInput
    - typings.std.Exclude[
  typings.babylonjs.deviceEnumsMod.PointerInput, 
  typings.babylonjs.deviceEnumsMod.PointerInput.Move | typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelX | typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelY | typings.babylonjs.deviceEnumsMod.PointerInput.MouseWheelZ]
    - scala.Double
  */
  type DeviceInput[T /* <: DeviceType */] = _DeviceInput[T] | (Exclude[PointerInput, Move | MouseWheelX | MouseWheelY | MouseWheelZ]) | Double
  
  trait _DeviceInput[T /* <: DeviceType */] extends StObject
}
