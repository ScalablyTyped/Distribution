package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends babylonjs.BABYLON.DeviceType.Keyboard | babylonjs.BABYLON.DeviceType.Generic ? number : T extends babylonjs.BABYLON.DeviceType.Mouse | babylonjs.BABYLON.DeviceType.Touch ? std.Exclude<babylonjs.BABYLON.PointerInput, babylonjs.BABYLON.PointerInput.Move | babylonjs.BABYLON.PointerInput.MouseWheelX | babylonjs.BABYLON.PointerInput.MouseWheelY | babylonjs.BABYLON.PointerInput.MouseWheelZ> : T extends babylonjs.BABYLON.DeviceType.DualShock ? babylonjs.BABYLON.DualShockInput : T extends babylonjs.BABYLON.DeviceType.Xbox ? babylonjs.BABYLON.XboxInput : T extends babylonjs.BABYLON.DeviceType.Switch ? babylonjs.BABYLON.SwitchInput : T extends babylonjs.BABYLON.DeviceType.DualSense ? babylonjs.BABYLON.DualSenseInput : never
  }}}
  */
@js.native
trait DeviceInput[T /* <: DeviceType */] extends StObject
