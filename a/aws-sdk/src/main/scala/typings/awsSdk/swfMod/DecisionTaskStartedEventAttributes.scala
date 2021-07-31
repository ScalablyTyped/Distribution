package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecisionTaskStartedEventAttributes extends StObject {
  
  /**
    * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
}
object DecisionTaskStartedEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId): DecisionTaskStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskStartedEventAttributes]
  }
  
  @scala.inline
  implicit class DecisionTaskStartedEventAttributesMutableBuilder[Self <: DecisionTaskStartedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
  }
}
