package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCategoriesMap extends StObject {
  
  /**
    * The event categories for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  
  /**
    * The source type that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.undefined
}
object EventCategoriesMap {
  
  @scala.inline
  def apply(): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMap]
  }
  
  @scala.inline
  implicit class EventCategoriesMapMutableBuilder[Self <: EventCategoriesMap] (val x: Self) extends AnyVal {
    
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
