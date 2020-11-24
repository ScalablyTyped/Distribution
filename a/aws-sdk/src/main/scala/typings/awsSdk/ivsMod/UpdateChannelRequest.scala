package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChannelRequest extends js.Object {
  
  /**
    * ARN of the channel to be updated.
    */
  var arn: ChannelArn = js.native
  
  /**
    * Whether the channel is authorized. Default: false.
    */
  var authorized: js.UndefOr[Boolean] = js.native
  
  /**
    * Channel latency mode. Default: LOW.
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.native
  
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.native
  
  /**
    * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately. Valid values:    STANDARD: Multiple qualities are generated from the original input, to automatically give viewers the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate can be up to 8.5 Mbps.    BASIC: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.   Default: STANDARD.
    */
  var `type`: js.UndefOr[ChannelType] = js.native
}
object UpdateChannelRequest {
  
  @scala.inline
  def apply(arn: ChannelArn): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelRequestOps[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ChannelArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorized(value: Boolean): Self = this.set("authorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorized: Self = this.set("authorized", js.undefined)
    
    @scala.inline
    def setLatencyMode(value: ChannelLatencyMode): Self = this.set("latencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyMode: Self = this.set("latencyMode", js.undefined)
    
    @scala.inline
    def setName(value: ChannelName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: ChannelType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
