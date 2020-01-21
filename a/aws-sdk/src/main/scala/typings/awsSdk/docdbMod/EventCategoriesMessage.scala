package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMessage extends js.Object {
  /**
    * A list of event category maps.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsSdk.docdbMod.EventCategoriesMapList] = js.native
}

object EventCategoriesMessage {
  @scala.inline
  def apply(EventCategoriesMapList: EventCategoriesMapList = null): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (EventCategoriesMapList != null) __obj.updateDynamic("EventCategoriesMapList")(EventCategoriesMapList.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCategoriesMessage]
  }
}

