package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientVpnEndpointResult extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
}

object CreateClientVpnEndpointResult {
  @scala.inline
  def apply(): CreateClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientVpnEndpointResult]
  }
  @scala.inline
  implicit class CreateClientVpnEndpointResultOps[Self <: CreateClientVpnEndpointResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    @scala.inline
    def setDnsName(value: String): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    @scala.inline
    def setStatus(value: ClientVpnEndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

