package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends babylonjs.BABYLON.DeviceType.Keyboard ? babylonjs.BABYLON.IKeyboardEvent : T extends babylonjs.BABYLON.DeviceType.Mouse ? babylonjs.BABYLON.IWheelEvent | babylonjs.BABYLON.IPointerEvent : T extends babylonjs.BABYLON.DeviceType.Touch ? babylonjs.BABYLON.IPointerEvent : never
  }}}
  */
@js.native
trait DeviceSourceEvent[T /* <: DeviceType */] extends StObject
