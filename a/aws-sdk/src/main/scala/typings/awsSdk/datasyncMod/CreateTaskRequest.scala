package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the task.  For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.  For more information about how to use CloudWatch Logs with DataSync, see Monitoring Your Task in the AWS DataSync User Guide. 
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
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the OverrideOptions before starting a the task execution. For more information, see the operation. 
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
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateTaskRequest {
  @scala.inline
  def apply(
    DestinationLocationArn: LocationArn,
    SourceLocationArn: LocationArn,
    CloudWatchLogGroupArn: LogGroupArn = null,
    Excludes: FilterList = null,
    Name: TagValue = null,
    Options: Options = null,
    Schedule: TaskSchedule = null,
    Tags: TagList = null
  ): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationLocationArn = DestinationLocationArn.asInstanceOf[js.Any], SourceLocationArn = SourceLocationArn.asInstanceOf[js.Any])
    if (CloudWatchLogGroupArn != null) __obj.updateDynamic("CloudWatchLogGroupArn")(CloudWatchLogGroupArn.asInstanceOf[js.Any])
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

