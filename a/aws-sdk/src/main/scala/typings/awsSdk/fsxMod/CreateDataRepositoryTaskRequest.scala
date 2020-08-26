package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataRepositoryTaskRequest extends js.Object {
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
  /**
    * (Optional) The path or paths on the Amazon FSx file system to use when the data repository task is processed. The default path is the file system root directory. The paths you provide need to be relative to the mount point of the file system. If the mount point is /mnt/fsx and /mnt/fsx/path1 is a directory or file on the file system you want to export, then the path to provide is path1. If a path that you provide isn't valid, the task fails.
    */
  var Paths: js.UndefOr[DataRepositoryTaskPaths] = js.native
  /**
    * Defines whether or not Amazon FSx provides a CompletionReport once the task has completed. A CompletionReport provides a detailed report on the files that Amazon FSx processed that meet the criteria specified by the Scope parameter. For more information, see Working with Task Completion Reports.
    */
  var Report: CompletionReport = js.native
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.native
  /**
    * Specifies the type of data repository task to create.
    */
  var Type: DataRepositoryTaskType = js.native
}

object CreateDataRepositoryTaskRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, Report: CompletionReport, Type: DataRepositoryTaskType): CreateDataRepositoryTaskRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataRepositoryTaskRequest]
  }
  @scala.inline
  implicit class CreateDataRepositoryTaskRequestOps[Self <: CreateDataRepositoryTaskRequest] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: CompletionReport): Self = this.set("Report", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DataRepositoryTaskType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setPathsVarargs(value: DataRepositoryTaskPath*): Self = this.set("Paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: DataRepositoryTaskPaths): Self = this.set("Paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("Paths", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

