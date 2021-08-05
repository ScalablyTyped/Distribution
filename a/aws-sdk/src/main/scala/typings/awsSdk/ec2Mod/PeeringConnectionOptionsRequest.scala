package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeeringConnectionOptionsRequest extends StObject {
  
  /**
    * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC using ClassicLink to instances in a peer VPC.
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to a peer VPC using ClassicLink.
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}
object PeeringConnectionOptionsRequest {
  
  inline def apply(): PeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringConnectionOptionsRequest]
  }
  
  extension [Self <: PeeringConnectionOptionsRequest](x: Self) {
    
    inline def setAllowDnsResolutionFromRemoteVpc(value: Boolean): Self = StObject.set(x, "AllowDnsResolutionFromRemoteVpc", value.asInstanceOf[js.Any])
    
    inline def setAllowDnsResolutionFromRemoteVpcUndefined: Self = StObject.set(x, "AllowDnsResolutionFromRemoteVpc", js.undefined)
    
    inline def setAllowEgressFromLocalClassicLinkToRemoteVpc(value: Boolean): Self = StObject.set(x, "AllowEgressFromLocalClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    
    inline def setAllowEgressFromLocalClassicLinkToRemoteVpcUndefined: Self = StObject.set(x, "AllowEgressFromLocalClassicLinkToRemoteVpc", js.undefined)
    
    inline def setAllowEgressFromLocalVpcToRemoteClassicLink(value: Boolean): Self = StObject.set(x, "AllowEgressFromLocalVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    
    inline def setAllowEgressFromLocalVpcToRemoteClassicLinkUndefined: Self = StObject.set(x, "AllowEgressFromLocalVpcToRemoteClassicLink", js.undefined)
  }
}
