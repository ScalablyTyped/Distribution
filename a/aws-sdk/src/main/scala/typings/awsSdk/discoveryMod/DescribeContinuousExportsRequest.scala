package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousExportsRequest extends js.Object {
  /**
    * The unique IDs assigned to the exports.
    */
  var exportIds: js.UndefOr[ContinuousExportIds] = js.native
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.native
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeContinuousExportsRequest {
  @scala.inline
  def apply(
    exportIds: ContinuousExportIds = null,
    maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined,
    nextToken: NextToken = null
  ): DescribeContinuousExportsRequest = {
    val __obj = js.Dynamic.literal()
    if (exportIds != null) __obj.updateDynamic("exportIds")(exportIds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousExportsRequest]
  }
}

