package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitHubCodeDestination extends StObject {
  
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
    `type`: RepositoryType
  ): GitHubCodeDestination = {
    val __obj = js.Dynamic.literal(issuesEnabled = issuesEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateRepository = privateRepository.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHubCodeDestination]
  }
  
  @scala.inline
  implicit class GitHubCodeDestinationMutableBuilder[Self <: GitHubCodeDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RepositoryDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIssuesEnabled(value: RepositoryEnableIssues): Self = StObject.set(x, "issuesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: RepositoryOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateRepository(value: RepositoryIsPrivate): Self = StObject.set(x, "privateRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: GitHubPersonalToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RepositoryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
