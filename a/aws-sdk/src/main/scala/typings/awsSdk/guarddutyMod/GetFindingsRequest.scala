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
    * The IDs of the findings that you want to retrieve.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds = js.native
  /**
    * Represents the criteria used for sorting findings.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.SortCriteria] = js.native
}

object GetFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
  @scala.inline
  implicit class GetFindingsRequestOps[Self <: GetFindingsRequest] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = this.set("FindingIds", js.Array(value :_*))
    @scala.inline
    def setFindingIds(value: FindingIds): Self = this.set("FindingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = this.set("SortCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCriteria: Self = this.set("SortCriteria", js.undefined)
  }
  
}

