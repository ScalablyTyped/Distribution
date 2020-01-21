package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksResponse extends js.Object {
  /**
    * The export tasks.
    */
  var exportTasks: js.UndefOr[ExportTasks] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportTasksResponse {
  @scala.inline
  def apply(exportTasks: ExportTasks = null, nextToken: NextToken = null): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (exportTasks != null) __obj.updateDynamic("exportTasks")(exportTasks.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
}

