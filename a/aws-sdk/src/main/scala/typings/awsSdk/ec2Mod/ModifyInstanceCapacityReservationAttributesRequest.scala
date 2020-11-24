package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceCapacityReservationAttributesRequest extends js.Object {
  
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: typings.awsSdk.ec2Mod.CapacityReservationSpecification = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the instance to be modified.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}
object ModifyInstanceCapacityReservationAttributesRequest {
  
  @scala.inline
  def apply(CapacityReservationSpecification: CapacityReservationSpecification, InstanceId: InstanceId): ModifyInstanceCapacityReservationAttributesRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationSpecification = CapacityReservationSpecification.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
  }
  
  @scala.inline
  implicit class ModifyInstanceCapacityReservationAttributesRequestOps[Self <: ModifyInstanceCapacityReservationAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacityReservationSpecification(value: CapacityReservationSpecification): Self = this.set("CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
