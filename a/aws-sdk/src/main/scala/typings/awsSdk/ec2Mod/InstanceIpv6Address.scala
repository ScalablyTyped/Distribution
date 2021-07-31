package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIpv6Address extends StObject {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.undefined
}
object InstanceIpv6Address {
  
  @scala.inline
  def apply(): InstanceIpv6Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv6Address]
  }
  
  @scala.inline
  implicit class InstanceIpv6AddressMutableBuilder[Self <: InstanceIpv6Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
  }
}
