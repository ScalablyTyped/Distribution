package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceSummaryRequest extends js.Object {
  /**
    * Names of conformance packs.
    */
  var ConformancePackNames: ConformancePackNamesToSummarizeList = js.native
  /**
    * The maximum number of conformance packs returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceSummaryRequest {
  @scala.inline
  def apply(
    ConformancePackNames: ConformancePackNamesToSummarizeList,
    Limit: js.UndefOr[PageSizeLimit] = js.undefined,
    NextToken: NextToken = null
  ): GetConformancePackComplianceSummaryRequest = {
    val __obj = js.Dynamic.literal(ConformancePackNames = ConformancePackNames.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceSummaryRequest]
  }
}

