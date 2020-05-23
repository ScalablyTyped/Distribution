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
  def apply(
    completionTime: js.UndefOr[Timestamp] = js.undefined,
    creationTime: js.UndefOr[Timestamp] = js.undefined
  ): ExportTaskExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completionTime)) __obj.updateDynamic("completionTime")(completionTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskExecutionInfo]
  }
}

