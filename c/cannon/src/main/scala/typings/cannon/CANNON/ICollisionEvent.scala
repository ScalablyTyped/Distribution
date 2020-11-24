package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollisionEvent extends IBodyEvent {
  
  var contact: js.Any = js.native
}
object ICollisionEvent {
  
  @scala.inline
  def apply(body: Body, contact: js.Any, `type`: String): ICollisionEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionEvent]
  }
  
  @scala.inline
  implicit class ICollisionEventOps[Self <: ICollisionEvent] (val x: Self) extends AnyVal {
    
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
    def setContact(value: js.Any): Self = this.set("contact", value.asInstanceOf[js.Any])
  }
}
