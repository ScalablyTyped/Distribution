package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repository extends StObject {
  
  /**
    *  Information about a Bitbucket repository. 
    */
  var Bitbucket: js.UndefOr[ThirdPartySourceRepository] = js.native
  
  /**
    * Information about an AWS CodeCommit repository.
    */
  var CodeCommit: js.UndefOr[CodeCommitRepository] = js.native
  
  /**
    *  Information about a GitHub Enterprise Server repository. 
    */
  var GitHubEnterpriseServer: js.UndefOr[ThirdPartySourceRepository] = js.native
}
object Repository {
  
  @scala.inline
  def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  
  @scala.inline
  implicit class RepositoryMutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitbucket(value: ThirdPartySourceRepository): Self = StObject.set(x, "Bitbucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitbucketUndefined: Self = StObject.set(x, "Bitbucket", js.undefined)
    
    @scala.inline
    def setCodeCommit(value: CodeCommitRepository): Self = StObject.set(x, "CodeCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeCommitUndefined: Self = StObject.set(x, "CodeCommit", js.undefined)
    
    @scala.inline
    def setGitHubEnterpriseServer(value: ThirdPartySourceRepository): Self = StObject.set(x, "GitHubEnterpriseServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitHubEnterpriseServerUndefined: Self = StObject.set(x, "GitHubEnterpriseServer", js.undefined)
  }
}
