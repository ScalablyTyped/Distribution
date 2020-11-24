package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth extends js.Object {
  
  /**
    * Authentication method e.g. "oauth"
    */
  var method: String = js.native
  
  var oauth_meta: js.UndefOr[js.Any] = js.native
  
  /**
    * Permissions for this user e.g. "wallet:user:read"
    */
  var scopes: js.Array[String] = js.native
}
object Auth {
  
  @scala.inline
  def apply(method: String, scopes: js.Array[String]): Auth = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthOps[Self <: Auth] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_meta(value: js.Any): Self = this.set("oauth_meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_meta: Self = this.set("oauth_meta", js.undefined)
  }
}
