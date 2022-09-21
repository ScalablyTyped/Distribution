package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_protectioncreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionCreatedEvent
  extends StObject
     with Event {
  
  var controller: js.Object
  
  @JSName("type")
  var type_ProtectionCreatedEvent: public_protectioncreated
}
object ProtectionCreatedEvent {
  
  inline def apply(controller: js.Object): ProtectionCreatedEvent = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_protectioncreated")
    __obj.asInstanceOf[ProtectionCreatedEvent]
  }
  
  extension [Self <: ProtectionCreatedEvent](x: Self) {
    
    inline def setController(value: js.Object): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setType(value: public_protectioncreated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
