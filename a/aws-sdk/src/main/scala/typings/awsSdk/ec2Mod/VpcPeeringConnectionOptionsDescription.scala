package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionOptionsDescription extends js.Object {
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to private IP addresses when queried from instances in a peer VPC.
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a local ClassicLink connection can communicate with the peer VPC over the VPC peering connection.
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink connection in the peer VPC over the VPC peering connection.
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.native
}

object VpcPeeringConnectionOptionsDescription {
  @scala.inline
  def apply(
    AllowDnsResolutionFromRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): VpcPeeringConnectionOptionsDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowDnsResolutionFromRemoteVpc)) __obj.updateDynamic("AllowDnsResolutionFromRemoteVpc")(AllowDnsResolutionFromRemoteVpc.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowEgressFromLocalClassicLinkToRemoteVpc)) __obj.updateDynamic("AllowEgressFromLocalClassicLinkToRemoteVpc")(AllowEgressFromLocalClassicLinkToRemoteVpc.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowEgressFromLocalVpcToRemoteClassicLink)) __obj.updateDynamic("AllowEgressFromLocalVpcToRemoteClassicLink")(AllowEgressFromLocalVpcToRemoteClassicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionOptionsDescription]
  }
}

