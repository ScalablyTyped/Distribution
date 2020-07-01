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
  def apply(
    ShotFilter: StartShotDetectionFilter = null,
    TechnicalCueFilter: StartTechnicalCueDetectionFilter = null
  ): StartSegmentDetectionFilters = {
    val __obj = js.Dynamic.literal()
    if (ShotFilter != null) __obj.updateDynamic("ShotFilter")(ShotFilter.asInstanceOf[js.Any])
    if (TechnicalCueFilter != null) __obj.updateDynamic("TechnicalCueFilter")(TechnicalCueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSegmentDetectionFilters]
  }
}

