package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keySessionClosed
import typings.dashjs.dashjsStrings.public_keySessionRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySessionClosedEvent extends Event {
  
  var data: String | Null = js.native
  
  var error: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_KeySessionClosedEvent: public_keySessionClosed | public_keySessionRemoved = js.native
}
object KeySessionClosedEvent {
  
  @scala.inline
  def apply(`type`: public_keySessionClosed | public_keySessionRemoved): KeySessionClosedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySessionClosedEvent]
  }
  
  @scala.inline
  implicit class KeySessionClosedEventOps[Self <: KeySessionClosedEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: public_keySessionClosed | public_keySessionRemoved): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
