package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskExecutionResponse extends js.Object {
  /**
    * The physical number of bytes transferred over the network.
    */
  var BytesTransferred: js.UndefOr[long] = js.native
  /**
    * The number of logical bytes written to the destination AWS storage resource.
    */
  var BytesWritten: js.UndefOr[long] = js.native
  /**
    * The estimated physical number of bytes that is to be transferred over the network.
    */
  var EstimatedBytesToTransfer: js.UndefOr[long] = js.native
  /**
    * The expected number of files that is to be transferred over the network. This value is calculated during the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred. It's calculated based on comparing the content of the source and destination locations and finding the delta that needs to be transferred. 
    */
  var EstimatedFilesToTransfer: js.UndefOr[long] = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The actual number of files that was transferred over the network. This value is calculated and updated on an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and sent over the network.  If failures occur during a transfer, this value can be less than EstimatedFilesToTransfer. This value can also be greater than EstimatedFilesTransferred in some cases. This element is implementation-specific for some location types, so don't use it as an indicator for a correct file number or to monitor your task execution.
    */
  var FilesTransferred: js.UndefOr[long] = js.native
  /**
    * A list of filter rules that determines which files to include when running a task. The list should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.native
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.native
  /**
    * The result of the task execution.
    */
  var Result: js.UndefOr[TaskExecutionResultDetail] = js.native
  /**
    * The time that the task execution was started.
    */
  var StartTime: js.UndefOr[Time] = js.native
  /**
    * The status of the task execution.  For detailed information about task execution statuses, see Understanding Task Statuses in the AWS DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution that was described. TaskExecutionArn is hierarchical and includes TaskArn for the task that was executed.  For example, a TaskExecution value with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b executed the task with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2. 
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskExecutionArn] = js.native
}

object DescribeTaskExecutionResponse {
  @scala.inline
  def apply(
    BytesTransferred: Int | Double = null,
    BytesWritten: Int | Double = null,
    EstimatedBytesToTransfer: Int | Double = null,
    EstimatedFilesToTransfer: Int | Double = null,
    Excludes: FilterList = null,
    FilesTransferred: Int | Double = null,
    Includes: FilterList = null,
    Options: Options = null,
    Result: TaskExecutionResultDetail = null,
    StartTime: Time = null,
    Status: TaskExecutionStatus = null,
    TaskExecutionArn: TaskExecutionArn = null
  ): DescribeTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (BytesTransferred != null) __obj.updateDynamic("BytesTransferred")(BytesTransferred.asInstanceOf[js.Any])
    if (BytesWritten != null) __obj.updateDynamic("BytesWritten")(BytesWritten.asInstanceOf[js.Any])
    if (EstimatedBytesToTransfer != null) __obj.updateDynamic("EstimatedBytesToTransfer")(EstimatedBytesToTransfer.asInstanceOf[js.Any])
    if (EstimatedFilesToTransfer != null) __obj.updateDynamic("EstimatedFilesToTransfer")(EstimatedFilesToTransfer.asInstanceOf[js.Any])
    if (Excludes != null) __obj.updateDynamic("Excludes")(Excludes.asInstanceOf[js.Any])
    if (FilesTransferred != null) __obj.updateDynamic("FilesTransferred")(FilesTransferred.asInstanceOf[js.Any])
    if (Includes != null) __obj.updateDynamic("Includes")(Includes.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (Result != null) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskExecutionArn != null) __obj.updateDynamic("TaskExecutionArn")(TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskExecutionResponse]
  }
}

