package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskExecutionResponse extends StObject {
  
  /**
    * The physical number of bytes transferred over the network.
    */
  var BytesTransferred: js.UndefOr[long] = js.undefined
  
  /**
    * The number of logical bytes written to the destination AWS storage resource.
    */
  var BytesWritten: js.UndefOr[long] = js.undefined
  
  /**
    * The estimated physical number of bytes that is to be transferred over the network.
    */
  var EstimatedBytesToTransfer: js.UndefOr[long] = js.undefined
  
  /**
    * The expected number of files that is to be transferred over the network. This value is calculated during the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred. It's calculated based on comparing the content of the source and destination locations and finding the delta that needs to be transferred. 
    */
  var EstimatedFilesToTransfer: js.UndefOr[long] = js.undefined
  
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The actual number of files that was transferred over the network. This value is calculated and updated on an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and sent over the network.  If failures occur during a transfer, this value can be less than EstimatedFilesToTransfer. This value can also be greater than EstimatedFilesTransferred in some cases. This element is implementation-specific for some location types, so don't use it as an indicator for a correct file number or to monitor your task execution.
    */
  var FilesTransferred: js.UndefOr[long] = js.undefined
  
  /**
    * A list of filter rules that determines which files to include when running a task. The list should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.undefined
  
  /**
    * The result of the task execution.
    */
  var Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined
  
  /**
    * The time that the task execution was started.
    */
  var StartTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The status of the task execution.  For detailed information about task execution statuses, see Understanding Task Statuses in the AWS DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task execution that was described. TaskExecutionArn is hierarchical and includes TaskArn for the task that was executed.  For example, a TaskExecution value with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b executed the task with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2. 
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskExecutionArn] = js.undefined
}
object DescribeTaskExecutionResponse {
  
  @scala.inline
  def apply(): DescribeTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskExecutionResponse]
  }
  
  @scala.inline
  implicit class DescribeTaskExecutionResponseMutableBuilder[Self <: DescribeTaskExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesTransferred(value: long): Self = StObject.set(x, "BytesTransferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesTransferredUndefined: Self = StObject.set(x, "BytesTransferred", js.undefined)
    
    @scala.inline
    def setBytesWritten(value: long): Self = StObject.set(x, "BytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWrittenUndefined: Self = StObject.set(x, "BytesWritten", js.undefined)
    
    @scala.inline
    def setEstimatedBytesToTransfer(value: long): Self = StObject.set(x, "EstimatedBytesToTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedBytesToTransferUndefined: Self = StObject.set(x, "EstimatedBytesToTransfer", js.undefined)
    
    @scala.inline
    def setEstimatedFilesToTransfer(value: long): Self = StObject.set(x, "EstimatedFilesToTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedFilesToTransferUndefined: Self = StObject.set(x, "EstimatedFilesToTransfer", js.undefined)
    
    @scala.inline
    def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value :_*))
    
    @scala.inline
    def setFilesTransferred(value: long): Self = StObject.set(x, "FilesTransferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesTransferredUndefined: Self = StObject.set(x, "FilesTransferred", js.undefined)
    
    @scala.inline
    def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setResult(value: TaskExecutionResultDetail): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    @scala.inline
    def setStartTime(value: Time): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
