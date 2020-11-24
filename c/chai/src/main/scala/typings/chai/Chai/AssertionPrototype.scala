package typings.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertionPrototype extends js.Object {
  
  var _obj: js.Any = js.native
  
  def assert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AssertionArgs is not an array type */ args: AssertionArgs
  ): Unit = js.native
}
object AssertionPrototype {
  
  @scala.inline
  def apply(_obj: js.Any, assert: AssertionArgs => Unit): AssertionPrototype = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any], assert = js.Any.fromFunction1(assert))
    __obj.asInstanceOf[AssertionPrototype]
  }
  
  @scala.inline
  implicit class AssertionPrototypeOps[Self <: AssertionPrototype] (val x: Self) extends AnyVal {
    
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
    def set_obj(value: js.Any): Self = this.set("_obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssert(value: AssertionArgs => Unit): Self = this.set("assert", js.Any.fromFunction1(value))
  }
}
