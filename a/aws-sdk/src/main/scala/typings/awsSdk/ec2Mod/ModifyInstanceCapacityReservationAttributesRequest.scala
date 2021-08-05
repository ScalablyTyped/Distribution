package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceCapacityReservationAttributesRequest extends StObject {
  
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: typings.awsSdk.ec2Mod.CapacityReservationSpecification
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance to be modified.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId
}
object ModifyInstanceCapacityReservationAttributesRequest {
  
  inline def apply(CapacityReservationSpecification: CapacityReservationSpecification, InstanceId: InstanceId): ModifyInstanceCapacityReservationAttributesRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationSpecification = CapacityReservationSpecification.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
  }
  
  extension [Self <: ModifyInstanceCapacityReservationAttributesRequest](x: Self) {
    
    inline def setCapacityReservationSpecification(value: CapacityReservationSpecification): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
