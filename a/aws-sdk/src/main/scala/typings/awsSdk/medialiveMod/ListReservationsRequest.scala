package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReservationsRequest extends js.Object {
  /**
    * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
    */
  var ChannelClass: js.UndefOr[string] = js.native
  /**
    * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
    */
  var Codec: js.UndefOr[string] = js.native
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  /**
    * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
    */
  var MaximumBitrate: js.UndefOr[string] = js.native
  /**
    * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
    */
  var MaximumFramerate: js.UndefOr[string] = js.native
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
    */
  var Resolution: js.UndefOr[string] = js.native
  /**
    * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[string] = js.native
  /**
    * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  var SpecialFeature: js.UndefOr[string] = js.native
  /**
    * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
    */
  var VideoQuality: js.UndefOr[string] = js.native
}

object ListReservationsRequest {
  @scala.inline
  def apply(
    ChannelClass: string = null,
    Codec: string = null,
    MaxResults: Int | Double = null,
    MaximumBitrate: string = null,
    MaximumFramerate: string = null,
    NextToken: string = null,
    Resolution: string = null,
    ResourceType: string = null,
    SpecialFeature: string = null,
    VideoQuality: string = null
  ): ListReservationsRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MaximumBitrate != null) __obj.updateDynamic("MaximumBitrate")(MaximumBitrate.asInstanceOf[js.Any])
    if (MaximumFramerate != null) __obj.updateDynamic("MaximumFramerate")(MaximumFramerate.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SpecialFeature != null) __obj.updateDynamic("SpecialFeature")(SpecialFeature.asInstanceOf[js.Any])
    if (VideoQuality != null) __obj.updateDynamic("VideoQuality")(VideoQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReservationsRequest]
  }
}

