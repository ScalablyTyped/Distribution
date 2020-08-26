package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTunnelRequest extends js.Object {
  /**
    * A short text description of the tunnel. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The destination configuration for the OpenTunnel request.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  /**
    * A collection of tag metadata.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Timeout configuration for a tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object OpenTunnelRequest {
  @scala.inline
  def apply(): OpenTunnelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelRequest]
  }
  @scala.inline
  implicit class OpenTunnelRequestOps[Self <: OpenTunnelRequest] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = this.set("destinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConfig: Self = this.set("destinationConfig", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeoutConfig(value: TimeoutConfig): Self = this.set("timeoutConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutConfig: Self = this.set("timeoutConfig", js.undefined)
  }
  
}

