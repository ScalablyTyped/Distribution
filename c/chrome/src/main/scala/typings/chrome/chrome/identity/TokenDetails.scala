package typings.chrome.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenDetails extends js.Object {
  
  /**
    * Optional.
    * The account ID whose token should be returned. If not specified, the primary account for the profile will be used.
    * account is only supported when the "enable-new-profile-management" flag is set.
    * @since Chrome 37.
    */
  var account: js.UndefOr[AccountInfo] = js.native
  
  /**
    * Optional.
    * Fetching a token may require the user to sign-in to Chrome, or approve the application's requested scopes. If the interactive flag is true, getAuthToken will prompt the user as necessary. When the flag is false or omitted, getAuthToken will return failure any time a prompt would be required.
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * A list of OAuth2 scopes to request.
    * When the scopes field is present, it overrides the list of scopes specified in manifest.json.
    * @since Chrome 37.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}
object TokenDetails {
  
  @scala.inline
  def apply(): TokenDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenDetails]
  }
  
  @scala.inline
  implicit class TokenDetailsOps[Self <: TokenDetails] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: AccountInfo): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}
