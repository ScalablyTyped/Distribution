package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringConnectionOptionsRequest extends js.Object {
  
  /**
    * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC using ClassicLink to instances in a peer VPC.
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to a peer VPC using ClassicLink.
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.native
}
object PeeringConnectionOptionsRequest {
  
  @scala.inline
  def apply(): PeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringConnectionOptionsRequest]
  }
  
  @scala.inline
  implicit class PeeringConnectionOptionsRequestOps[Self <: PeeringConnectionOptionsRequest] (val x: Self) extends AnyVal {
    
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
