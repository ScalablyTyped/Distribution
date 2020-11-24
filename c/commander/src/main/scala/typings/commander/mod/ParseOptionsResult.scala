package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptionsResult extends js.Object {
  
  var operands: js.Array[String] = js.native
  
  var unknown: js.Array[String] = js.native
}
object ParseOptionsResult {
  
  @scala.inline
  def apply(operands: js.Array[String], unknown: js.Array[String]): ParseOptionsResult = {
    val __obj = js.Dynamic.literal(operands = operands.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptionsResult]
  }
  
  @scala.inline
  implicit class ParseOptionsResultOps[Self <: ParseOptionsResult] (val x: Self) extends AnyVal {
    
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
    def setOperandsVarargs(value: String*): Self = this.set("operands", js.Array(value :_*))
    
    @scala.inline
    def setOperands(value: js.Array[String]): Self = this.set("operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownVarargs(value: String*): Self = this.set("unknown", js.Array(value :_*))
    
    @scala.inline
    def setUnknown(value: js.Array[String]): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
}
