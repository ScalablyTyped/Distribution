package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuntimeVersionsResponse extends js.Object {
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeRuntimeVersions operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * An array of objects that display the details about each Synthetics canary runtime version.
    */
  var RuntimeVersions: js.UndefOr[RuntimeVersionList] = js.native
}

object DescribeRuntimeVersionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, RuntimeVersions: RuntimeVersionList = null): DescribeRuntimeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RuntimeVersions != null) __obj.updateDynamic("RuntimeVersions")(RuntimeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuntimeVersionsResponse]
  }
}

