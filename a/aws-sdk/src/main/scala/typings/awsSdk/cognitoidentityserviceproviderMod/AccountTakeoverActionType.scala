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
  @scala.inline
  implicit class AccountTakeoverActionTypeOps[Self <: AccountTakeoverActionType] (val x: Self) extends AnyVal {
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
    def setEventAction(value: AccountTakeoverEventActionType): Self = this.set("EventAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotify(value: AccountTakeoverActionNotifyType): Self = this.set("Notify", value.asInstanceOf[js.Any])
  }
  
}

