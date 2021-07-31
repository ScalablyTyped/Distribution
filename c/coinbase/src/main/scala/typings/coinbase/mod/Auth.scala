package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth extends StObject {
  
  /**
    * Authentication method e.g. "oauth"
    */
  var method: String
  
  var oauth_meta: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Permissions for this user e.g. "wallet:user:read"
    */
  var scopes: js.Array[String]
}
object Auth {
  
  @scala.inline
  def apply(method: String, scopes: js.Array[String]): Auth = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_meta(value: js.Any): Self = StObject.set(x, "oauth_meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_metaUndefined: Self = StObject.set(x, "oauth_meta", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
