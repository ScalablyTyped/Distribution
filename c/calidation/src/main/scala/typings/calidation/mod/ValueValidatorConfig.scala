package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueValidatorConfig[P, T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  
  var value: P = js.native
}
object ValueValidatorConfig {
  
  @scala.inline
  def apply[P, T /* <: js.Object */](message: String, value: P): ValueValidatorConfig[P, T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValidatorConfig[P, T]]
  }
  
  @scala.inline
  implicit class ValueValidatorConfigMutableBuilder[Self <: ValueValidatorConfig[_, _], P, T /* <: js.Object */] (val x: Self with (ValueValidatorConfig[P, T])) extends AnyVal {
    
    @scala.inline
    def setValue(value: P): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
