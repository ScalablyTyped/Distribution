package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePacksRequest extends js.Object {
  /**
    * Comma-separated list of conformance pack names for which you want details. If you do not specify any names, AWS Config returns details for all your conformance packs. 
    */
  var ConformancePackNames: js.UndefOr[ConformancePackNamesList] = js.native
  /**
    * The maximum number of conformance packs returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePacksRequest {
  @scala.inline
  def apply(
    ConformancePackNames: ConformancePackNamesList = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeConformancePacksRequest = {
    val __obj = js.Dynamic.literal()
    if (ConformancePackNames != null) __obj.updateDynamic("ConformancePackNames")(ConformancePackNames.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePacksRequest]
  }
}

