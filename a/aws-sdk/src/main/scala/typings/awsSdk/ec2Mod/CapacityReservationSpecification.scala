package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservationSpecification extends StObject {
  
  /**
    * Indicates the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs as an On-Demand Instance.  
    */
  var CapacityReservationPreference: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationPreference] = js.undefined
  
  /**
    * Information about the target Capacity Reservation or Capacity Reservation group.
    */
  var CapacityReservationTarget: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationTarget] = js.undefined
}
object CapacityReservationSpecification {
  
  inline def apply(): CapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationSpecification]
  }
  
  extension [Self <: CapacityReservationSpecification](x: Self) {
    
    inline def setCapacityReservationPreference(value: CapacityReservationPreference): Self = StObject.set(x, "CapacityReservationPreference", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationPreferenceUndefined: Self = StObject.set(x, "CapacityReservationPreference", js.undefined)
    
    inline def setCapacityReservationTarget(value: CapacityReservationTarget): Self = StObject.set(x, "CapacityReservationTarget", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationTargetUndefined: Self = StObject.set(x, "CapacityReservationTarget", js.undefined)
  }
}
