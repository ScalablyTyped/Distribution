package typings.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIceServerConfigRequest extends js.Object {
  /**
    * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers. 
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * Unique identifier for the viewer. Must be unique within the signaling channel.
    */
  var ClientId: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.ClientId] = js.native
  /**
    * Specifies the desired service. Currently, TURN is the only valid value.
    */
  var Service: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Service] = js.native
  /**
    * An optional user ID to be associated with the credentials.
    */
  var Username: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Username] = js.native
}

object GetIceServerConfigRequest {
  @scala.inline
  def apply(ChannelARN: ResourceARN): GetIceServerConfigRequest = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIceServerConfigRequest]
  }
  @scala.inline
  implicit class GetIceServerConfigRequestOps[Self <: GetIceServerConfigRequest] (val x: Self) extends AnyVal {
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
    def setChannelARN(value: ResourceARN): Self = this.set("ChannelARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    @scala.inline
    def setService(value: Service): Self = this.set("Service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("Service", js.undefined)
    @scala.inline
    def setUsername(value: Username): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

