package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMap extends js.Object {
  /**
    * The event categories for the specified source type
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The source type that the returned categories belong to
    */
  var SourceType: js.UndefOr[String] = js.native
}

object EventCategoriesMap {
  @scala.inline
  def apply(): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMap]
  }
  @scala.inline
  implicit class EventCategoriesMapOps[Self <: EventCategoriesMap] (val x: Self) extends AnyVal {
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
    def setEventCategoriesVarargs(value: String*): Self = this.set("EventCategories", js.Array(value :_*))
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = this.set("EventCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategories: Self = this.set("EventCategories", js.undefined)
    @scala.inline
    def setSourceType(value: String): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
  
}

