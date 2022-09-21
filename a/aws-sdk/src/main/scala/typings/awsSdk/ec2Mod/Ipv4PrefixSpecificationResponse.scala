package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv4PrefixSpecificationResponse extends StObject {
  
  /**
    * One or more IPv4 delegated prefixes assigned to the network interface.
    */
  var Ipv4Prefix: js.UndefOr[String] = js.undefined
}
object Ipv4PrefixSpecificationResponse {
  
  inline def apply(): Ipv4PrefixSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv4PrefixSpecificationResponse]
  }
  
  extension [Self <: Ipv4PrefixSpecificationResponse](x: Self) {
    
    inline def setIpv4Prefix(value: String): Self = StObject.set(x, "Ipv4Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixUndefined: Self = StObject.set(x, "Ipv4Prefix", js.undefined)
  }
}
