package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsStatisticsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Represents the criteria that is used for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.FindingCriteria] = js.native
  /**
    * The types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: typings.awsSdk.guarddutyMod.FindingStatisticTypes = js.native
}

object GetFindingsStatisticsRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    FindingStatisticTypes: FindingStatisticTypes,
    FindingCriteria: FindingCriteria = null
  ): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingStatisticTypes = FindingStatisticTypes.asInstanceOf[js.Any])
    if (FindingCriteria != null) __obj.updateDynamic("FindingCriteria")(FindingCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
}

