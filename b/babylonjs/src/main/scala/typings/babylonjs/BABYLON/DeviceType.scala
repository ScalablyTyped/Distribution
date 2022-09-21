package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceType extends StObject
@JSGlobal("BABYLON.DeviceType")
@js.native
object DeviceType extends StObject {
  
  /** PS5 DualSense */
  @js.native
  sealed trait DualSense
    extends StObject
       with DeviceType
  
  /** PS4 Dual Shock */
  @js.native
  sealed trait DualShock
    extends StObject
       with DeviceType
  
  /** Generic */
  @js.native
  sealed trait Generic
    extends StObject
       with DeviceType
  
  /** Keyboard */
  @js.native
  sealed trait Keyboard
    extends StObject
       with DeviceType
  
  /** Mouse */
  @js.native
  sealed trait Mouse
    extends StObject
       with DeviceType
  
  /** Switch Controller */
  @js.native
  sealed trait Switch
    extends StObject
       with DeviceType
  
  /** Touch Pointers */
  @js.native
  sealed trait Touch
    extends StObject
       with DeviceType
  
  /** Xbox */
  @js.native
  sealed trait Xbox
    extends StObject
       with DeviceType
}
