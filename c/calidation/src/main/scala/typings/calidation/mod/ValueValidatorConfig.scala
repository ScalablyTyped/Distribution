package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValidatorConfig[P, T /* <: js.Object */]
  extends StObject
     with SimpleValidatorConfig[T] {
  
  var value: P
}
object ValueValidatorConfig {
  
  inline def apply[P, T /* <: js.Object */](message: String, value: P): ValueValidatorConfig[P, T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValidatorConfig[P, T]]
  }
  
  extension [Self <: ValueValidatorConfig[?, ?], P, T /* <: js.Object */](x: Self & (ValueValidatorConfig[P, T])) {
    
    inline def setValue(value: P): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
