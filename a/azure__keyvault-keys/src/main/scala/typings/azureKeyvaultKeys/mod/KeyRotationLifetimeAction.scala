package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRotationLifetimeAction extends StObject {
  
  /**
    * The action that will be executed.
    */
  var action: KeyRotationPolicyAction
  
  /**
    * Time after creation to attempt the specified action, defined as an ISO 8601 duration.
    */
  var timeAfterCreate: js.UndefOr[String] = js.undefined
  
  /**
    * Time before expiry to attempt the specified action, defined as an ISO 8601 duration.
    */
  var timeBeforeExpiry: js.UndefOr[String] = js.undefined
}
object KeyRotationLifetimeAction {
  
  inline def apply(action: KeyRotationPolicyAction): KeyRotationLifetimeAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRotationLifetimeAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyRotationLifetimeAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: KeyRotationPolicyAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setTimeAfterCreate(value: String): Self = StObject.set(x, "timeAfterCreate", value.asInstanceOf[js.Any])
    
    inline def setTimeAfterCreateUndefined: Self = StObject.set(x, "timeAfterCreate", js.undefined)
    
    inline def setTimeBeforeExpiry(value: String): Self = StObject.set(x, "timeBeforeExpiry", value.asInstanceOf[js.Any])
    
    inline def setTimeBeforeExpiryUndefined: Self = StObject.set(x, "timeBeforeExpiry", js.undefined)
  }
}
