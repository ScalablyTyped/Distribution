package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLabel extends js.Object {
  /**
    * The confidence that the model has in the detection of the custom label. The range is 0-100. A higher value indicates a higher confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The location of the detected object on the image that corresponds to the custom label. Includes an axis aligned coarse bounding box surrounding the object and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typings.awsSdk.rekognitionMod.Geometry] = js.native
  /**
    * The name of the custom label.
    */
  var Name: js.UndefOr[String] = js.native
}

object CustomLabel {
  @scala.inline
  def apply(): CustomLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLabel]
  }
  @scala.inline
  implicit class CustomLabelOps[Self <: CustomLabel] (val x: Self) extends AnyVal {
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
    def setGeometry(value: Geometry): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("Geometry", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

