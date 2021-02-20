package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGitHubAccountTokenNamesOutput extends StObject {
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent ListGitHubAccountTokenNames call to return the next set of names in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of names of connections to GitHub accounts.
    */
  var tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.native
}
object ListGitHubAccountTokenNamesOutput {
  
  @scala.inline
  def apply(): ListGitHubAccountTokenNamesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGitHubAccountTokenNamesOutput]
  }
  
  @scala.inline
  implicit class ListGitHubAccountTokenNamesOutputMutableBuilder[Self <: ListGitHubAccountTokenNamesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTokenNameList(value: GitHubAccountTokenNameList): Self = StObject.set(x, "tokenNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNameListUndefined: Self = StObject.set(x, "tokenNameList", js.undefined)
    
    @scala.inline
    def setTokenNameListVarargs(value: GitHubAccountTokenName*): Self = StObject.set(x, "tokenNameList", js.Array(value :_*))
  }
}
