package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCategoriesMap extends StObject {
  
  /**
    * The events in the event category.
    */
  var Events: js.UndefOr[EventInfoMapList] = js.undefined
  
  /**
    * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.undefined
}
object EventCategoriesMap {
  
  inline def apply(): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMap]
  }
  
  extension [Self <: EventCategoriesMap](x: Self) {
    
    inline def setEvents(value: EventInfoMapList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: EventInfoMap*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
