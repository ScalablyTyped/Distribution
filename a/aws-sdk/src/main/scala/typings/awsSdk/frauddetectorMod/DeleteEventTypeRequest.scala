package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventTypeRequest extends StObject {
  
  /**
    * The name of the event type to delete.
    */
  var name: identifier = js.native
}
object DeleteEventTypeRequest {
  
  @scala.inline
  def apply(name: identifier): DeleteEventTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventTypeRequest]
  }
  
  @scala.inline
  implicit class DeleteEventTypeRequestMutableBuilder[Self <: DeleteEventTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
