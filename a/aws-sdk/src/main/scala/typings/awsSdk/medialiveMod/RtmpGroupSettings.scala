package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtmpGroupSettings extends StObject {
  
  /**
    * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each SCTE-35 message, format it for that marker type, and insert it in the datastream.
    */
  var AdMarkers: js.UndefOr[listOfRtmpAdMarkers] = js.undefined
  
  /**
    * Authentication scheme to use when connecting with CDN
    */
  var AuthenticationScheme: js.UndefOr[typings.awsSdk.medialiveMod.AuthenticationScheme] = js.undefined
  
  /**
    * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin accepting data again.
    */
  var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.undefined
  
  /**
    * Cache length, in seconds, is used to calculate buffer size.
    */
  var CacheLength: js.UndefOr[integerMin30] = js.undefined
  
  /**
    * Controls the types of data that passes to onCaptionInfo outputs.  If set to 'all' then 608 and 708 carried DTVCC data will be passed.  If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
    */
  var CaptionData: js.UndefOr[RtmpCaptionData] = js.undefined
  
  /**
    * Controls the behavior of this RTMP group if input becomes unavailable.
  - emitOutput: Emit a slate until input returns.
  - pauseOutput: Stop transmitting data until input returns. This does not close the underlying RTMP connection.
    */
  var InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.undefined
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0] = js.undefined
}
object RtmpGroupSettings {
  
  @scala.inline
  def apply(): RtmpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RtmpGroupSettings]
  }
  
  @scala.inline
  implicit class RtmpGroupSettingsMutableBuilder[Self <: RtmpGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdMarkers(value: listOfRtmpAdMarkers): Self = StObject.set(x, "AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkersUndefined: Self = StObject.set(x, "AdMarkers", js.undefined)
    
    @scala.inline
    def setAdMarkersVarargs(value: RtmpAdMarkers*): Self = StObject.set(x, "AdMarkers", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "AuthenticationScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationSchemeUndefined: Self = StObject.set(x, "AuthenticationScheme", js.undefined)
    
    @scala.inline
    def setCacheFullBehavior(value: RtmpCacheFullBehavior): Self = StObject.set(x, "CacheFullBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheFullBehaviorUndefined: Self = StObject.set(x, "CacheFullBehavior", js.undefined)
    
    @scala.inline
    def setCacheLength(value: integerMin30): Self = StObject.set(x, "CacheLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheLengthUndefined: Self = StObject.set(x, "CacheLength", js.undefined)
    
    @scala.inline
    def setCaptionData(value: RtmpCaptionData): Self = StObject.set(x, "CaptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionDataUndefined: Self = StObject.set(x, "CaptionData", js.undefined)
    
    @scala.inline
    def setInputLossAction(value: InputLossActionForRtmpOut): Self = StObject.set(x, "InputLossAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossActionUndefined: Self = StObject.set(x, "InputLossAction", js.undefined)
    
    @scala.inline
    def setRestartDelay(value: integerMin0): Self = StObject.set(x, "RestartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartDelayUndefined: Self = StObject.set(x, "RestartDelay", js.undefined)
  }
}
