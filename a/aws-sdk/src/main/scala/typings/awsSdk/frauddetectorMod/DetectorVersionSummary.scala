package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorVersionSummary extends js.Object {
  /**
    * The detector version description. 
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  /**
    * Timestamp of when the detector version was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The detector version status. 
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}

object DetectorVersionSummary {
  @scala.inline
  def apply(): DetectorVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorVersionSummary]
  }
  @scala.inline
  implicit class DetectorVersionSummaryOps[Self <: DetectorVersionSummary] (val x: Self) extends AnyVal {
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
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetectorVersionId(value: nonEmptyString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorVersionId: Self = this.set("detectorVersionId", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setStatus(value: DetectorVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

