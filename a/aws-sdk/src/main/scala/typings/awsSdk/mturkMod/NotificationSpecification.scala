package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSpecification extends StObject {
  
  /**
    *  The target for notification messages. The Destination’s format is determined by the specified Transport:    When Transport is Email, the Destination is your email address.   When Transport is SQS, the Destination is your queue URL.   When Transport is SNS, the Destination is the ARN of your topic.  
    */
  var Destination: String = js.native
  
  /**
    *  The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted | AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved | HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the SendTestEventNotification operation. 
    */
  var EventTypes: EventTypeList = js.native
  
  /**
    *  The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS. 
    */
  var Transport: NotificationTransport = js.native
  
  /**
    * The version of the Notification API to use. Valid value is 2006-05-05.
    */
  var Version: String = js.native
}
object NotificationSpecification {
  
  @scala.inline
  def apply(Destination: String, EventTypes: EventTypeList, Transport: NotificationTransport, Version: String): NotificationSpecification = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], EventTypes = EventTypes.asInstanceOf[js.Any], Transport = Transport.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSpecification]
  }
  
  @scala.inline
  implicit class NotificationSpecificationMutableBuilder[Self <: NotificationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypes(value: EventTypeList): Self = StObject.set(x, "EventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesVarargs(value: EventType*): Self = StObject.set(x, "EventTypes", js.Array(value :_*))
    
    @scala.inline
    def setTransport(value: NotificationTransport): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
