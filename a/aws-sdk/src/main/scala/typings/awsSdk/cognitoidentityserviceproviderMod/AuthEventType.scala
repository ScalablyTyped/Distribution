package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthEventType extends js.Object {
  
  /**
    * The challenge responses.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.native
  
  /**
    * The creation date
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The user context data captured at the time of an event request. It provides additional information about the client from which event the request is received.
    */
  var EventContextData: js.UndefOr[EventContextDataType] = js.native
  
  /**
    * A flag specifying the user feedback captured at the time of an event request is good or bad. 
    */
  var EventFeedback: js.UndefOr[EventFeedbackType] = js.native
  
  /**
    * The event ID.
    */
  var EventId: js.UndefOr[StringType] = js.native
  
  /**
    * The event response.
    */
  var EventResponse: js.UndefOr[EventResponseType] = js.native
  
  /**
    * The event risk.
    */
  var EventRisk: js.UndefOr[EventRiskType] = js.native
  
  /**
    * The event type.
    */
  var EventType: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.EventType] = js.native
}
object AuthEventType {
  
  @scala.inline
  def apply(): AuthEventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthEventType]
  }
  
  @scala.inline
  implicit class AuthEventTypeOps[Self <: AuthEventType] (val x: Self) extends AnyVal {
    
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
    def setChallengeResponsesVarargs(value: ChallengeResponseType*): Self = this.set("ChallengeResponses", js.Array(value :_*))
    
    @scala.inline
    def setChallengeResponses(value: ChallengeResponseListType): Self = this.set("ChallengeResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeResponses: Self = this.set("ChallengeResponses", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setEventContextData(value: EventContextDataType): Self = this.set("EventContextData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventContextData: Self = this.set("EventContextData", js.undefined)
    
    @scala.inline
    def setEventFeedback(value: EventFeedbackType): Self = this.set("EventFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventFeedback: Self = this.set("EventFeedback", js.undefined)
    
    @scala.inline
    def setEventId(value: StringType): Self = this.set("EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("EventId", js.undefined)
    
    @scala.inline
    def setEventResponse(value: EventResponseType): Self = this.set("EventResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventResponse: Self = this.set("EventResponse", js.undefined)
    
    @scala.inline
    def setEventRisk(value: EventRiskType): Self = this.set("EventRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventRisk: Self = this.set("EventRisk", js.undefined)
    
    @scala.inline
    def setEventType(value: EventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
  }
}
