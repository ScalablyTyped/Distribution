package typings.chui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryEventInterface extends StObject {
  
  def Event(name: String): JQueryEventObject
  def Event(name: String, eventProperties: js.Any): JQueryEventObject
  @JSName("Event")
  var Event_Original: JQueryEventConstructor
}
object JQueryEventInterface {
  
  @scala.inline
  def apply(Event: JQueryEventConstructor): JQueryEventInterface = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryEventInterface]
  }
  
  @scala.inline
  implicit class JQueryEventInterfaceMutableBuilder[Self <: JQueryEventInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: JQueryEventConstructor): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
  }
}
