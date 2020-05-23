package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportDefinitionsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsSdk.curMod.MaxResults] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
}

object DescribeReportDefinitionsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: GenericString = null): DescribeReportDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportDefinitionsRequest]
  }
}

