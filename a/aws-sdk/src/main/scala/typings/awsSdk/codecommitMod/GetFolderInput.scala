package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderInput extends js.Object {
  /**
    * A fully qualified reference used to identify a commit that contains the version of the folder's content to return. A fully qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no specifier is provided, the folder content is returned as it exists in the HEAD commit.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.native
  /**
    * The fully qualified path to the folder whose contents are returned, including the folder name. For example, /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of a repository. 
    */
  var folderPath: Path = js.native
  /**
    * The name of the repository.
    */
  var repositoryName: RepositoryName = js.native
}

object GetFolderInput {
  @scala.inline
  def apply(folderPath: Path, repositoryName: RepositoryName, commitSpecifier: CommitName = null): GetFolderInput = {
    val __obj = js.Dynamic.literal(folderPath = folderPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (commitSpecifier != null) __obj.updateDynamic("commitSpecifier")(commitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderInput]
  }
}

