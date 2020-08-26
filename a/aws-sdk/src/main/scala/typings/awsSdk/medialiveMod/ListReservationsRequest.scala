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
  def apply(): ListReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsRequest]
  }
  @scala.inline
  implicit class ListReservationsRequestOps[Self <: ListReservationsRequest] (val x: Self) extends AnyVal {
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
    def setChannelClass(value: string): Self = this.set("ChannelClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelClass: Self = this.set("ChannelClass", js.undefined)
    @scala.inline
    def setCodec(value: string): Self = this.set("Codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setMaximumBitrate(value: string): Self = this.set("MaximumBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumBitrate: Self = this.set("MaximumBitrate", js.undefined)
    @scala.inline
    def setMaximumFramerate(value: string): Self = this.set("MaximumFramerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFramerate: Self = this.set("MaximumFramerate", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResolution(value: string): Self = this.set("Resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("Resolution", js.undefined)
    @scala.inline
    def setResourceType(value: string): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setSpecialFeature(value: string): Self = this.set("SpecialFeature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialFeature: Self = this.set("SpecialFeature", js.undefined)
    @scala.inline
    def setVideoQuality(value: string): Self = this.set("VideoQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoQuality: Self = this.set("VideoQuality", js.undefined)
  }
  
}

