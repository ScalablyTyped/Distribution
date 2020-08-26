package typings.curriable.anon

import typings.curriable.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arity[Fn /* <: Handler */] extends js.Object {
  var arity: Double = js.native
  var fn: Fn = js.native
}

object Arity {
  @scala.inline
  def apply[/* <: typings.curriable.mod.Handler */ Fn](arity: Double, fn: Fn): Arity[Fn] = {
    val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arity[Fn]]
  }
  @scala.inline
  implicit class ArityOps[Self <: Arity[_], /* <: typings.curriable.mod.Handler */ Fn] (val x: Self with Arity[Fn]) extends AnyVal {
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
    def setArity(value: Double): Self = this.set("arity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: Fn): Self = this.set("fn", value.asInstanceOf[js.Any])
  }
  
}

