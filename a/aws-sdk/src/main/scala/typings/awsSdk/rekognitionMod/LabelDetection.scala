package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelDetection extends js.Object {
  /**
    * Details about the detected label.
    */
  var Label: js.UndefOr[typings.awsSdk.rekognitionMod.Label] = js.native
  /**
    * Time, in milliseconds from the start of the video, that the label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object LabelDetection {
  @scala.inline
  def apply(): LabelDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelDetection]
  }
  @scala.inline
  implicit class LabelDetectionOps[Self <: LabelDetection] (val x: Self) extends AnyVal {
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
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

