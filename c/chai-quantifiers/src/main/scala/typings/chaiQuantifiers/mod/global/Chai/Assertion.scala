package typings.chaiQuantifiers.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assertion extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-generics
  def containAll[T](cb: js.Function1[/* item */ T, Boolean]): Unit = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def containExactlyOne[T](cb: js.Function1[/* item */ T, Boolean]): Unit = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def containOne[T](cb: js.Function1[/* item */ T, Boolean]): Unit = js.native
}
object Assertion {
  
  @scala.inline
  def apply(
    containAll: js.Function1[js.Any, Boolean] => Unit,
    containExactlyOne: js.Function1[js.Any, Boolean] => Unit,
    containOne: js.Function1[js.Any, Boolean] => Unit
  ): Assertion = {
    val __obj = js.Dynamic.literal(containAll = js.Any.fromFunction1(containAll), containExactlyOne = js.Any.fromFunction1(containExactlyOne), containOne = js.Any.fromFunction1(containOne))
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
    def setContainAll(value: js.Function1[js.Any, Boolean] => Unit): Self = this.set("containAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainExactlyOne(value: js.Function1[js.Any, Boolean] => Unit): Self = this.set("containExactlyOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainOne(value: js.Function1[js.Any, Boolean] => Unit): Self = this.set("containOne", js.Any.fromFunction1(value))
  }
}
