package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGitHubAccountTokenInput extends StObject {
  
  /**
    * The name of the GitHub account connection to delete.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
}
object DeleteGitHubAccountTokenInput {
  
  @scala.inline
  def apply(): DeleteGitHubAccountTokenInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenInput]
  }
  
  @scala.inline
  implicit class DeleteGitHubAccountTokenInputMutableBuilder[Self <: DeleteGitHubAccountTokenInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTokenName(value: GitHubAccountTokenName): Self = StObject.set(x, "tokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNameUndefined: Self = StObject.set(x, "tokenName", js.undefined)
  }
}
