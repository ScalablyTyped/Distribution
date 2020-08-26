package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileOutput extends js.Object {
  /**
    * The blob ID of the object that represents the file content.
    */
  var blobId: ObjectId = js.native
  /**
    * The full commit ID of the commit that contains the content returned by GetFile.
    */
  var commitId: ObjectId = js.native
  /**
    * The base-64 encoded binary data object that represents the content of the file.
    */
  var fileContent: FileContent = js.native
  /**
    * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not numeric values.  The file mode permissions returned by this API are not the standard file mode permission values, such as 100644, but rather extrapolated values. See the supported return values. 
    */
  var fileMode: FileModeTypeEnum = js.native
  /**
    * The fully qualified path to the specified file. Returns the name and extension of the file.
    */
  var filePath: Path = js.native
  /**
    * The size of the contents of the file, in bytes.
    */
  var fileSize: ObjectSize = js.native
}

object GetFileOutput {
  @scala.inline
  def apply(
    blobId: ObjectId,
    commitId: ObjectId,
    fileContent: FileContent,
    fileMode: FileModeTypeEnum,
    filePath: Path,
    fileSize: ObjectSize
  ): GetFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileOutput]
  }
  @scala.inline
  implicit class GetFileOutputOps[Self <: GetFileOutput] (val x: Self) extends AnyVal {
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
    def setBlobId(value: ObjectId): Self = this.set("blobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitId(value: ObjectId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileContent(value: FileContent): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = this.set("fileMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: ObjectSize): Self = this.set("fileSize", value.asInstanceOf[js.Any])
  }
  
}

