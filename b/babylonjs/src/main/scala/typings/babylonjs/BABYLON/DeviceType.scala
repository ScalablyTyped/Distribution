package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceType extends StObject
@JSGlobal("BABYLON.DeviceType")
@js.native
object DeviceType extends StObject {
  
  /** PS4 Dual Shock */
  @js.native
  sealed trait DualShock extends DeviceType
  
  /** Generic */
  @js.native
  sealed trait Generic extends DeviceType
  
  /** Keyboard */
  @js.native
  sealed trait Keyboard extends DeviceType
  
  /** Mouse */
  @js.native
  sealed trait Mouse extends DeviceType
  
  /** Switch Controller */
  @js.native
  sealed trait Switch extends DeviceType
  
  /** Touch Pointers */
  @js.native
  sealed trait Touch extends DeviceType
  
  /** Xbox */
  @js.native
  sealed trait Xbox extends DeviceType
}
