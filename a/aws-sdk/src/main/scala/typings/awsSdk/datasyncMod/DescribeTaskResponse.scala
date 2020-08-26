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
  def apply(): DescribeTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskResponse]
  }
  @scala.inline
  implicit class DescribeTaskResponseOps[Self <: DescribeTaskResponse] (val x: Self) extends AnyVal {
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
    def setCloudWatchLogGroupArn(value: LogGroupArn): Self = this.set("CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogGroupArn: Self = this.set("CloudWatchLogGroupArn", js.undefined)
    @scala.inline
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setCurrentTaskExecutionArn(value: TaskExecutionArn): Self = this.set("CurrentTaskExecutionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTaskExecutionArn: Self = this.set("CurrentTaskExecutionArn", js.undefined)
    @scala.inline
    def setDestinationLocationArn(value: LocationArn): Self = this.set("DestinationLocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationLocationArn: Self = this.set("DestinationLocationArn", js.undefined)
    @scala.inline
    def setDestinationNetworkInterfaceArnsVarargs(value: NetworkInterfaceArn*): Self = this.set("DestinationNetworkInterfaceArns", js.Array(value :_*))
    @scala.inline
    def setDestinationNetworkInterfaceArns(value: DestinationNetworkInterfaceArns): Self = this.set("DestinationNetworkInterfaceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationNetworkInterfaceArns: Self = this.set("DestinationNetworkInterfaceArns", js.undefined)
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorDetail(value: String): Self = this.set("ErrorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetail: Self = this.set("ErrorDetail", js.undefined)
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
    def setSourceLocationArn(value: LocationArn): Self = this.set("SourceLocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLocationArn: Self = this.set("SourceLocationArn", js.undefined)
    @scala.inline
    def setSourceNetworkInterfaceArnsVarargs(value: NetworkInterfaceArn*): Self = this.set("SourceNetworkInterfaceArns", js.Array(value :_*))
    @scala.inline
    def setSourceNetworkInterfaceArns(value: SourceNetworkInterfaceArns): Self = this.set("SourceNetworkInterfaceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceNetworkInterfaceArns: Self = this.set("SourceNetworkInterfaceArns", js.undefined)
    @scala.inline
    def setStatus(value: TaskStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTaskArn(value: TaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("TaskArn", js.undefined)
  }
  
}

