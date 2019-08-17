package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSessionMod._UnmarshalledSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEvent extends _Event {
  /**
    * Custom attributes that are associated with the event you're adding or updating.
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledEvent: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Custom metrics related to the event.
    */
  @JSName("Metrics")
  var Metrics__UnmarshalledEvent: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Information about the session in which the event occurred.
    */
  @JSName("Session")
  var Session__UnmarshalledEvent: js.UndefOr[_UnmarshalledSession] = js.undefined
}

object _UnmarshalledEvent {
  @scala.inline
  def apply(
    Attributes: StringDictionary[String] = null,
    ClientSdkVersion: String = null,
    EventType: String = null,
    Metrics: StringDictionary[Double] = null,
    Session: _UnmarshalledSession = null,
    Timestamp: String = null
  ): _UnmarshalledEvent = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ClientSdkVersion != null) __obj.updateDynamic("ClientSdkVersion")(ClientSdkVersion)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[_UnmarshalledEvent]
  }
}

