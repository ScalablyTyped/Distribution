package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnectionVpcInfo extends StObject {
  
  /**
    * The IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the IPv4 CIDR blocks for the VPC.
    */
  var CidrBlockSet: js.UndefOr[typings.awsSdk.ec2Mod.CidrBlockSet] = js.undefined
  
  /**
    * The IPv6 CIDR block for the VPC.
    */
  var Ipv6CidrBlockSet: js.UndefOr[typings.awsSdk.ec2Mod.Ipv6CidrBlockSet] = js.undefined
  
  /**
    * The AWS account ID of the VPC owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the VPC peering connection options for the accepter or requester VPC.
    */
  var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.undefined
  
  /**
    * The Region in which the VPC is located.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object VpcPeeringConnectionVpcInfo {
  
  inline def apply(): VpcPeeringConnectionVpcInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionVpcInfo]
  }
  
  extension [Self <: VpcPeeringConnectionVpcInfo](x: Self) {
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockSet(value: CidrBlockSet): Self = StObject.set(x, "CidrBlockSet", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockSetUndefined: Self = StObject.set(x, "CidrBlockSet", js.undefined)
    
    inline def setCidrBlockSetVarargs(value: CidrBlock*): Self = StObject.set(x, "CidrBlockSet", js.Array(value :_*))
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setIpv6CidrBlockSet(value: Ipv6CidrBlockSet): Self = StObject.set(x, "Ipv6CidrBlockSet", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockSet", js.undefined)
    
    inline def setIpv6CidrBlockSetVarargs(value: Ipv6CidrBlock*): Self = StObject.set(x, "Ipv6CidrBlockSet", js.Array(value :_*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPeeringOptions(value: VpcPeeringConnectionOptionsDescription): Self = StObject.set(x, "PeeringOptions", value.asInstanceOf[js.Any])
    
    inline def setPeeringOptionsUndefined: Self = StObject.set(x, "PeeringOptions", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
