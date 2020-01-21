package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMessage extends js.Object {
  /**
    * A list of EventCategoriesMap data types.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsSdk.rdsMod.EventCategoriesMapList] = js.native
}

object EventCategoriesMessage {
  @scala.inline
  def apply(EventCategoriesMapList: EventCategoriesMapList = null): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (EventCategoriesMapList != null) __obj.updateDynamic("EventCategoriesMapList")(EventCategoriesMapList.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCategoriesMessage]
  }
}

