package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateVPCWithHostedZoneRequest extends js.Object {
  /**
    *  Optional: A comment about the association request.
    */
  var Comment: js.UndefOr[AssociateVPCComment] = js.native
  /**
    * The ID of the private hosted zone that you want to associate an Amazon VPC with. Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}

object AssociateVPCWithHostedZoneRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): AssociateVPCWithHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVPCWithHostedZoneRequest]
  }
  @scala.inline
  implicit class AssociateVPCWithHostedZoneRequestOps[Self <: AssociateVPCWithHostedZoneRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setComment(value: AssociateVPCComment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
  
}

