package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoMetadata extends js.Object {
  /**
    * Type of compression used in the analyzed video. 
    */
  var Codec: js.UndefOr[String] = js.native
  /**
    * Length of the video in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  /**
    * Format of the analyzed video. Possible values are MP4, MOV and AVI. 
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * Vertical pixel dimension of the video.
    */
  var FrameHeight: js.UndefOr[ULong] = js.native
  /**
    * Number of frames per second in the video.
    */
  var FrameRate: js.UndefOr[Float] = js.native
  /**
    * Horizontal pixel dimension of the video.
    */
  var FrameWidth: js.UndefOr[ULong] = js.native
}

object VideoMetadata {
  @scala.inline
  def apply(): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMetadata]
  }
  @scala.inline
  implicit class VideoMetadataOps[Self <: VideoMetadata] (val x: Self) extends AnyVal {
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
    def setCodec(value: String): Self = this.set("Codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    @scala.inline
    def setDurationMillis(value: ULong): Self = this.set("DurationMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMillis: Self = this.set("DurationMillis", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setFrameHeight(value: ULong): Self = this.set("FrameHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameHeight: Self = this.set("FrameHeight", js.undefined)
    @scala.inline
    def setFrameRate(value: Float): Self = this.set("FrameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("FrameRate", js.undefined)
    @scala.inline
    def setFrameWidth(value: ULong): Self = this.set("FrameWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameWidth: Self = this.set("FrameWidth", js.undefined)
  }
  
}

