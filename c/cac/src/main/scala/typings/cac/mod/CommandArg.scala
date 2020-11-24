package typings.cac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandArg extends js.Object {
  
  var required: Boolean = js.native
  
  var value: String = js.native
  
  var variadic: Boolean = js.native
}
object CommandArg {
  
  @scala.inline
  def apply(required: Boolean, value: String, variadic: Boolean): CommandArg = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandArg]
  }
  
  @scala.inline
  implicit class CommandArgOps[Self <: CommandArg] (val x: Self) extends AnyVal {
    
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariadic(value: Boolean): Self = this.set("variadic", value.asInstanceOf[js.Any])
  }
}
