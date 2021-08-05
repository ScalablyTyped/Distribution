package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateVpcCidrBlockResult extends StObject {
  
  /**
    * Information about the IPv4 CIDR block association.
    */
  var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.undefined
  
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DisassociateVpcCidrBlockResult {
  
  inline def apply(): DisassociateVpcCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateVpcCidrBlockResult]
  }
  
  extension [Self <: DisassociateVpcCidrBlockResult](x: Self) {
    
    inline def setCidrBlockAssociation(value: VpcCidrBlockAssociation): Self = StObject.set(x, "CidrBlockAssociation", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockAssociationUndefined: Self = StObject.set(x, "CidrBlockAssociation", js.undefined)
    
    inline def setIpv6CidrBlockAssociation(value: VpcIpv6CidrBlockAssociation): Self = StObject.set(x, "Ipv6CidrBlockAssociation", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockAssociationUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociation", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
