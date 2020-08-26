package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentModerationDetection extends js.Object {
  /**
    * The unsafe content label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typings.awsSdk.rekognitionMod.ModerationLabel] = js.native
  /**
    * Time, in milliseconds from the beginning of the video, that the unsafe content label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object ContentModerationDetection {
  @scala.inline
  def apply(): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentModerationDetection]
  }
  @scala.inline
  implicit class ContentModerationDetectionOps[Self <: ContentModerationDetection] (val x: Self) extends AnyVal {
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
    def setModerationLabel(value: ModerationLabel): Self = this.set("ModerationLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModerationLabel: Self = this.set("ModerationLabel", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

