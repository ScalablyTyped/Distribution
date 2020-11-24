package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_protectiondestroyed
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
  implicit class ProtectionDestroyedEventOps[Self <: ProtectionDestroyedEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_protectiondestroyed): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
