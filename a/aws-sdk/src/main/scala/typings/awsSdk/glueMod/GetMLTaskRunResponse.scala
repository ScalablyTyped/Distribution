package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTaskRunResponse extends js.Object {
  /**
    * The date and time when this task run was completed.
    */
  var CompletedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The error strings that are associated with the task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.native
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.glueMod.ExecutionTime] = js.native
  /**
    * The date and time when this task run was last modified.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The names of the log groups that are associated with the task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  /**
    * The list of properties that are associated with the task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.native
  /**
    * The date and time when this task run started.
    */
  var StartedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The status for this task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The unique run identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  /**
    * The unique identifier of the task run.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object GetMLTaskRunResponse {
  @scala.inline
  def apply(): GetMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTaskRunResponse]
  }
  @scala.inline
  implicit class GetMLTaskRunResponseOps[Self <: GetMLTaskRunResponse] (val x: Self) extends AnyVal {
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
    def setCompletedOn(value: Timestamp): Self = this.set("CompletedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedOn: Self = this.set("CompletedOn", js.undefined)
    @scala.inline
    def setErrorString(value: GenericString): Self = this.set("ErrorString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorString: Self = this.set("ErrorString", js.undefined)
    @scala.inline
    def setExecutionTime(value: ExecutionTime): Self = this.set("ExecutionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionTime: Self = this.set("ExecutionTime", js.undefined)
    @scala.inline
    def setLastModifiedOn(value: Timestamp): Self = this.set("LastModifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedOn: Self = this.set("LastModifiedOn", js.undefined)
    @scala.inline
    def setLogGroupName(value: GenericString): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    @scala.inline
    def setProperties(value: TaskRunProperties): Self = this.set("Properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
    @scala.inline
    def setStartedOn(value: Timestamp): Self = this.set("StartedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedOn: Self = this.set("StartedOn", js.undefined)
    @scala.inline
    def setStatus(value: TaskStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTaskRunId(value: HashString): Self = this.set("TaskRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRunId: Self = this.set("TaskRunId", js.undefined)
    @scala.inline
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformId: Self = this.set("TransformId", js.undefined)
  }
  
}

