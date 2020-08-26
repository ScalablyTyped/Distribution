package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoryGroup extends js.Object {
  /**
    *  A list of event categories from a source type that you've chosen.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-server | security-group | replication-task
    */
  var SourceType: js.UndefOr[String] = js.native
}

object EventCategoryGroup {
  @scala.inline
  def apply(): EventCategoryGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoryGroup]
  }
  @scala.inline
  implicit class EventCategoryGroupOps[Self <: EventCategoryGroup] (val x: Self) extends AnyVal {
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

