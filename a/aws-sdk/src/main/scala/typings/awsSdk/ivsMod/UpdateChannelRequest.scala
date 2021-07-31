package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * ARN of the channel to be updated.
    */
  var arn: ChannelArn
  
  /**
    * Whether the channel is authorized. Default: false.
    */
  var authorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Channel latency mode. Default: LOW.
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined
  
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately. Valid values:    STANDARD: Multiple qualities are generated from the original input, to automatically give viewers the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate can be up to 8.5 Mbps.    BASIC: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.   Default: STANDARD.
    */
  var `type`: js.UndefOr[ChannelType] = js.undefined
}
object UpdateChannelRequest {
  
  @scala.inline
  def apply(arn: ChannelArn): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelRequestMutableBuilder[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    @scala.inline
    def setLatencyMode(value: ChannelLatencyMode): Self = StObject.set(x, "latencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyModeUndefined: Self = StObject.set(x, "latencyMode", js.undefined)
    
    @scala.inline
    def setName(value: ChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: ChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
