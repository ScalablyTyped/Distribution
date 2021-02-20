package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceIpv6AddressRequest extends StObject {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.native
}
object InstanceIpv6AddressRequest {
  
  @scala.inline
  def apply(): InstanceIpv6AddressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv6AddressRequest]
  }
  
  @scala.inline
  implicit class InstanceIpv6AddressRequestMutableBuilder[Self <: InstanceIpv6AddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
  }
}
