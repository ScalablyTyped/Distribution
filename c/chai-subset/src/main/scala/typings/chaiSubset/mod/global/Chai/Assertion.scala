package typings.chaiSubset.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assertion extends js.Object {
  
  def containSubset(expected: js.Any): Assertion = js.native
}
object Assertion {
  
  @scala.inline
  def apply(containSubset: js.Any => Assertion): Assertion = {
    val __obj = js.Dynamic.literal(containSubset = js.Any.fromFunction1(containSubset))
    __obj.asInstanceOf[Assertion]
  }
  
  @scala.inline
  implicit class AssertionOps[Self <: Assertion] (val x: Self) extends AnyVal {
    
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
    def setContainSubset(value: js.Any => Assertion): Self = this.set("containSubset", js.Any.fromFunction1(value))
  }
}
