package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gender extends js.Object {
  /**
    * Level of confidence in the prediction.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The predicted gender of the face.
    */
  var Value: js.UndefOr[GenderType] = js.native
}

object Gender {
  @scala.inline
  def apply(): Gender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gender]
  }
  @scala.inline
  implicit class GenderOps[Self <: Gender] (val x: Self) extends AnyVal {
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
    def setValue(value: GenderType): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

