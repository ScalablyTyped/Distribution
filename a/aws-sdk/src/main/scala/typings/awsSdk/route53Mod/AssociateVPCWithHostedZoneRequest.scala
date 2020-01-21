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
  def apply(HostedZoneId: ResourceId, VPC: VPC, Comment: AssociateVPCComment = null): AssociateVPCWithHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVPCWithHostedZoneRequest]
  }
}

