package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keyMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMessageEvent extends Event {
  
  var data: KeyMessage = js.native
  
  @JSName("type")
  var type_KeyMessageEvent: public_keyMessage = js.native
}
object KeyMessageEvent {
  
  @scala.inline
  def apply(data: KeyMessage, `type`: public_keyMessage): KeyMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMessageEvent]
  }
  
  @scala.inline
  implicit class KeyMessageEventMutableBuilder[Self <: KeyMessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: KeyMessage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_keyMessage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
