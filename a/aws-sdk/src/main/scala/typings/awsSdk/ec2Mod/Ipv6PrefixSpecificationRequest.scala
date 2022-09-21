package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6PrefixSpecificationRequest extends StObject {
  
  /**
    * The IPv6 prefix.
    */
  var Ipv6Prefix: js.UndefOr[String] = js.undefined
}
object Ipv6PrefixSpecificationRequest {
  
  inline def apply(): Ipv6PrefixSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6PrefixSpecificationRequest]
  }
  
  extension [Self <: Ipv6PrefixSpecificationRequest](x: Self) {
    
    inline def setIpv6Prefix(value: String): Self = StObject.set(x, "Ipv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixUndefined: Self = StObject.set(x, "Ipv6Prefix", js.undefined)
  }
}
