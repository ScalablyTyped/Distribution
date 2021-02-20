package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_protectiondestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionDestroyedEvent extends Event {
  
  var data: String = js.native
  
  @JSName("type")
  var type_ProtectionDestroyedEvent: public_protectiondestroyed = js.native
}
object ProtectionDestroyedEvent {
  
  @scala.inline
  def apply(data: String, `type`: public_protectiondestroyed): ProtectionDestroyedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionDestroyedEvent]
  }
  
  @scala.inline
  implicit class ProtectionDestroyedEventMutableBuilder[Self <: ProtectionDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_protectiondestroyed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
