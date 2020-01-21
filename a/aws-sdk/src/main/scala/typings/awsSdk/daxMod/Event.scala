package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The date and time when the event occurred.
    */
  var Date: js.UndefOr[TStamp] = js.native
  /**
    * A user-defined message associated with the event.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
    */
  var SourceName: js.UndefOr[String] = js.native
  /**
    * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
    */
  var SourceType: js.UndefOr[typings.awsSdk.daxMod.SourceType] = js.native
}

object Event {
  @scala.inline
  def apply(
    Date: TStamp = null,
    Message: String = null,
    SourceName: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (SourceName != null) __obj.updateDynamic("SourceName")(SourceName.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

