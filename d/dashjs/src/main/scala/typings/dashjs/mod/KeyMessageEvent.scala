package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keyMessage
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
  implicit class KeyMessageEventOps[Self <: KeyMessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: KeyMessage): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_keyMessage): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
