package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCategoriesMessage extends StObject {
  
  /**
    * A list of event category maps.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsSdk.docdbMod.EventCategoriesMapList] = js.native
}
object EventCategoriesMessage {
  
  @scala.inline
  def apply(): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMessage]
  }
  
  @scala.inline
  implicit class EventCategoriesMessageMutableBuilder[Self <: EventCategoriesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCategoriesMapList(value: EventCategoriesMapList): Self = StObject.set(x, "EventCategoriesMapList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesMapListUndefined: Self = StObject.set(x, "EventCategoriesMapList", js.undefined)
    
    @scala.inline
    def setEventCategoriesMapListVarargs(value: EventCategoriesMap*): Self = StObject.set(x, "EventCategoriesMapList", js.Array(value :_*))
  }
}
