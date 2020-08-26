package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminUpdateAuthEventFeedbackRequest extends js.Object {
  /**
    * The authentication event ID.
    */
  var EventId: EventIdType = js.native
  /**
    * The authentication event feedback value.
    */
  var FeedbackValue: FeedbackValueType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user pool username.
    */
  var Username: UsernameType = js.native
}

object AdminUpdateAuthEventFeedbackRequest {
  @scala.inline
  def apply(
    EventId: EventIdType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): AdminUpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUpdateAuthEventFeedbackRequest]
  }
  @scala.inline
  implicit class AdminUpdateAuthEventFeedbackRequestOps[Self <: AdminUpdateAuthEventFeedbackRequest] (val x: Self) extends AnyVal {
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
    def setEventId(value: EventIdType): Self = this.set("EventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeedbackValue(value: FeedbackValueType): Self = this.set("FeedbackValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
  
}

