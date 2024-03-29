package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountDisplayInfo extends StObject {
  
  /**
    * account provider (eg, Work/School vs Microsoft Account)
    */
  var accountType: String
  
  /**
    * A display name that offers context for the account, such as "Contoso".
    */
  var contextualDisplayName: String
  
  /**
    * A display name that identifies the account, such as "User Name". Will include the e-mail address if available.
    */
  var displayName: String
  
  /**
    * The e-mail address associated with this account
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * A display name that identifies the account, such as "User Name".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Unique user id that identifies the account.
    */
  var userId: String
}
object AccountDisplayInfo {
  
  inline def apply(accountType: String, contextualDisplayName: String, displayName: String, userId: String): AccountDisplayInfo = {
    val __obj = js.Dynamic.literal(accountType = accountType.asInstanceOf[js.Any], contextualDisplayName = contextualDisplayName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDisplayInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountDisplayInfo] (val x: Self) extends AnyVal {
    
    inline def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    inline def setContextualDisplayName(value: String): Self = StObject.set(x, "contextualDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
