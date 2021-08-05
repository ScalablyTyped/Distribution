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
    * A display name that identifies the account, such as "User Name".
    */
  var displayName: String
  
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
  
  extension [Self <: AccountDisplayInfo](x: Self) {
    
    inline def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    inline def setContextualDisplayName(value: String): Self = StObject.set(x, "contextualDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
