package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keySessionCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySessionEvent
  extends StObject
     with Event {
  
  var data: SessionToken | Null
  
  var error: js.UndefOr[DashJSError] = js.undefined
  
  @JSName("type")
  var type_KeySessionEvent: public_keySessionCreated
}
object KeySessionEvent {
  
  inline def apply(): KeySessionEvent = {
    val __obj = js.Dynamic.literal(data = null)
    __obj.updateDynamic("type")("public_keySessionCreated")
    __obj.asInstanceOf[KeySessionEvent]
  }
  
  extension [Self <: KeySessionEvent](x: Self) {
    
    inline def setData(value: SessionToken): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setError(value: DashJSError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setType(value: public_keySessionCreated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
