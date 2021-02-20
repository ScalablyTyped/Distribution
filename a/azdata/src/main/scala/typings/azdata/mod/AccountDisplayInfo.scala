package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountDisplayInfo extends StObject {
  
  /**
    * account provider (eg, Work/School vs Microsoft Account)
    */
  var accountType: String = js.native
  
  /**
    * A display name that offers context for the account, such as "Contoso".
    */
  var contextualDisplayName: String = js.native
  
  /**
    * A display name that identifies the account, such as "User Name".
    */
  var displayName: String = js.native
  
  /**
    * Unique user id that identifies the account.
    */
  var userId: String = js.native
}
object AccountDisplayInfo {
  
  @scala.inline
  def apply(accountType: String, contextualDisplayName: String, displayName: String, userId: String): AccountDisplayInfo = {
    val __obj = js.Dynamic.literal(accountType = accountType.asInstanceOf[js.Any], contextualDisplayName = contextualDisplayName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDisplayInfo]
  }
  
  @scala.inline
  implicit class AccountDisplayInfoMutableBuilder[Self <: AccountDisplayInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextualDisplayName(value: String): Self = StObject.set(x, "contextualDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
