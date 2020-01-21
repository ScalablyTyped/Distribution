package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceSummaryResponse extends js.Object {
  /**
    * A list of ConformancePackComplianceSummary objects. 
    */
  var ConformancePackComplianceSummaryList: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackComplianceSummaryList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceSummaryResponse {
  @scala.inline
  def apply(
    ConformancePackComplianceSummaryList: ConformancePackComplianceSummaryList = null,
    NextToken: NextToken = null
  ): GetConformancePackComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (ConformancePackComplianceSummaryList != null) __obj.updateDynamic("ConformancePackComplianceSummaryList")(ConformancePackComplianceSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceSummaryResponse]
  }
}

