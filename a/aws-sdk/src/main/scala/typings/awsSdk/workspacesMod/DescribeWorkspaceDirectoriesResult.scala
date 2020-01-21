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
  def apply(Directories: DirectoryList = null, NextToken: PaginationToken = null): DescribeWorkspaceDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    if (Directories != null) __obj.updateDynamic("Directories")(Directories.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesResult]
  }
}

