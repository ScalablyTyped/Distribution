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
  
  inline def apply[T](field: String, `type`: String, value: T): RemotePlayerChangedEvent[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePlayerChangedEvent[T]]
  }
  
  extension [Self <: RemotePlayerChangedEvent[?], T](x: Self & RemotePlayerChangedEvent[T]) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
