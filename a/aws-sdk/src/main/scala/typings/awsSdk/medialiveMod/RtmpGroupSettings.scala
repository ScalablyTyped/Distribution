package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RtmpGroupSettings extends js.Object {
  
  /**
    * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each SCTE-35 message, format it for that marker type, and insert it in the datastream.
    */
  var AdMarkers: js.UndefOr[listOfRtmpAdMarkers] = js.native
  
  /**
    * Authentication scheme to use when connecting with CDN
    */
  var AuthenticationScheme: js.UndefOr[typings.awsSdk.medialiveMod.AuthenticationScheme] = js.native
  
  /**
    * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin accepting data again.
    */
  var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.native
  
  /**
    * Cache length, in seconds, is used to calculate buffer size.
    */
  var CacheLength: js.UndefOr[integerMin30] = js.native
  
  /**
    * Controls the types of data that passes to onCaptionInfo outputs.  If set to 'all' then 608 and 708 carried DTVCC data will be passed.  If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
    */
  var CaptionData: js.UndefOr[RtmpCaptionData] = js.native
  
  /**
    * Controls the behavior of this RTMP group if input becomes unavailable.
  - emitOutput: Emit a slate until input returns.
  - pauseOutput: Stop transmitting data until input returns. This does not close the underlying RTMP connection.
    */
  var InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.native
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0] = js.native
}
object RtmpGroupSettings {
  
  @scala.inline
  def apply(): RtmpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RtmpGroupSettings]
  }
  
  @scala.inline
  implicit class RtmpGroupSettingsOps[Self <: RtmpGroupSettings] (val x: Self) extends AnyVal {
    
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
    def setAdMarkersVarargs(value: RtmpAdMarkers*): Self = this.set("AdMarkers", js.Array(value :_*))
    
    @scala.inline
    def setAdMarkers(value: listOfRtmpAdMarkers): Self = this.set("AdMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdMarkers: Self = this.set("AdMarkers", js.undefined)
    
    @scala.inline
    def setAuthenticationScheme(value: AuthenticationScheme): Self = this.set("AuthenticationScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationScheme: Self = this.set("AuthenticationScheme", js.undefined)
    
    @scala.inline
    def setCacheFullBehavior(value: RtmpCacheFullBehavior): Self = this.set("CacheFullBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheFullBehavior: Self = this.set("CacheFullBehavior", js.undefined)
    
    @scala.inline
    def setCacheLength(value: integerMin30): Self = this.set("CacheLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLength: Self = this.set("CacheLength", js.undefined)
    
    @scala.inline
    def setCaptionData(value: RtmpCaptionData): Self = this.set("CaptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionData: Self = this.set("CaptionData", js.undefined)
    
    @scala.inline
    def setInputLossAction(value: InputLossActionForRtmpOut): Self = this.set("InputLossAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossAction: Self = this.set("InputLossAction", js.undefined)
    
    @scala.inline
    def setRestartDelay(value: integerMin0): Self = this.set("RestartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartDelay: Self = this.set("RestartDelay", js.undefined)
  }
}
