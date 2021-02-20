package typings.calidation.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  
  var regex: RegExp = js.native
}
object RegexValidatorConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](message: String, regex: RegExp): RegexValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexValidatorConfig[T]]
  }
  
  @scala.inline
  implicit class RegexValidatorConfigMutableBuilder[Self <: RegexValidatorConfig[_], T /* <: js.Object */] (val x: Self with RegexValidatorConfig[T]) extends AnyVal {
    
    @scala.inline
    def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
