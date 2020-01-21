package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the task. For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.native
  /**
    * The time that the task was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution that is syncing files.
    */
  var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS storage resource's location.
    */
  var DestinationLocationArn: js.UndefOr[LocationArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the destination ENIs (Elastic Network Interface) that was created for your subnet.
    */
  var DestinationNetworkInterfaceArns: js.UndefOr[typings.awsSdk.datasyncMod.DestinationNetworkInterfaceArns] = js.native
  /**
    * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The name of the task that was described.
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the overriding OverrideOptions value to operation. 
    */
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.native
  /**
    * The schedule used to periodically transfer files from a source to a destination location.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source file system's location.
    */
  var SourceLocationArn: js.UndefOr[LocationArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source ENIs (Elastic Network Interface) that was created for your subnet.
    */
  var SourceNetworkInterfaceArns: js.UndefOr[typings.awsSdk.datasyncMod.SourceNetworkInterfaceArns] = js.native
  /**
    * The status of the task that was described. For detailed information about task execution statuses, see Understanding Task Statuses in the AWS DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task that was described.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskArn] = js.native
}

object DescribeTaskResponse {
  @scala.inline
  def apply(
    CloudWatchLogGroupArn: LogGroupArn = null,
    CreationTime: Time = null,
    CurrentTaskExecutionArn: TaskExecutionArn = null,
    DestinationLocationArn: LocationArn = null,
    DestinationNetworkInterfaceArns: DestinationNetworkInterfaceArns = null,
    ErrorCode: String = null,
    ErrorDetail: String = null,
    Excludes: FilterList = null,
    Name: TagValue = null,
    Options: Options = null,
    Schedule: TaskSchedule = null,
    SourceLocationArn: LocationArn = null,
    SourceNetworkInterfaceArns: SourceNetworkInterfaceArns = null,
    Status: TaskStatus = null,
    TaskArn: TaskArn = null
  ): DescribeTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogGroupArn != null) __obj.updateDynamic("CloudWatchLogGroupArn")(CloudWatchLogGroupArn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (CurrentTaskExecutionArn != null) __obj.updateDynamic("CurrentTaskExecutionArn")(CurrentTaskExecutionArn.asInstanceOf[js.Any])
    if (DestinationLocationArn != null) __obj.updateDynamic("DestinationLocationArn")(DestinationLocationArn.asInstanceOf[js.Any])
    if (DestinationNetworkInterfaceArns != null) __obj.updateDynamic("DestinationNetworkInterfaceArns")(DestinationNetworkInterfaceArns.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail.asInstanceOf[js.Any])
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SourceLocationArn != null) __obj.updateDynamic("SourceLocationArn")(SourceLocationArn.asInstanceOf[js.Any])
    if (SourceNetworkInterfaceArns != null) __obj.updateDynamic("SourceNetworkInterfaceArns")(SourceNetworkInterfaceArns.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskResponse]
  }
}

