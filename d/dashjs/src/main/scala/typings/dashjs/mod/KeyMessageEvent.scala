package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keyMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMessageEvent
  extends StObject
     with Event {
  
  var data: KeyMessage
  
  @JSName("type")
  var type_KeyMessageEvent: public_keyMessage
}
object KeyMessageEvent {
  
  inline def apply(data: KeyMessage): KeyMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_keyMessage")
    __obj.asInstanceOf[KeyMessageEvent]
  }
  
  extension [Self <: KeyMessageEvent](x: Self) {
    
    inline def setData(value: KeyMessage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: public_keyMessage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
