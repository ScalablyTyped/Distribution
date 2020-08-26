package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileEntry extends js.Object {
  /**
    * The content of the file, if a source file is not specified.
    */
  var fileContent: js.UndefOr[FileContent] = js.native
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  /**
    * The full path to the file in the repository, including the name of the file.
    */
  var filePath: Path = js.native
  /**
    * The name and full path of the file that contains the changes you want to make as part of the commit, if you are not providing the file content directly.
    */
  var sourceFile: js.UndefOr[SourceFileSpecifier] = js.native
}

object PutFileEntry {
  @scala.inline
  def apply(filePath: Path): PutFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileEntry]
  }
  @scala.inline
  implicit class PutFileEntryOps[Self <: PutFileEntry] (val x: Self) extends AnyVal {
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
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileContent(value: FileContent): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileContent: Self = this.set("fileContent", js.undefined)
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = this.set("fileMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileMode: Self = this.set("fileMode", js.undefined)
    @scala.inline
    def setSourceFile(value: SourceFileSpecifier): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFile: Self = this.set("sourceFile", js.undefined)
  }
  
}

