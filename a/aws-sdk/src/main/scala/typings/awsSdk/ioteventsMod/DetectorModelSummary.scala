package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModelSummary extends js.Object {
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
}

object DetectorModelSummary {
  @scala.inline
  def apply(): DetectorModelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModelSummary]
  }
  @scala.inline
  implicit class DetectorModelSummaryOps[Self <: DetectorModelSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDetectorModelDescription(value: DetectorModelDescription): Self = this.set("detectorModelDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelDescription: Self = this.set("detectorModelDescription", js.undefined)
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelName: Self = this.set("detectorModelName", js.undefined)
  }
  
}

