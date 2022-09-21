package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePermissionsResponse extends StObject {
  
  /**
    * An array of structures that contain the errors from the operation, if any.
    */
  var errors: UpdateErrorList
}
object UpdatePermissionsResponse {
  
  inline def apply(errors: UpdateErrorList): UpdatePermissionsResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePermissionsResponse]
  }
  
  extension [Self <: UpdatePermissionsResponse](x: Self) {
    
    inline def setErrors(value: UpdateErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: UpdateError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
