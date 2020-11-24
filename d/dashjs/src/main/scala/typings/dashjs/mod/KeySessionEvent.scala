package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keySessionCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySessionEvent extends Event {
  
  var data: SessionToken | Null = js.native
  
  var error: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_KeySessionEvent: public_keySessionCreated = js.native
}
object KeySessionEvent {
  
  @scala.inline
  def apply(`type`: public_keySessionCreated): KeySessionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySessionEvent]
  }
  
  @scala.inline
  implicit class KeySessionEventOps[Self <: KeySessionEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: public_keySessionCreated): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: SessionToken): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
