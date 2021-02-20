package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateIp extends StObject {
  
  /**
    * The DNS name of the private IP address.
    */
  var privateDnsName: js.UndefOr[Text] = js.native
  
  /**
    * The full IP address of the network inteface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.native
}
object PrivateIp {
  
  @scala.inline
  def apply(): PrivateIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIp]
  }
  
  @scala.inline
  implicit class PrivateIpMutableBuilder[Self <: PrivateIp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateDnsName(value: Text): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "privateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: Text): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
  }
}
