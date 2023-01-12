package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keySystemSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySystemSelectedEvent
  extends StObject
     with Event {
  
  var data: js.Object | Null
  
  var error: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_KeySystemSelectedEvent: public_keySystemSelected
}
object KeySystemSelectedEvent {
  
  inline def apply(): KeySystemSelectedEvent = {
    val __obj = js.Dynamic.literal(data = null)
    __obj.updateDynamic("type")("public_keySystemSelected")
    __obj.asInstanceOf[KeySystemSelectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySystemSelectedEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setType(value: public_keySystemSelected): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
