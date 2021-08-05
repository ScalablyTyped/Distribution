package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHsmResponse extends StObject {
  
  /**
    * The status of the operation.
    */
  var Status: String
}
object DeleteHsmResponse {
  
  inline def apply(Status: String): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmResponse]
  }
  
  extension [Self <: DeleteHsmResponse](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
