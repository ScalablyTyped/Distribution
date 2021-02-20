package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelRequest extends StObject {
  
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
    * See Channel$tags.
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately. Valid values:    STANDARD: Multiple qualities are generated from the original input, to automatically give viewers the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate can be up to 8.5 Mbps.    BASIC: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.   Default: STANDARD.
    */
  var `type`: js.UndefOr[ChannelType] = js.native
}
object CreateChannelRequest {
  
  @scala.inline
  def apply(): CreateChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit class CreateChannelRequestMutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: ChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
