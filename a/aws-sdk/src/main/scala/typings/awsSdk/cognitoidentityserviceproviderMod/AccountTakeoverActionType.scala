package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTakeoverActionType extends StObject {
  
  /**
    * The event action.    BLOCK Choosing this action will block the request.    MFA_IF_CONFIGURED Throw MFA challenge if user has configured it, else allow the request.    MFA_REQUIRED Throw MFA challenge if user has configured it, else block the request.    NO_ACTION Allow the user sign-in.  
    */
  var EventAction: AccountTakeoverEventActionType
  
  /**
    * Flag specifying whether to send a notification.
    */
  var Notify: AccountTakeoverActionNotifyType
}
object AccountTakeoverActionType {
  
  inline def apply(EventAction: AccountTakeoverEventActionType, Notify: AccountTakeoverActionNotifyType): AccountTakeoverActionType = {
    val __obj = js.Dynamic.literal(EventAction = EventAction.asInstanceOf[js.Any], Notify = Notify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverActionType]
  }
  
  extension [Self <: AccountTakeoverActionType](x: Self) {
    
    inline def setEventAction(value: AccountTakeoverEventActionType): Self = StObject.set(x, "EventAction", value.asInstanceOf[js.Any])
    
    inline def setNotify(value: AccountTakeoverActionNotifyType): Self = StObject.set(x, "Notify", value.asInstanceOf[js.Any])
  }
}
