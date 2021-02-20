package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
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
  implicit class ICollisionEventMutableBuilder[Self <: ICollisionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
  }
}
