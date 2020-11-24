package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGitHubAccountTokenNamesOutput extends js.Object {
  
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
  implicit class ListGitHubAccountTokenNamesOutputOps[Self <: ListGitHubAccountTokenNamesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setTokenNameListVarargs(value: GitHubAccountTokenName*): Self = this.set("tokenNameList", js.Array(value :_*))
    
    @scala.inline
    def setTokenNameList(value: GitHubAccountTokenNameList): Self = this.set("tokenNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenNameList: Self = this.set("tokenNameList", js.undefined)
  }
}
