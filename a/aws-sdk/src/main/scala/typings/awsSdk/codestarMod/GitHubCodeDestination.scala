package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitHubCodeDestination extends js.Object {
  /**
    * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after the repository is created.
    */
  var description: js.UndefOr[RepositoryDescription] = js.native
  /**
    * Whether to enable issues for the GitHub repository.
    */
  var issuesEnabled: RepositoryEnableIssues = js.native
  /**
    * Name of the GitHub repository to be created in AWS CodeStar.
    */
  var name: RepositoryName = js.native
  /**
    * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository should be owned by a GitHub organization, provide its name.
    */
  var owner: RepositoryOwner = js.native
  /**
    * Whether the GitHub repository is to be a private repository.
    */
  var privateRepository: RepositoryIsPrivate = js.native
  /**
    * The GitHub user's personal access token for the GitHub repository.
    */
  var token: GitHubPersonalToken = js.native
  /**
    * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
    */
  var `type`: RepositoryType = js.native
}

object GitHubCodeDestination {
  @scala.inline
  def apply(
    issuesEnabled: RepositoryEnableIssues,
    name: RepositoryName,
    owner: RepositoryOwner,
    privateRepository: RepositoryIsPrivate,
    token: GitHubPersonalToken,
    `type`: RepositoryType,
    description: RepositoryDescription = null
  ): GitHubCodeDestination = {
    val __obj = js.Dynamic.literal(issuesEnabled = issuesEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateRepository = privateRepository.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHubCodeDestination]
  }
}

