package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesIpv6Address extends StObject {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[typings.awsSdk.ec2Mod.Ipv6Address] = js.undefined
}
object ScheduledInstancesIpv6Address {
  
  inline def apply(): ScheduledInstancesIpv6Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesIpv6Address]
  }
  
  extension [Self <: ScheduledInstancesIpv6Address](x: Self) {
    
    inline def setIpv6Address(value: Ipv6Address): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
  }
}
