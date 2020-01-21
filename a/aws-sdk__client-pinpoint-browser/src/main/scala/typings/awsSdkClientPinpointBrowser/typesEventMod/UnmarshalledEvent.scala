package typings.awsSdkClientPinpointBrowser.typesEventMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesSessionMod.UnmarshalledSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEvent extends Event {
  /**
    * Custom attributes that are associated with the event you're adding or updating.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledEvent: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Custom metrics related to the event.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledEvent: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Information about the session in which the event occurred.
    */
  @JSName("Session")
  var Session_UnmarshalledEvent: js.UndefOr[UnmarshalledSession] = js.undefined
}

object UnmarshalledEvent {
  @scala.inline
  def apply(
    Attributes: StringDictionary[String] = null,
    ClientSdkVersion: String = null,
    EventType: String = null,
    Metrics: StringDictionary[Double] = null,
    Session: UnmarshalledSession = null,
    Timestamp: String = null
  ): UnmarshalledEvent = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ClientSdkVersion != null) __obj.updateDynamic("ClientSdkVersion")(ClientSdkVersion.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (Session != null) __obj.updateDynamic("Session")(Session.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEvent]
  }
}

