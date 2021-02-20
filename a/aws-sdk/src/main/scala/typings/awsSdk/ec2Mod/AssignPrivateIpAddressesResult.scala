package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignPrivateIpAddressesResult extends StObject {
  
  /**
    * The private IP addresses assigned to the network interface.
    */
  var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}
object AssignPrivateIpAddressesResult {
  
  @scala.inline
  def apply(): AssignPrivateIpAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignPrivateIpAddressesResult]
  }
  
  @scala.inline
  implicit class AssignPrivateIpAddressesResultMutableBuilder[Self <: AssignPrivateIpAddressesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedPrivateIpAddresses(value: AssignedPrivateIpAddressList): Self = StObject.set(x, "AssignedPrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedPrivateIpAddressesUndefined: Self = StObject.set(x, "AssignedPrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setAssignedPrivateIpAddressesVarargs(value: AssignedPrivateIpAddress*): Self = StObject.set(x, "AssignedPrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
