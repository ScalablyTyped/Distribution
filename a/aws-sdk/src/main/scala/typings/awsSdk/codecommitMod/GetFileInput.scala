package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileInput extends js.Object {
  /**
    * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, the head commit is used.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.native
  /**
    * The fully qualified path to the file, including the full name and extension of the file. For example, /examples/file.md is the fully qualified path to a file named file.md in a folder named examples.
    */
  var filePath: Path = js.native
  /**
    * The name of the repository that contains the file.
    */
  var repositoryName: RepositoryName = js.native
}

object GetFileInput {
  @scala.inline
  def apply(filePath: Path, repositoryName: RepositoryName): GetFileInput = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInput]
  }
  @scala.inline
  implicit class GetFileInputOps[Self <: GetFileInput] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitSpecifier(value: CommitName): Self = this.set("commitSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitSpecifier: Self = this.set("commitSpecifier", js.undefined)
  }
  
}

