package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminUpdateAuthEventFeedbackRequest extends StObject {
  
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
  implicit class AdminUpdateAuthEventFeedbackRequestMutableBuilder[Self <: AdminUpdateAuthEventFeedbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: EventIdType): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackValue(value: FeedbackValueType): Self = StObject.set(x, "FeedbackValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
