package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitHubLocation extends js.Object {
  /**
    * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
    */
  var commitId: js.UndefOr[CommitId] = js.native
  /**
    * The GitHub account and repository pair that stores a reference to the commit that represents the bundled artifacts for the application revision.  Specified as account/repository.
    */
  var repository: js.UndefOr[Repository] = js.native
}

object GitHubLocation {
  @scala.inline
  def apply(commitId: CommitId = null, repository: Repository = null): GitHubLocation = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHubLocation]
  }
}

