package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGitHubAccountTokenInput extends js.Object {
  
  /**
    * The name of the GitHub account connection to delete.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.native
}
object DeleteGitHubAccountTokenInput {
  
  @scala.inline
  def apply(): DeleteGitHubAccountTokenInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenInput]
  }
  
  @scala.inline
  implicit class DeleteGitHubAccountTokenInputOps[Self <: DeleteGitHubAccountTokenInput] (val x: Self) extends AnyVal {
    
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
    def setTokenName(value: GitHubAccountTokenName): Self = this.set("tokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenName: Self = this.set("tokenName", js.undefined)
  }
}
