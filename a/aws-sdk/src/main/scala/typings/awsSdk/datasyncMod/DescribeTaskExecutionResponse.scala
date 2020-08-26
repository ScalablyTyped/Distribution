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
  def apply(): DescribeTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskExecutionResponse]
  }
  @scala.inline
  implicit class DescribeTaskExecutionResponseOps[Self <: DescribeTaskExecutionResponse] (val x: Self) extends AnyVal {
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
    def setBytesTransferred(value: long): Self = this.set("BytesTransferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesTransferred: Self = this.set("BytesTransferred", js.undefined)
    @scala.inline
    def setBytesWritten(value: long): Self = this.set("BytesWritten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesWritten: Self = this.set("BytesWritten", js.undefined)
    @scala.inline
    def setEstimatedBytesToTransfer(value: long): Self = this.set("EstimatedBytesToTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedBytesToTransfer: Self = this.set("EstimatedBytesToTransfer", js.undefined)
    @scala.inline
    def setEstimatedFilesToTransfer(value: long): Self = this.set("EstimatedFilesToTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedFilesToTransfer: Self = this.set("EstimatedFilesToTransfer", js.undefined)
    @scala.inline
    def setExcludesVarargs(value: FilterRule*): Self = this.set("Excludes", js.Array(value :_*))
    @scala.inline
    def setExcludes(value: FilterList): Self = this.set("Excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludes: Self = this.set("Excludes", js.undefined)
    @scala.inline
    def setFilesTransferred(value: long): Self = this.set("FilesTransferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesTransferred: Self = this.set("FilesTransferred", js.undefined)
    @scala.inline
    def setIncludesVarargs(value: FilterRule*): Self = this.set("Includes", js.Array(value :_*))
    @scala.inline
    def setIncludes(value: FilterList): Self = this.set("Includes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludes: Self = this.set("Includes", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setResult(value: TaskExecutionResultDetail): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
    @scala.inline
    def setStartTime(value: Time): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: TaskExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = this.set("TaskExecutionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskExecutionArn: Self = this.set("TaskExecutionArn", js.undefined)
  }
  
}

