package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTask extends StObject {
  
  /**
    * The name of the S3 bucket to which the log data was exported.
    */
  var destination: js.UndefOr[ExportDestinationBucket] = js.undefined
  
  /**
    * The prefix that was used as the start of Amazon S3 key for every object exported.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined
  
  /**
    * Execution information about the export task.
    */
  var executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.undefined
  
  /**
    * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not exported.
    */
  var from: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the log group from which logs data was exported.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The status of the export task.
    */
  var status: js.UndefOr[ExportTaskStatus] = js.undefined
  
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.undefined
  
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.undefined
  
  /**
    * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
    */
  var to: js.UndefOr[Timestamp] = js.undefined
}
object ExportTask {
  
  @scala.inline
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  
  @scala.inline
  implicit class ExportTaskMutableBuilder[Self <: ExportTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: ExportDestinationBucket): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPrefix(value: ExportDestinationPrefix): Self = StObject.set(x, "destinationPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPrefixUndefined: Self = StObject.set(x, "destinationPrefix", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setExecutionInfo(value: ExportTaskExecutionInfo): Self = StObject.set(x, "executionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionInfoUndefined: Self = StObject.set(x, "executionInfo", js.undefined)
    
    @scala.inline
    def setFrom(value: Timestamp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: ExportTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTaskId(value: ExportTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setTaskName(value: ExportTaskName): Self = StObject.set(x, "taskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskNameUndefined: Self = StObject.set(x, "taskName", js.undefined)
    
    @scala.inline
    def setTo(value: Timestamp): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
