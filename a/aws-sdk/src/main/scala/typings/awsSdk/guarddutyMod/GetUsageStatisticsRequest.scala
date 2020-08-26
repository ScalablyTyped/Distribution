package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageStatisticsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.guarddutyMod.MaxResults] = js.native
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The currency unit you would like to view your usage statistics in. Current valid values are USD.
    */
  var Unit: js.UndefOr[String] = js.native
  /**
    * Represents the criteria used for querying usage.
    */
  var UsageCriteria: typings.awsSdk.guarddutyMod.UsageCriteria = js.native
  /**
    * The type of usage statistics to retrieve.
    */
  var UsageStatisticType: typings.awsSdk.guarddutyMod.UsageStatisticType = js.native
}

object GetUsageStatisticsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, UsageCriteria: UsageCriteria, UsageStatisticType: UsageStatisticType): GetUsageStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], UsageCriteria = UsageCriteria.asInstanceOf[js.Any], UsageStatisticType = UsageStatisticType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageStatisticsRequest]
  }
  @scala.inline
  implicit class GetUsageStatisticsRequestOps[Self <: GetUsageStatisticsRequest] (val x: Self) extends AnyVal {
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
    def setUsageCriteria(value: UsageCriteria): Self = this.set("UsageCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsageStatisticType(value: UsageStatisticType): Self = this.set("UsageStatisticType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}

