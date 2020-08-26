package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The name of the task to update.
    */
  var Name: js.UndefOr[TagValue] = js.native
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.native
  /**
    * Specifies a schedule used to periodically transfer files from a source to a destination location. You can configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day or hour you want the task to execute. The time you specify is UTC time. For more information, see task-scheduling.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource name of the task to update.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}

object UpdateTaskRequest {
  @scala.inline
  def apply(TaskArn: TaskArn): UpdateTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskRequest]
  }
  @scala.inline
  implicit class UpdateTaskRequestOps[Self <: UpdateTaskRequest] (val x: Self) extends AnyVal {
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
    def setTaskArn(value: TaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudWatchLogGroupArn(value: LogGroupArn): Self = this.set("CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogGroupArn: Self = this.set("CloudWatchLogGroupArn", js.undefined)
    @scala.inline
    def setExcludesVarargs(value: FilterRule*): Self = this.set("Excludes", js.Array(value :_*))
    @scala.inline
    def setExcludes(value: FilterList): Self = this.set("Excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludes: Self = this.set("Excludes", js.undefined)
    @scala.inline
    def setName(value: TagValue): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setSchedule(value: TaskSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
  }
  
}

