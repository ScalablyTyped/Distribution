package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ChallengeResponses: ChallengeResponseListType = null,
    CreationDate: DateType = null,
    EventContextData: EventContextDataType = null,
    EventFeedback: EventFeedbackType = null,
    EventId: StringType = null,
    EventResponse: EventResponseType = null,
    EventRisk: EventRiskType = null,
    EventType: EventType = null
  ): AuthEventType = {
    val __obj = js.Dynamic.literal()
    if (ChallengeResponses != null) __obj.updateDynamic("ChallengeResponses")(ChallengeResponses.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (EventContextData != null) __obj.updateDynamic("EventContextData")(EventContextData.asInstanceOf[js.Any])
    if (EventFeedback != null) __obj.updateDynamic("EventFeedback")(EventFeedback.asInstanceOf[js.Any])
    if (EventId != null) __obj.updateDynamic("EventId")(EventId.asInstanceOf[js.Any])
    if (EventResponse != null) __obj.updateDynamic("EventResponse")(EventResponse.asInstanceOf[js.Any])
    if (EventRisk != null) __obj.updateDynamic("EventRisk")(EventRisk.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthEventType]
  }
}

