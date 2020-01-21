package typings.awsSdkClientPinpointBrowser.typesEventMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesSessionMod.Session
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * Custom attributes that are associated with the event you're adding or updating.
    */
  var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the custom event that you're recording.
    */
  var EventType: js.UndefOr[String] = js.undefined
  /**
    * Custom metrics related to the event.
    */
  var Metrics: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSessionMod.Session] = js.undefined
  /**
    * The date and time when the event occurred, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    Attributes: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    ClientSdkVersion: String = null,
    EventType: String = null,
    Metrics: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]]) = null,
    Session: Session = null,
    Timestamp: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ClientSdkVersion != null) __obj.updateDynamic("ClientSdkVersion")(ClientSdkVersion.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (Session != null) __obj.updateDynamic("Session")(Session.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

