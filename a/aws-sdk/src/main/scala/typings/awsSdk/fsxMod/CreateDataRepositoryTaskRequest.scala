package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataRepositoryTaskRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
  
  /**
    * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The default path is the file system root directory. The paths you provide need to be relative to the mount point of the file system. If the mount point is /mnt/fsx and /mnt/fsx/path1 is a directory or file on the file system you want to export, then the path to provide is path1. If a path that you provide isn't valid, the task fails.
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
  
  @scala.inline
  def apply(FileSystemId: FileSystemId, Report: CompletionReport, Type: DataRepositoryTaskType): CreateDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataRepositoryTaskRequest]
  }
  
  @scala.inline
  implicit class CreateDataRepositoryTaskRequestMutableBuilder[Self <: CreateDataRepositoryTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: DataRepositoryTaskPaths): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "Paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: DataRepositoryTaskPath*): Self = StObject.set(x, "Paths", js.Array(value :_*))
    
    @scala.inline
    def setReport(value: CompletionReport): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DataRepositoryTaskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
