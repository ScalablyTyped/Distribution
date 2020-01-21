package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVPCFromHostedZoneRequest extends js.Object {
  /**
    *  Optional: A comment about the disassociation request.
    */
  var Comment: js.UndefOr[DisassociateVPCComment] = js.native
  /**
    * The ID of the private hosted zone that you want to disassociate a VPC from.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * A complex type that contains information about the VPC that you're disassociating from the specified hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}

object DisassociateVPCFromHostedZoneRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC, Comment: DisassociateVPCComment = null): DisassociateVPCFromHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneRequest]
  }
}

