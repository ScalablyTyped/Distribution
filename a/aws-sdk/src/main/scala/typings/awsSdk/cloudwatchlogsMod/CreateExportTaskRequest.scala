package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportTaskRequest extends js.Object {
  /**
    * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
    */
  var destination: ExportDestinationBucket = js.native
  /**
    * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is exportedlogs.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.native
  /**
    * The start time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
    */
  var from: Timestamp = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is applied.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.native
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.native
  /**
    * The end time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
    */
  var to: Timestamp = js.native
}

object CreateExportTaskRequest {
  @scala.inline
  def apply(
    destination: ExportDestinationBucket,
    from: Timestamp,
    logGroupName: LogGroupName,
    to: Timestamp,
    destinationPrefix: ExportDestinationPrefix = null,
    logStreamNamePrefix: LogStreamName = null,
    taskName: ExportTaskName = null
  ): CreateExportTaskRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (destinationPrefix != null) __obj.updateDynamic("destinationPrefix")(destinationPrefix.asInstanceOf[js.Any])
    if (logStreamNamePrefix != null) __obj.updateDynamic("logStreamNamePrefix")(logStreamNamePrefix.asInstanceOf[js.Any])
    if (taskName != null) __obj.updateDynamic("taskName")(taskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportTaskRequest]
  }
}

