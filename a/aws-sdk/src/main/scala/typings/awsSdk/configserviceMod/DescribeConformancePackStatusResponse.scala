package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePackStatusResponse extends js.Object {
  /**
    * A list of ConformancePackStatusDetail objects.
    */
  var ConformancePackStatusDetails: js.UndefOr[ConformancePackStatusDetailsList] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePackStatusResponse {
  @scala.inline
  def apply(ConformancePackStatusDetails: ConformancePackStatusDetailsList = null, NextToken: NextToken = null): DescribeConformancePackStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ConformancePackStatusDetails != null) __obj.updateDynamic("ConformancePackStatusDetails")(ConformancePackStatusDetails.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackStatusResponse]
  }
}

