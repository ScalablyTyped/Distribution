package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcInfoPeeringOptionsDetails extends StObject {
  
  /**
    * Indicates whether a local VPC can resolve public DNS hostnames to private IP addresses when queried from instances in a peer VPC. 
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a local ClassicLink connection can communicate with the peer VPC over the VPC peering connection. 
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a local VPC can communicate with a ClassicLink connection in the peer VPC over the VPC peering connection. 
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}
object VpcInfoPeeringOptionsDetails {
  
  inline def apply(): VpcInfoPeeringOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcInfoPeeringOptionsDetails]
  }
  
  extension [Self <: VpcInfoPeeringOptionsDetails](x: Self) {
    
    inline def setAllowDnsResolutionFromRemoteVpc(value: Boolean): Self = StObject.set(x, "AllowDnsResolutionFromRemoteVpc", value.asInstanceOf[js.Any])
    
    inline def setAllowDnsResolutionFromRemoteVpcUndefined: Self = StObject.set(x, "AllowDnsResolutionFromRemoteVpc", js.undefined)
    
    inline def setAllowEgressFromLocalClassicLinkToRemoteVpc(value: Boolean): Self = StObject.set(x, "AllowEgressFromLocalClassicLinkToRemoteVpc", value.asInstanceOf[js.Any])
    
    inline def setAllowEgressFromLocalClassicLinkToRemoteVpcUndefined: Self = StObject.set(x, "AllowEgressFromLocalClassicLinkToRemoteVpc", js.undefined)
    
    inline def setAllowEgressFromLocalVpcToRemoteClassicLink(value: Boolean): Self = StObject.set(x, "AllowEgressFromLocalVpcToRemoteClassicLink", value.asInstanceOf[js.Any])
    
    inline def setAllowEgressFromLocalVpcToRemoteClassicLinkUndefined: Self = StObject.set(x, "AllowEgressFromLocalVpcToRemoteClassicLink", js.undefined)
  }
}
