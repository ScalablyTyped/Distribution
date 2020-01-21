package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuthEventFeedbackRequest extends js.Object {
  /**
    * The event ID.
    */
  var EventId: EventIdType = js.native
  /**
    * The feedback token.
    */
  var FeedbackToken: TokenModelType = js.native
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

object UpdateAuthEventFeedbackRequest {
  @scala.inline
  def apply(
    EventId: EventIdType,
    FeedbackToken: TokenModelType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): UpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], FeedbackToken = FeedbackToken.asInstanceOf[js.Any], FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAuthEventFeedbackRequest]
  }
}

