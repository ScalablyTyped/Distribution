package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_protectiondestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionDestroyedEvent
  extends StObject
     with Event {
  
  var data: String
  
  @JSName("type")
  var type_ProtectionDestroyedEvent: public_protectiondestroyed
}
object ProtectionDestroyedEvent {
  
  inline def apply(data: String): ProtectionDestroyedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_protectiondestroyed")
    __obj.asInstanceOf[ProtectionDestroyedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectionDestroyedEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: public_protectiondestroyed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
