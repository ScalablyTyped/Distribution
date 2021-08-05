package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventTypeRequest extends StObject {
  
  /**
    * The name of the event type to delete.
    */
  var name: identifier
}
object DeleteEventTypeRequest {
  
  inline def apply(name: identifier): DeleteEventTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventTypeRequest]
  }
  
  extension [Self <: DeleteEventTypeRequest](x: Self) {
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
