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
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  @scala.inline
  implicit class ExportTaskOps[Self <: ExportTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestination(value: ExportDestinationBucket): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDestinationPrefix(value: ExportDestinationPrefix): Self = this.set("destinationPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationPrefix: Self = this.set("destinationPrefix", js.undefined)
    @scala.inline
    def setExecutionInfo(value: ExportTaskExecutionInfo): Self = this.set("executionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionInfo: Self = this.set("executionInfo", js.undefined)
    @scala.inline
    def setFrom(value: Timestamp): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    @scala.inline
    def setStatus(value: ExportTaskStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTaskId(value: ExportTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
    @scala.inline
    def setTaskName(value: ExportTaskName): Self = this.set("taskName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskName: Self = this.set("taskName", js.undefined)
    @scala.inline
    def setTo(value: Timestamp): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

