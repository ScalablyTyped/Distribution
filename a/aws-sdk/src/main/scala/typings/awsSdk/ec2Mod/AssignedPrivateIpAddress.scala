package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedPrivateIpAddress extends StObject {
  
  /**
    * The private IP address assigned to the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}
object AssignedPrivateIpAddress {
  
  @scala.inline
  def apply(): AssignedPrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedPrivateIpAddress]
  }
  
  @scala.inline
  implicit class AssignedPrivateIpAddressMutableBuilder[Self <: AssignedPrivateIpAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
