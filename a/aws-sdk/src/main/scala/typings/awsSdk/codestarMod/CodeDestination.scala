package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeDestination extends StObject {
  
  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.native
  
  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var gitHub: js.UndefOr[GitHubCodeDestination] = js.native
}
object CodeDestination {
  
  @scala.inline
  def apply(): CodeDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDestination]
  }
  
  @scala.inline
  implicit class CodeDestinationMutableBuilder[Self <: CodeDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeCommit(value: CodeCommitCodeDestination): Self = StObject.set(x, "codeCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeCommitUndefined: Self = StObject.set(x, "codeCommit", js.undefined)
    
    @scala.inline
    def setGitHub(value: GitHubCodeDestination): Self = StObject.set(x, "gitHub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitHubUndefined: Self = StObject.set(x, "gitHub", js.undefined)
  }
}
