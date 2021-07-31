package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemotePlayerChangedEvent[T]
  extends StObject
     with EventData {
  
  var field: String
  
  var value: T
}
object RemotePlayerChangedEvent {
  
  @scala.inline
  def apply[T](field: String, `type`: String, value: T): RemotePlayerChangedEvent[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePlayerChangedEvent[T]]
  }
  
  @scala.inline
  implicit class RemotePlayerChangedEventMutableBuilder[Self <: RemotePlayerChangedEvent[?], T] (val x: Self & RemotePlayerChangedEvent[T]) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
