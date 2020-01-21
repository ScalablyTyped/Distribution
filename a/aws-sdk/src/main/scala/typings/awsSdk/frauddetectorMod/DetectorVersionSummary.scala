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
  def apply(
    description: description = null,
    detectorVersionId: nonEmptyString = null,
    lastUpdatedTime: time = null,
    status: DetectorVersionStatus = null
  ): DetectorVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detectorVersionId != null) __obj.updateDynamic("detectorVersionId")(detectorVersionId.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorVersionSummary]
  }
}

