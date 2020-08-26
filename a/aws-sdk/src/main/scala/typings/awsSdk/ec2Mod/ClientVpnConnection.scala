package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnConnection extends js.Object {
  /**
    * The IP address of the client.
    */
  var ClientIp: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint to which the client is connected.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The common name associated with the client. This is either the name of the client certificate, or the Active Directory user name.
    */
  var CommonName: js.UndefOr[String] = js.native
  /**
    * The date and time the client connection was terminated.
    */
  var ConnectionEndTime: js.UndefOr[String] = js.native
  /**
    * The date and time the client connection was established.
    */
  var ConnectionEstablishedTime: js.UndefOr[String] = js.native
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.native
  /**
    * The number of bytes received by the client.
    */
  var EgressBytes: js.UndefOr[String] = js.native
  /**
    * The number of packets received by the client.
    */
  var EgressPackets: js.UndefOr[String] = js.native
  /**
    * The number of bytes sent by the client.
    */
  var IngressBytes: js.UndefOr[String] = js.native
  /**
    * The number of packets sent by the client.
    */
  var IngressPackets: js.UndefOr[String] = js.native
  /**
    * The current state of the client connection.
    */
  var Status: js.UndefOr[ClientVpnConnectionStatus] = js.native
  /**
    * The current date and time.
    */
  var Timestamp: js.UndefOr[String] = js.native
  /**
    * The username of the client who established the client connection. This information is only provided if Active Directory client authentication is used.
    */
  var Username: js.UndefOr[String] = js.native
}

object ClientVpnConnection {
  @scala.inline
  def apply(): ClientVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnConnection]
  }
  @scala.inline
  implicit class ClientVpnConnectionOps[Self <: ClientVpnConnection] (val x: Self) extends AnyVal {
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
    def setClientIp(value: String): Self = this.set("ClientIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientIp: Self = this.set("ClientIp", js.undefined)
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    @scala.inline
    def setCommonName(value: String): Self = this.set("CommonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("CommonName", js.undefined)
    @scala.inline
    def setConnectionEndTime(value: String): Self = this.set("ConnectionEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionEndTime: Self = this.set("ConnectionEndTime", js.undefined)
    @scala.inline
    def setConnectionEstablishedTime(value: String): Self = this.set("ConnectionEstablishedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionEstablishedTime: Self = this.set("ConnectionEstablishedTime", js.undefined)
    @scala.inline
    def setConnectionId(value: String): Self = this.set("ConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("ConnectionId", js.undefined)
    @scala.inline
    def setEgressBytes(value: String): Self = this.set("EgressBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressBytes: Self = this.set("EgressBytes", js.undefined)
    @scala.inline
    def setEgressPackets(value: String): Self = this.set("EgressPackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressPackets: Self = this.set("EgressPackets", js.undefined)
    @scala.inline
    def setIngressBytes(value: String): Self = this.set("IngressBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngressBytes: Self = this.set("IngressBytes", js.undefined)
    @scala.inline
    def setIngressPackets(value: String): Self = this.set("IngressPackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngressPackets: Self = this.set("IngressPackets", js.undefined)
    @scala.inline
    def setStatus(value: ClientVpnConnectionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

