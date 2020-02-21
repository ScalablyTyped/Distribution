package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTasksMessage extends js.Object {
  /**
    * Information about an export of a snapshot to Amazon S3.
    */
  var ExportTasks: js.UndefOr[ExportTasksList] = js.native
  /**
    * A pagination token that can be used in a later DescribeExportTasks request. A marker is used for pagination to identify the location to begin output for the next response of DescribeExportTasks.
    */
  var Marker: js.UndefOr[String] = js.native
}

object ExportTasksMessage {
  @scala.inline
  def apply(ExportTasks: ExportTasksList = null, Marker: String = null): ExportTasksMessage = {
    val __obj = js.Dynamic.literal()
    if (ExportTasks != null) __obj.updateDynamic("ExportTasks")(ExportTasks.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTasksMessage]
  }
}

