package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTunnelResponse extends js.Object {
  /**
    * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var destinationAccessToken: js.UndefOr[ClientAccessToken] = js.native
  /**
    * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var sourceAccessToken: js.UndefOr[ClientAccessToken] = js.native
  /**
    * The Amazon Resource Name for the tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * A unique alpha-numeric tunnel ID.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object OpenTunnelResponse {
  @scala.inline
  def apply(): OpenTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelResponse]
  }
  @scala.inline
  implicit class OpenTunnelResponseOps[Self <: OpenTunnelResponse] (val x: Self) extends AnyVal {
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
    def setDestinationAccessToken(value: ClientAccessToken): Self = this.set("destinationAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationAccessToken: Self = this.set("destinationAccessToken", js.undefined)
    @scala.inline
    def setSourceAccessToken(value: ClientAccessToken): Self = this.set("sourceAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAccessToken: Self = this.set("sourceAccessToken", js.undefined)
    @scala.inline
    def setTunnelArn(value: TunnelArn): Self = this.set("tunnelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelArn: Self = this.set("tunnelArn", js.undefined)
    @scala.inline
    def setTunnelId(value: TunnelId): Self = this.set("tunnelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelId: Self = this.set("tunnelId", js.undefined)
  }
  
}

