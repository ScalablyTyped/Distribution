package typings.chui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryEventInterface extends StObject {
  
  def Event(name: String): JQueryEventObject
  def Event(name: String, eventProperties: Any): JQueryEventObject
  @JSName("Event")
  var Event_Original: JQueryEventConstructor
}
object JQueryEventInterface {
  
  inline def apply(Event: JQueryEventConstructor): JQueryEventInterface = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryEventInterface]
  }
  
  extension [Self <: JQueryEventInterface](x: Self) {
    
    inline def setEvent(value: JQueryEventConstructor): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
  }
}
