package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSegmentDetectionFilters extends js.Object {
  /**
    * Filters that are specific to shot detections.
    */
  var ShotFilter: js.UndefOr[StartShotDetectionFilter] = js.native
  /**
    * Filters that are specific to technical cues.
    */
  var TechnicalCueFilter: js.UndefOr[StartTechnicalCueDetectionFilter] = js.native
}

object StartSegmentDetectionFilters {
  @scala.inline
  def apply(): StartSegmentDetectionFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSegmentDetectionFilters]
  }
  @scala.inline
  implicit class StartSegmentDetectionFiltersOps[Self <: StartSegmentDetectionFilters] (val x: Self) extends AnyVal {
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
    def setShotFilter(value: StartShotDetectionFilter): Self = this.set("ShotFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotFilter: Self = this.set("ShotFilter", js.undefined)
    @scala.inline
    def setTechnicalCueFilter(value: StartTechnicalCueDetectionFilter): Self = this.set("TechnicalCueFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTechnicalCueFilter: Self = this.set("TechnicalCueFilter", js.undefined)
  }
  
}

