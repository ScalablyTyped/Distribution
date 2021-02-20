package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerRecordedEventAttributes extends StObject {
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RecordMarker decision that requested this marker. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The details of the marker.
    */
  var details: js.UndefOr[Data] = js.native
  
  /**
    * The name of the marker.
    */
  var markerName: MarkerName = js.native
}
object MarkerRecordedEventAttributes {
  
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, markerName: MarkerName): MarkerRecordedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], markerName = markerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerRecordedEventAttributes]
  }
  
  @scala.inline
  implicit class MarkerRecordedEventAttributesMutableBuilder[Self <: MarkerRecordedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setMarkerName(value: MarkerName): Self = StObject.set(x, "markerName", value.asInstanceOf[js.Any])
  }
}
