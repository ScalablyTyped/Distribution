package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The date and time of the event.
    */
  var Date: js.UndefOr[TStamp] = js.native
  /**
    * A list of the event categories. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The identifier of the event.
    */
  var EventId: js.UndefOr[String] = js.native
  /**
    * The text of this event.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
  /**
    * The identifier for the source of the event.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  /**
    * The source type for this event.
    */
  var SourceType: js.UndefOr[typings.awsSdk.redshiftMod.SourceType] = js.native
}

object Event {
  @scala.inline
  def apply(
    Date: TStamp = null,
    EventCategories: EventCategoriesList = null,
    EventId: String = null,
    Message: String = null,
    Severity: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (EventId != null) __obj.updateDynamic("EventId")(EventId.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

