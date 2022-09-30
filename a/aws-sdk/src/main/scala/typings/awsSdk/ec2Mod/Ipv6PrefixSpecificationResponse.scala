package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6PrefixSpecificationResponse extends StObject {
  
  /**
    * The IPv6 delegated prefixes assigned to the network interface.
    */
  var Ipv6Prefix: js.UndefOr[String] = js.undefined
}
object Ipv6PrefixSpecificationResponse {
  
  inline def apply(): Ipv6PrefixSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6PrefixSpecificationResponse]
  }
  
  extension [Self <: Ipv6PrefixSpecificationResponse](x: Self) {
    
    inline def setIpv6Prefix(value: String): Self = StObject.set(x, "Ipv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixUndefined: Self = StObject.set(x, "Ipv6Prefix", js.undefined)
  }
}
