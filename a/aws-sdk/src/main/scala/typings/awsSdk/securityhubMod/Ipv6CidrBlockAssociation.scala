package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6CidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
}
object Ipv6CidrBlockAssociation {
  
  inline def apply(): Ipv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6CidrBlockAssociation]
  }
  
  extension [Self <: Ipv6CidrBlockAssociation](x: Self) {
    
    inline def setAssociationId(value: NonEmptyString): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setCidrBlockState(value: NonEmptyString): Self = StObject.set(x, "CidrBlockState", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockStateUndefined: Self = StObject.set(x, "CidrBlockState", js.undefined)
    
    inline def setIpv6CidrBlock(value: NonEmptyString): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
  }
}
