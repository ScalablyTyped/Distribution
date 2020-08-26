package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVPCAssociationAuthorizationRequest extends js.Object {
  /**
    * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account, the ID of the hosted zone.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account, a complex type that includes the ID and region of the VPC.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}

object DeleteVPCAssociationAuthorizationRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): DeleteVPCAssociationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVPCAssociationAuthorizationRequest]
  }
  @scala.inline
  implicit class DeleteVPCAssociationAuthorizationRequestOps[Self <: DeleteVPCAssociationAuthorizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVPC(value: VPC): Self = this.set("VPC", value.asInstanceOf[js.Any])
  }
  
}

