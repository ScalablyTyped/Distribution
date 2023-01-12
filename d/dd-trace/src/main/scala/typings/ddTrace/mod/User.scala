package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User
  extends StObject
     with /**
  * Custom fields to attach to the user (RBAC, Oauth, etc…).
  */
/* key */ StringDictionary[js.UndefOr[String]] {
  
  /**
    * Email of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of the user.
    * Mandatory.
    */
  var id: String
  
  /**
    * User-friendly name of the user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Role the user is making the request under.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Scopes or granted authorizations the user currently possesses.
    * The value could come from the scope associated with an OAuth2
    * Access Token or an attribute value in a SAML 2 Assertion.
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * Session ID of the user.
    */
  var session_id: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(id: String): User = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    
    inline def setSession_idUndefined: Self = StObject.set(x, "session_id", js.undefined)
  }
}
