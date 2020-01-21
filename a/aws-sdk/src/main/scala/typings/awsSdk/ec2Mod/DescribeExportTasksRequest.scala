package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksRequest extends js.Object {
  /**
    * The export task IDs.
    */
  var ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.native
  /**
    * the filters for the export tasks.
    */
  var Filters: js.UndefOr[FilterList] = js.native
}

object DescribeExportTasksRequest {
  @scala.inline
  def apply(ExportTaskIds: ExportTaskIdStringList = null, Filters: FilterList = null): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (ExportTaskIds != null) __obj.updateDynamic("ExportTaskIds")(ExportTaskIds.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
}

