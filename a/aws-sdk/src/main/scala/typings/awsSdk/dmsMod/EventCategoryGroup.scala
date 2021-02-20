package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCategoryGroup extends StObject {
  
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
  implicit class EventCategoryGroupMutableBuilder[Self <: EventCategoryGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = StObject.set(x, "EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesUndefined: Self = StObject.set(x, "EventCategories", js.undefined)
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = StObject.set(x, "EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
