package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetIpv6CidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[SubnetCidrBlockState] = js.undefined
}
object SubnetIpv6CidrBlockAssociation {
  
  inline def apply(): SubnetIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetIpv6CidrBlockAssociation]
  }
  
  extension [Self <: SubnetIpv6CidrBlockAssociation](x: Self) {
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockState(value: SubnetCidrBlockState): Self = StObject.set(x, "Ipv6CidrBlockState", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockStateUndefined: Self = StObject.set(x, "Ipv6CidrBlockState", js.undefined)
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
  }
}
