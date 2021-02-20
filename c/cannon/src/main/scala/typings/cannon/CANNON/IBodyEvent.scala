package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBodyEvent extends IEvent {
  
  var body: Body = js.native
}
object IBodyEvent {
  
  @scala.inline
  def apply(body: Body, `type`: String): IBodyEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyEvent]
  }
  
  @scala.inline
  implicit class IBodyEventMutableBuilder[Self <: IBodyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
