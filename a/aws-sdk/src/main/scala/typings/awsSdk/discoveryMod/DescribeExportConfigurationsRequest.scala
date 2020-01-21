package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportConfigurationsRequest extends js.Object {
  /**
    * A list of continuous export IDs to search for.
    */
  var exportIds: js.UndefOr[ExportIds] = js.native
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportConfigurationsRequest {
  @scala.inline
  def apply(exportIds: ExportIds = null, maxResults: Int | Double = null, nextToken: NextToken = null): DescribeExportConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (exportIds != null) __obj.updateDynamic("exportIds")(exportIds.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportConfigurationsRequest]
  }
}

