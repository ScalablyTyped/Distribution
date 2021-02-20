package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  
  var length: Double = js.native
}
object LengthValidatorConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](length: Double, message: String): LengthValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValidatorConfig[T]]
  }
  
  @scala.inline
  implicit class LengthValidatorConfigMutableBuilder[Self <: LengthValidatorConfig[_], T /* <: js.Object */] (val x: Self with LengthValidatorConfig[T]) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
