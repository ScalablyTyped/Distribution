package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTaskResponse extends StObject {
  
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
  implicit class DescribeTaskResponseMutableBuilder[Self <: DescribeTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Time): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setCurrentTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "CurrentTaskExecutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTaskExecutionArnUndefined: Self = StObject.set(x, "CurrentTaskExecutionArn", js.undefined)
    
    @scala.inline
    def setDestinationLocationArn(value: LocationArn): Self = StObject.set(x, "DestinationLocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationLocationArnUndefined: Self = StObject.set(x, "DestinationLocationArn", js.undefined)
    
    @scala.inline
    def setDestinationNetworkInterfaceArns(value: DestinationNetworkInterfaceArns): Self = StObject.set(x, "DestinationNetworkInterfaceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNetworkInterfaceArnsUndefined: Self = StObject.set(x, "DestinationNetworkInterfaceArns", js.undefined)
    
    @scala.inline
    def setDestinationNetworkInterfaceArnsVarargs(value: NetworkInterfaceArn*): Self = StObject.set(x, "DestinationNetworkInterfaceArns", js.Array(value :_*))
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorDetail(value: String): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    @scala.inline
    def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setSchedule(value: TaskSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setSourceLocationArn(value: LocationArn): Self = StObject.set(x, "SourceLocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationArnUndefined: Self = StObject.set(x, "SourceLocationArn", js.undefined)
    
    @scala.inline
    def setSourceNetworkInterfaceArns(value: SourceNetworkInterfaceArns): Self = StObject.set(x, "SourceNetworkInterfaceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNetworkInterfaceArnsUndefined: Self = StObject.set(x, "SourceNetworkInterfaceArns", js.undefined)
    
    @scala.inline
    def setSourceNetworkInterfaceArnsVarargs(value: NetworkInterfaceArn*): Self = StObject.set(x, "SourceNetworkInterfaceArns", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
