package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressRequest extends js.Object {
  
  /**
    * The IP address that you want to use for DNS queries.
    */
  var Ip: js.UndefOr[typings.awsSdk.route53resolverMod.Ip] = js.native
  
  /**
    * The ID of the subnet that contains the IP address. 
    */
  var SubnetId: typings.awsSdk.route53resolverMod.SubnetId = js.native
}
object IpAddressRequest {
  
  @scala.inline
  def apply(SubnetId: SubnetId): IpAddressRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressRequest]
  }
  
  @scala.inline
  implicit class IpAddressRequestOps[Self <: IpAddressRequest] (val x: Self) extends AnyVal {
    
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
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: Ip): Self = this.set("Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("Ip", js.undefined)
  }
}
