package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTask extends js.Object {
  /**
    * The name of Amazon S3 bucket to which the log data was exported.
    */
  var destination: js.UndefOr[ExportDestinationBucket] = js.native
  /**
    * The prefix that was used as the start of Amazon S3 key for every object exported.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.native
  /**
    * Execution info about the export task.
    */
  var executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.native
  /**
    * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not exported.
    */
  var from: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the log group from which logs data was exported.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * The status of the export task.
    */
  var status: js.UndefOr[ExportTaskStatus] = js.native
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.native
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.native
  /**
    * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
    */
  var to: js.UndefOr[Timestamp] = js.native
}

object ExportTask {
  @scala.inline
  def apply(
    destination: ExportDestinationBucket = null,
    destinationPrefix: ExportDestinationPrefix = null,
    executionInfo: ExportTaskExecutionInfo = null,
    from: js.UndefOr[Timestamp] = js.undefined,
    logGroupName: LogGroupName = null,
    status: ExportTaskStatus = null,
    taskId: ExportTaskId = null,
    taskName: ExportTaskName = null,
    to: js.UndefOr[Timestamp] = js.undefined
  ): ExportTask = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (destinationPrefix != null) __obj.updateDynamic("destinationPrefix")(destinationPrefix.asInstanceOf[js.Any])
    if (executionInfo != null) __obj.updateDynamic("executionInfo")(executionInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (taskName != null) __obj.updateDynamic("taskName")(taskName.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTask]
  }
}

