package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTakeoverActionType extends js.Object {
  /**
    * The event action.    BLOCK Choosing this action will block the request.    MFA_IF_CONFIGURED Throw MFA challenge if user has configured it, else allow the request.    MFA_REQUIRED Throw MFA challenge if user has configured it, else block the request.    NO_ACTION Allow the user sign-in.  
    */
  var EventAction: AccountTakeoverEventActionType = js.native
  /**
    * Flag specifying whether to send a notification.
    */
  var Notify: AccountTakeoverActionNotifyType = js.native
}

object AccountTakeoverActionType {
  @scala.inline
  def apply(EventAction: AccountTakeoverEventActionType, Notify: AccountTakeoverActionNotifyType): AccountTakeoverActionType = {
    val __obj = js.Dynamic.literal(EventAction = EventAction.asInstanceOf[js.Any], Notify = Notify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverActionType]
  }
}

