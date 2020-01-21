package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerRecordedEventAttributes extends js.Object {
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
  def apply(decisionTaskCompletedEventId: EventId, markerName: MarkerName, details: Data = null): MarkerRecordedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], markerName = markerName.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerRecordedEventAttributes]
  }
}

