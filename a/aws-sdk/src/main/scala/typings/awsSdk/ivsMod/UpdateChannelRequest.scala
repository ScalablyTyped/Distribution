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
    * Whether the channel is private (enabled for playback authorization).
    */
  var authorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Channel latency mode. Use NORMAL to broadcast and deliver live video up to Full HD. Use LOW for near-real-time interaction with viewers. (Note: In the Amazon IVS console, LOW and NORMAL correspond to Ultra-low and Standard, respectively.)
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined
  
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Recording-configuration ARN. If this is set to an empty string, recording is disabled. A value other than an empty string indicates that recording is enabled
    */
  var recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined
  
  /**
    * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately. Valid values:    STANDARD: Video is transcoded: multiple qualities are generated from the original input, to automatically give viewers the best experience for their devices and network conditions. Transcoding allows higher playback quality across a range of download speeds. Resolution can be up to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for renditions 360p and below; above that, audio is passed through. This is the default.    BASIC: Video is transmuxed: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is limited to the original input. Resolution can be up to 1080p and bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between 480p and 1080p.  
    */
  var `type`: js.UndefOr[ChannelType] = js.undefined
}
object UpdateChannelRequest {
  
  inline def apply(arn: ChannelArn): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  extension [Self <: UpdateChannelRequest](x: Self) {
    
    inline def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    inline def setLatencyMode(value: ChannelLatencyMode): Self = StObject.set(x, "latencyMode", value.asInstanceOf[js.Any])
    
    inline def setLatencyModeUndefined: Self = StObject.set(x, "latencyMode", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecordingConfigurationArn(value: ChannelRecordingConfigurationArn): Self = StObject.set(x, "recordingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setRecordingConfigurationArnUndefined: Self = StObject.set(x, "recordingConfigurationArn", js.undefined)
    
    inline def setType(value: ChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
