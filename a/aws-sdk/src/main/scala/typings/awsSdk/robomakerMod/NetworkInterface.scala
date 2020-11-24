package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends js.Object {
  
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[GenericString] = js.native
  
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var privateIpAddress: js.UndefOr[GenericString] = js.native
  
  /**
    * The IPv4 public address of the network interface.
    */
  var publicIpAddress: js.UndefOr[GenericString] = js.native
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetworkInterfaceId(value: GenericString): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: GenericString): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: GenericString): Self = this.set("publicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIpAddress: Self = this.set("publicIpAddress", js.undefined)
  }
}
