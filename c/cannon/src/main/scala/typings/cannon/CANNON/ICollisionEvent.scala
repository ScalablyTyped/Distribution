package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollisionEvent
  extends StObject
     with IBodyEvent {
  
  var contact: Any
}
object ICollisionEvent {
  
  inline def apply(body: Body, contact: Any, target: Body, `type`: String): ICollisionEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionEvent]
  }
  
  extension [Self <: ICollisionEvent](x: Self) {
    
    inline def setContact(value: Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
  }
}
