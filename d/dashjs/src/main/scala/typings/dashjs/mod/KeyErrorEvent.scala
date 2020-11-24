package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keyError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyErrorEvent extends Event {
  
  var data: KeyError = js.native
  
  @JSName("type")
  var type_KeyErrorEvent: public_keyError = js.native
}
object KeyErrorEvent {
  
  @scala.inline
  def apply(data: KeyError, `type`: public_keyError): KeyErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyErrorEvent]
  }
  
  @scala.inline
  implicit class KeyErrorEventOps[Self <: KeyErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: KeyError): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_keyError): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
