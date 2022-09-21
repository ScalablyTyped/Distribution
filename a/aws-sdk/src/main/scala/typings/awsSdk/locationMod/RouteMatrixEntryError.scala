package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteMatrixEntryError extends StObject {
  
  /**
    * The type of error which occurred for the route calculation.
    */
  var Code: RouteMatrixErrorCode
  
  /**
    * A message about the error that occurred for the route calculation.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object RouteMatrixEntryError {
  
  inline def apply(Code: RouteMatrixErrorCode): RouteMatrixEntryError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteMatrixEntryError]
  }
  
  extension [Self <: RouteMatrixEntryError](x: Self) {
    
    inline def setCode(value: RouteMatrixErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
