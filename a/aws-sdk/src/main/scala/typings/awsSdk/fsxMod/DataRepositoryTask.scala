package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryTask extends StObject {
  
  var CreationTime: js.Date
  
  /**
    * The time that Amazon FSx completed processing the task, populated after the task is complete.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Failure message describing why the task failed, it is populated only when Lifecycle is set to FAILED.
    */
  var FailureDetails: js.UndefOr[DataRepositoryTaskFailureDetails] = js.undefined
  
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
  
  /**
    * The lifecycle status of the data repository task, as follows:    PENDING - Amazon FSx has not started the task.    EXECUTING - Amazon FSx is processing the task.    FAILED - Amazon FSx was not able to complete the task. For example, there may be files the task failed to process. The DataRepositoryTaskFailureDetails property provides more information about task failures.    SUCCEEDED - FSx completed the task successfully.    CANCELED - Amazon FSx canceled the task and it did not complete.    CANCELING - FSx is in process of canceling the task.    You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in the PENDING or EXECUTING states. Please retry when the data repository task is finished (with a status of CANCELED, SUCCEEDED, or FAILED). You can use the DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to delete your file system immediately. 
    */
  var Lifecycle: DataRepositoryTaskLifecycle
  
  /**
    * An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository task to process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to the linked data repository. (Default) If Paths is not specified, Amazon FSx uses the file system root directory.
    */
  var Paths: js.UndefOr[DataRepositoryTaskPaths] = js.undefined
  
  var Report: js.UndefOr[CompletionReport] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.fsxMod.ResourceARN] = js.undefined
  
  /**
    * The time that Amazon FSx began processing the task.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides the status of the number of files that the task has processed successfully and failed to process.
    */
  var Status: js.UndefOr[DataRepositoryTaskStatus] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
  
  /**
    * The system-generated, unique 17-digit ID of the data repository task.
    */
  var TaskId: typings.awsSdk.fsxMod.TaskId
  
  /**
    * The type of data repository task.   The EXPORT_TO_REPOSITORY data repository task exports from your Lustre file system from to a linked S3 bucket.   The IMPORT_METADATA_FROM_REPOSITORY data repository task imports metadata changes from a linked S3 bucket to your Lustre file system.  
    */
  var Type: DataRepositoryTaskType
}
object DataRepositoryTask {
  
  inline def apply(
    CreationTime: js.Date,
    FileSystemId: FileSystemId,
    Lifecycle: DataRepositoryTaskLifecycle,
    TaskId: TaskId,
    Type: DataRepositoryTaskType
  ): DataRepositoryTask = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], Lifecycle = Lifecycle.asInstanceOf[js.Any], TaskId = TaskId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRepositoryTask]
  }
  
  extension [Self <: DataRepositoryTask](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureDetails(value: DataRepositoryTaskFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: DataRepositoryTaskLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: DataRepositoryTaskPaths): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "Paths", js.undefined)
    
    inline def setPathsVarargs(value: DataRepositoryTaskPath*): Self = StObject.set(x, "Paths", js.Array(value*))
    
    inline def setReport(value: CompletionReport): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "Report", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: DataRepositoryTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataRepositoryTaskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
