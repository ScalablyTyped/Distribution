package typings.coreJs.anon

import typings.coreJs.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bind extends js.Object {
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any = js.native
  def part(target: Function, args: js.Any*): js.Any = js.native
}

object Bind {
  @scala.inline
  def apply(
    bind: (Function, js.Any, /* repeated */ js.Any) => js.Any,
    part: (Function, /* repeated */ js.Any) => js.Any
  ): Bind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), part = js.Any.fromFunction2(part))
    __obj.asInstanceOf[Bind]
  }
  @scala.inline
  implicit class BindOps[Self <: Bind] (val x: Self) extends AnyVal {
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
    def setBind(value: (Function, js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("bind", js.Any.fromFunction3(value))
    @scala.inline
    def setPart(value: (Function, /* repeated */ js.Any) => js.Any): Self = this.set("part", js.Any.fromFunction2(value))
  }
  
}

