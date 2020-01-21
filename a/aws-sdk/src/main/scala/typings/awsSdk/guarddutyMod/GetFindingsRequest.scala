package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * IDs of the findings that you want to retrieve.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds = js.native
  /**
    * Represents the criteria used for sorting findings.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.SortCriteria] = js.native
}

object GetFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds, SortCriteria: SortCriteria = null): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
}

