package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateError
  extends StObject
     with Error {
  
  var errors: Array[Any]
}
object AggregateError {
  
  inline def apply(errors: Array[Any], message: java.lang.String, name: java.lang.String): AggregateError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateError]
  }
  
  extension [Self <: AggregateError](x: Self) {
    
    inline def setErrors(value: Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
  }
}
