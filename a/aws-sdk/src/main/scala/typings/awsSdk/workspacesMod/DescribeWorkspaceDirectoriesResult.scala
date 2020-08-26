package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceDirectoriesResult extends js.Object {
  /**
    * Information about the directories.
    */
  var Directories: js.UndefOr[DirectoryList] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceDirectoriesResult {
  @scala.inline
  def apply(): DescribeWorkspaceDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesResult]
  }
  @scala.inline
  implicit class DescribeWorkspaceDirectoriesResultOps[Self <: DescribeWorkspaceDirectoriesResult] (val x: Self) extends AnyVal {
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
    def setDirectoriesVarargs(value: WorkspaceDirectory*): Self = this.set("Directories", js.Array(value :_*))
    @scala.inline
    def setDirectories(value: DirectoryList): Self = this.set("Directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("Directories", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

