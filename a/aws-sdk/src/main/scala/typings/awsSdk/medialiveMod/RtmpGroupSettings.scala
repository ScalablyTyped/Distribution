package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RtmpGroupSettings extends js.Object {
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
  def apply(
    AuthenticationScheme: AuthenticationScheme = null,
    CacheFullBehavior: RtmpCacheFullBehavior = null,
    CacheLength: Int | Double = null,
    CaptionData: RtmpCaptionData = null,
    InputLossAction: InputLossActionForRtmpOut = null,
    RestartDelay: Int | Double = null
  ): RtmpGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationScheme != null) __obj.updateDynamic("AuthenticationScheme")(AuthenticationScheme.asInstanceOf[js.Any])
    if (CacheFullBehavior != null) __obj.updateDynamic("CacheFullBehavior")(CacheFullBehavior.asInstanceOf[js.Any])
    if (CacheLength != null) __obj.updateDynamic("CacheLength")(CacheLength.asInstanceOf[js.Any])
    if (CaptionData != null) __obj.updateDynamic("CaptionData")(CaptionData.asInstanceOf[js.Any])
    if (InputLossAction != null) __obj.updateDynamic("InputLossAction")(InputLossAction.asInstanceOf[js.Any])
    if (RestartDelay != null) __obj.updateDynamic("RestartDelay")(RestartDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmpGroupSettings]
  }
}

