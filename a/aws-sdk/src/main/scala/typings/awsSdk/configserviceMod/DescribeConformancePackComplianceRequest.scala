package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePackComplianceRequest extends js.Object {
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * A ConformancePackComplianceFilters object.
    */
  var Filters: js.UndefOr[ConformancePackComplianceFilters] = js.native
  /**
    * The maximum number of AWS Config rules within a conformance pack are returned on each page.
    */
  var Limit: js.UndefOr[DescribeConformancePackComplianceLimit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePackComplianceRequest {
  @scala.inline
  def apply(
    ConformancePackName: ConformancePackName,
    Filters: ConformancePackComplianceFilters = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeConformancePackComplianceRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackComplianceRequest]
  }
}

