package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMasterChannelEndpointConfiguration extends js.Object {
  /**
    * This property is used to determine the nature of communication over this SINGLE_MASTER signaling channel. If WSS is specified, this API returns a websocket endpoint. If HTTPS is specified, this API returns an HTTPS endpoint.
    */
  var Protocols: js.UndefOr[ListOfProtocols] = js.native
  /**
    * This property is used to determine messaging permissions in this SINGLE_MASTER signaling channel. If MASTER is specified, this API returns an endpoint that a client can use to receive offers from and send answers to any of the viewers on this signaling channel. If VIEWER is specified, this API returns an endpoint that a client can use only to send offers to another MASTER client on this signaling channel. 
    */
  var Role: js.UndefOr[ChannelRole] = js.native
}

object SingleMasterChannelEndpointConfiguration {
  @scala.inline
  def apply(): SingleMasterChannelEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterChannelEndpointConfiguration]
  }
  @scala.inline
  implicit class SingleMasterChannelEndpointConfigurationOps[Self <: SingleMasterChannelEndpointConfiguration] (val x: Self) extends AnyVal {
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
    def setProtocolsVarargs(value: ChannelProtocol*): Self = this.set("Protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: ListOfProtocols): Self = this.set("Protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("Protocols", js.undefined)
    @scala.inline
    def setRole(value: ChannelRole): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
  }
  
}

