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
  
  @scala.inline
  def apply(CapacityReservationSpecification: CapacityReservationSpecification, InstanceId: InstanceId): ModifyInstanceCapacityReservationAttributesRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationSpecification = CapacityReservationSpecification.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
  }
  
  @scala.inline
  implicit class ModifyInstanceCapacityReservationAttributesRequestMutableBuilder[Self <: ModifyInstanceCapacityReservationAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationSpecification(value: CapacityReservationSpecification): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
