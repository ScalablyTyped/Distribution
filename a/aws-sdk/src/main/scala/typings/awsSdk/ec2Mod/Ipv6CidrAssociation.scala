package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6CidrAssociation extends StObject {
  
  /**
    * The resource that's associated with the IPv6 CIDR block.
    */
  var AssociatedResource: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6Cidr: js.UndefOr[String] = js.undefined
}
object Ipv6CidrAssociation {
  
  inline def apply(): Ipv6CidrAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6CidrAssociation]
  }
  
  extension [Self <: Ipv6CidrAssociation](x: Self) {
    
    inline def setAssociatedResource(value: String): Self = StObject.set(x, "AssociatedResource", value.asInstanceOf[js.Any])
    
    inline def setAssociatedResourceUndefined: Self = StObject.set(x, "AssociatedResource", js.undefined)
    
    inline def setIpv6Cidr(value: String): Self = StObject.set(x, "Ipv6Cidr", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrUndefined: Self = StObject.set(x, "Ipv6Cidr", js.undefined)
  }
}
