package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCAssociationAuthorizationRequest extends js.Object {
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * A complex type that contains the VPC ID and region for the VPC that you want to authorize associating with your hosted zone.
    */
  var VPC: typings.awsSdk.route53Mod.VPC = js.native
}

object CreateVPCAssociationAuthorizationRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationRequest]
  }
}

