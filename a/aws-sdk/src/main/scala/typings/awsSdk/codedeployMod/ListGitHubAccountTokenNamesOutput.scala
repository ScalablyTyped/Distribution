package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(nextToken: NextToken = null, tokenNameList: GitHubAccountTokenNameList = null): ListGitHubAccountTokenNamesOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tokenNameList != null) __obj.updateDynamic("tokenNameList")(tokenNameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGitHubAccountTokenNamesOutput]
  }
}

