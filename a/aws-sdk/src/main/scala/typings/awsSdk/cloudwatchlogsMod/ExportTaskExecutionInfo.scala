package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskExecutionInfo extends js.Object {
  /**
    * The completion time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var completionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The creation time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
}

object ExportTaskExecutionInfo {
  @scala.inline
  def apply(completionTime: Int | Double = null, creationTime: Int | Double = null): ExportTaskExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (completionTime != null) __obj.updateDynamic("completionTime")(completionTime.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskExecutionInfo]
  }
}

