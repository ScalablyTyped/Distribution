package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIpv6Prefix extends StObject {
  
  /**
    * One or more IPv6 prefixes assigned to the network interface.
    */
  var Ipv6Prefix: js.UndefOr[String] = js.undefined
}
object InstanceIpv6Prefix {
  
  inline def apply(): InstanceIpv6Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv6Prefix]
  }
  
  extension [Self <: InstanceIpv6Prefix](x: Self) {
    
    inline def setIpv6Prefix(value: String): Self = StObject.set(x, "Ipv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixUndefined: Self = StObject.set(x, "Ipv6Prefix", js.undefined)
  }
}
