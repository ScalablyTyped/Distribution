package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataRepositoryTaskRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
  
  /**
    * A list of paths for the data repository task to use when the task is processed. If a path that you provide isn't valid, the task fails.   For export tasks, the list contains paths on the Amazon FSx file system from which the files are exported to the Amazon S3 bucket. The default path is the file system root directory. The paths you provide need to be relative to the mount point of the file system. If the mount point is /mnt/fsx and /mnt/fsx/path1 is a directory or file on the file system you want to export, then the path to provide is path1.   For import tasks, the list contains paths in the Amazon S3 bucket from which POSIX metadata changes are imported to the Amazon FSx file system. The path can be an S3 bucket or prefix in the format s3://myBucket/myPrefix (where myPrefix is optional).  
    */
  var Paths: js.UndefOr[DataRepositoryTaskPaths] = js.undefined
  
  /**
    * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the Scope parameter. For more information, see Working with Task Completion Reports.
    */
  var Report: CompletionReport
  
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
  
  /**
    * Specifies the type of data repository task to create.
    */
  var Type: DataRepositoryTaskType
}
object CreateDataRepositoryTaskRequest {
  
  inline def apply(FileSystemId: FileSystemId, Report: CompletionReport, Type: DataRepositoryTaskType): CreateDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataRepositoryTaskRequest]
  }
  
  extension [Self <: CreateDataRepositoryTaskRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: DataRepositoryTaskPaths): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "Paths", js.undefined)
    
    inline def setPathsVarargs(value: DataRepositoryTaskPath*): Self = StObject.set(x, "Paths", js.Array(value*))
    
    inline def setReport(value: CompletionReport): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: DataRepositoryTaskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
