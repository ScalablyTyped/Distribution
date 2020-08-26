package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emotion extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Type of emotion detected.
    */
  var Type: js.UndefOr[EmotionName] = js.native
}

object Emotion {
  @scala.inline
  def apply(): Emotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emotion]
  }
  @scala.inline
  implicit class EmotionOps[Self <: Emotion] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    @scala.inline
    def setType(value: EmotionName): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

