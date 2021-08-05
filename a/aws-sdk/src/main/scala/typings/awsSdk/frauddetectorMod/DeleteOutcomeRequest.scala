package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutcomeRequest extends StObject {
  
  /**
    * The name of the outcome to delete.
    */
  var name: identifier
}
object DeleteOutcomeRequest {
  
  inline def apply(name: identifier): DeleteOutcomeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutcomeRequest]
  }
  
  extension [Self <: DeleteOutcomeRequest](x: Self) {
    
    inline def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
