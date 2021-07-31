package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHubLocation extends StObject {
  
  /**
    * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
    */
  var commitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The GitHub account and repository pair that stores a reference to the commit that represents the bundled artifacts for the application revision.  Specified as account/repository.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object GitHubLocation {
  
  @scala.inline
  def apply(): GitHubLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubLocation]
  }
  
  @scala.inline
  implicit class GitHubLocationMutableBuilder[Self <: GitHubLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    @scala.inline
    def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
