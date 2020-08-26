package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectCustomLabelsResponse extends js.Object {
  /**
    * An array of custom labels detected in the input image.
    */
  var CustomLabels: js.UndefOr[typings.awsSdk.rekognitionMod.CustomLabels] = js.native
}

object DetectCustomLabelsResponse {
  @scala.inline
  def apply(): DetectCustomLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectCustomLabelsResponse]
  }
  @scala.inline
  implicit class DetectCustomLabelsResponseOps[Self <: DetectCustomLabelsResponse] (val x: Self) extends AnyVal {
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
    def setCustomLabelsVarargs(value: CustomLabel*): Self = this.set("CustomLabels", js.Array(value :_*))
    @scala.inline
    def setCustomLabels(value: CustomLabels): Self = this.set("CustomLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabels: Self = this.set("CustomLabels", js.undefined)
  }
  
}

