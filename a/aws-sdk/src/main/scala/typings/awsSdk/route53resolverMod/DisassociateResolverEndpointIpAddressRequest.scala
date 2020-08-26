package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResolverEndpointIpAddressRequest extends js.Object {
  /**
    * The IPv4 address that you want to remove from a resolver endpoint.
    */
  var IpAddress: IpAddressUpdate = js.native
  /**
    * The ID of the resolver endpoint that you want to disassociate an IP address from.
    */
  var ResolverEndpointId: ResourceId = js.native
}

object DisassociateResolverEndpointIpAddressRequest {
  @scala.inline
  def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): DisassociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverEndpointIpAddressRequest]
  }
  @scala.inline
  implicit class DisassociateResolverEndpointIpAddressRequestOps[Self <: DisassociateResolverEndpointIpAddressRequest] (val x: Self) extends AnyVal {
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
    def setIpAddress(value: IpAddressUpdate): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = this.set("ResolverEndpointId", value.asInstanceOf[js.Any])
  }
  
}

