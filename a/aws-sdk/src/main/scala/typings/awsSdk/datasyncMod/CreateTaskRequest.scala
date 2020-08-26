package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the task. 
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS storage resource's location. 
    */
  var DestinationLocationArn: LocationArn = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The name of a task. This value is a text reference that is used to identify the task in the console. 
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the OverrideOptions before starting the task execution. For more information, see the operation. 
    */
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.native
  /**
    * Specifies a schedule used to periodically transfer files from a source to a destination location. The schedule should be specified in UTC time. For more information, see task-scheduling.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source location for the task.
    */
  var SourceLocationArn: LocationArn = js.native
  /**
    * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty string. 
    */
  var Tags: js.UndefOr[InputTagList] = js.native
}

object CreateTaskRequest {
  @scala.inline
  def apply(DestinationLocationArn: LocationArn, SourceLocationArn: LocationArn): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationLocationArn = DestinationLocationArn.asInstanceOf[js.Any], SourceLocationArn = SourceLocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
  @scala.inline
  implicit class CreateTaskRequestOps[Self <: CreateTaskRequest] (val x: Self) extends AnyVal {
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
    def setDestinationLocationArn(value: LocationArn): Self = this.set("DestinationLocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLocationArn(value: LocationArn): Self = this.set("SourceLocationArn", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: InputTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

