package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxParseResult extends js.Object {
  
  var errors: js.Array[String] = js.native
  
  var parseable: Boolean = js.native
}
object SyntaxParseResult {
  
  @scala.inline
  def apply(errors: js.Array[String], parseable: Boolean): SyntaxParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseable = parseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseResult]
  }
  
  @scala.inline
  implicit class SyntaxParseResultOps[Self <: SyntaxParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseable(value: Boolean): Self = this.set("parseable", value.asInstanceOf[js.Any])
  }
}
