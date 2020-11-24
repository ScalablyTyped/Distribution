package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressUpdate extends js.Object {
  
  /**
    * The new IP address.
    */
  var Ip: js.UndefOr[typings.awsSdk.route53resolverMod.Ip] = js.native
  
  /**
    *  Only when removing an IP address from a Resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.route53resolverMod.SubnetId] = js.native
}
object IpAddressUpdate {
  
  @scala.inline
  def apply(): IpAddressUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressUpdate]
  }
  
  @scala.inline
  implicit class IpAddressUpdateOps[Self <: IpAddressUpdate] (val x: Self) extends AnyVal {
    
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
    def setIp(value: Ip): Self = this.set("Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("Ip", js.undefined)
    
    @scala.inline
    def setIpId(value: ResourceId): Self = this.set("IpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpId: Self = this.set("IpId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
}
