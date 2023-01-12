package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keySessionClosed
import typings.dashjs.dashjsStrings.public_keySessionRemoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySessionClosedEvent
  extends StObject
     with Event {
  
  var data: String | Null
  
  var error: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_KeySessionClosedEvent: public_keySessionClosed | public_keySessionRemoved
}
object KeySessionClosedEvent {
  
  inline def apply(`type`: public_keySessionClosed | public_keySessionRemoved): KeySessionClosedEvent = {
    val __obj = js.Dynamic.literal(data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySessionClosedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySessionClosedEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setType(value: public_keySessionClosed | public_keySessionRemoved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
