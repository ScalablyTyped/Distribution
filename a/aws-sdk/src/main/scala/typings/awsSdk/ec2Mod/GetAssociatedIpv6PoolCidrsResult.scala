package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedIpv6PoolCidrsResult extends StObject {
  
  /**
    * Information about the IPv6 CIDR block associations.
    */
  var Ipv6CidrAssociations: js.UndefOr[Ipv6CidrAssociationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetAssociatedIpv6PoolCidrsResult {
  
  inline def apply(): GetAssociatedIpv6PoolCidrsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedIpv6PoolCidrsResult]
  }
  
  extension [Self <: GetAssociatedIpv6PoolCidrsResult](x: Self) {
    
    inline def setIpv6CidrAssociations(value: Ipv6CidrAssociationSet): Self = StObject.set(x, "Ipv6CidrAssociations", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrAssociationsUndefined: Self = StObject.set(x, "Ipv6CidrAssociations", js.undefined)
    
    inline def setIpv6CidrAssociationsVarargs(value: Ipv6CidrAssociation*): Self = StObject.set(x, "Ipv6CidrAssociations", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
