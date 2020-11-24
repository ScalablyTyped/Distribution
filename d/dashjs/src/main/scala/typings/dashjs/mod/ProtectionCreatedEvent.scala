package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_protectioncreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionCreatedEvent extends Event {
  
  var controller: js.Object = js.native
  
  var manifest: js.Object = js.native
  
  @JSName("type")
  var type_ProtectionCreatedEvent: public_protectioncreated = js.native
}
object ProtectionCreatedEvent {
  
  @scala.inline
  def apply(controller: js.Object, manifest: js.Object, `type`: public_protectioncreated): ProtectionCreatedEvent = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionCreatedEvent]
  }
  
  @scala.inline
  implicit class ProtectionCreatedEventOps[Self <: ProtectionCreatedEvent] (val x: Self) extends AnyVal {
    
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
    def setController(value: js.Object): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: js.Object): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_protectioncreated): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
