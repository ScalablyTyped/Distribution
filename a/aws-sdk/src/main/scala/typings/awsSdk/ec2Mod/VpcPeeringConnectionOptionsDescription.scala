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
  def apply(): VpcPeeringConnectionOptionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionOptionsDescription]
  }
  @scala.inline
  implicit class VpcPeeringConnectionOptionsDescriptionOps[Self <: VpcPeeringConnectionOptionsDescription] (val x: Self) extends AnyVal {
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
    def setAllowDnsResolutionFromRemoteVpc(value: Boolean): Self = this.set("AllowDnsResolutionFromRemoteVpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDnsResolutionFromRemoteVpc: Self = this.set("AllowDnsResolutionFromRemoteVpc", js.undefined)
    @scala.inline
    def setAllowEgressFromLocalClassicLinkToRemoteVpc(value: Boolean): Self = this.set("AllowEgressFromLocalClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEgressFromLocalClassicLinkToRemoteVpc: Self = this.set("AllowEgressFromLocalClassicLinkToRemoteVpc", js.undefined)
    @scala.inline
    def setAllowEgressFromLocalVpcToRemoteClassicLink(value: Boolean): Self = this.set("AllowEgressFromLocalVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEgressFromLocalVpcToRemoteClassicLink: Self = this.set("AllowEgressFromLocalVpcToRemoteClassicLink", js.undefined)
  }
  
}

