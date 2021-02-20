package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGitHubAccountTokenOutput extends StObject {
  
  /**
    * The name of the GitHub account connection that was deleted.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.native
}
object DeleteGitHubAccountTokenOutput {
  
  @scala.inline
  def apply(): DeleteGitHubAccountTokenOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenOutput]
  }
  
  @scala.inline
  implicit class DeleteGitHubAccountTokenOutputMutableBuilder[Self <: DeleteGitHubAccountTokenOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTokenName(value: GitHubAccountTokenName): Self = StObject.set(x, "tokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNameUndefined: Self = StObject.set(x, "tokenName", js.undefined)
  }
}
