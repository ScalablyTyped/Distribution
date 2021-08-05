package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBodyEvent
  extends StObject
     with IEvent {
  
  var body: Body
}
object IBodyEvent {
  
  inline def apply(body: Body, `type`: String): IBodyEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyEvent]
  }
  
  extension [Self <: IBodyEvent](x: Self) {
    
    inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
