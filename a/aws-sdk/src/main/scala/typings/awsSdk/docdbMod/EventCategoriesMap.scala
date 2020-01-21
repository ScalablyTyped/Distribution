package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMap extends js.Object {
  /**
    * The event categories for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The source type that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.native
}

object EventCategoriesMap {
  @scala.inline
  def apply(EventCategories: EventCategoriesList = null, SourceType: String = null): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCategoriesMap]
  }
}

