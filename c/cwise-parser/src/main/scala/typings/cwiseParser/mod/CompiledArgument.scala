package typings.cwiseParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompiledArgument extends js.Object {
  
  var count: Double = js.native
  
  var lvalue: Boolean = js.native
  
  var name: String = js.native
  
  var rvalue: Boolean = js.native
}
object CompiledArgument {
  
  @scala.inline
  def apply(count: Double, lvalue: Boolean, name: String, rvalue: Boolean): CompiledArgument = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lvalue = lvalue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rvalue = rvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledArgument]
  }
  
  @scala.inline
  implicit class CompiledArgumentOps[Self <: CompiledArgument] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLvalue(value: Boolean): Self = this.set("lvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRvalue(value: Boolean): Self = this.set("rvalue", value.asInstanceOf[js.Any])
  }
}
