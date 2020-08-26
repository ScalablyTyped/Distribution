package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectModerationLabelsResponse extends js.Object {
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopActivationOutput] = js.native
  /**
    * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were detected.
    */
  var ModerationLabels: js.UndefOr[typings.awsSdk.rekognitionMod.ModerationLabels] = js.native
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
}

object DetectModerationLabelsResponse {
  @scala.inline
  def apply(): DetectModerationLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectModerationLabelsResponse]
  }
  @scala.inline
  implicit class DetectModerationLabelsResponseOps[Self <: DetectModerationLabelsResponse] (val x: Self) extends AnyVal {
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
    def setHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = this.set("HumanLoopActivationOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopActivationOutput: Self = this.set("HumanLoopActivationOutput", js.undefined)
    @scala.inline
    def setModerationLabelsVarargs(value: ModerationLabel*): Self = this.set("ModerationLabels", js.Array(value :_*))
    @scala.inline
    def setModerationLabels(value: ModerationLabels): Self = this.set("ModerationLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModerationLabels: Self = this.set("ModerationLabels", js.undefined)
    @scala.inline
    def setModerationModelVersion(value: String): Self = this.set("ModerationModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModerationModelVersion: Self = this.set("ModerationModelVersion", js.undefined)
  }
  
}

