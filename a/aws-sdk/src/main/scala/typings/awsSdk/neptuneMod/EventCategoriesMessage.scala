package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMessage extends js.Object {
  /**
    * A list of EventCategoriesMap data types.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsSdk.neptuneMod.EventCategoriesMapList] = js.native
}

object EventCategoriesMessage {
  @scala.inline
  def apply(): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMessage]
  }
  @scala.inline
  implicit class EventCategoriesMessageOps[Self <: EventCategoriesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventCategoriesMapListVarargs(value: EventCategoriesMap*): Self = this.set("EventCategoriesMapList", js.Array(value :_*))
    @scala.inline
    def setEventCategoriesMapList(value: EventCategoriesMapList): Self = this.set("EventCategoriesMapList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategoriesMapList: Self = this.set("EventCategoriesMapList", js.undefined)
  }
  
}

