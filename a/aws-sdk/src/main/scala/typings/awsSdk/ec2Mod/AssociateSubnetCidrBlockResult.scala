package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSubnetCidrBlockResult extends StObject {
  
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}
object AssociateSubnetCidrBlockResult {
  
  inline def apply(): AssociateSubnetCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSubnetCidrBlockResult]
  }
  
  extension [Self <: AssociateSubnetCidrBlockResult](x: Self) {
    
    inline def setIpv6CidrBlockAssociation(value: SubnetIpv6CidrBlockAssociation): Self = StObject.set(x, "Ipv6CidrBlockAssociation", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockAssociationUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociation", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
