package typings.coreJs.anon

import typings.coreJs.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bind extends js.Object {
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any
  def part(target: Function, args: js.Any*): js.Any
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
}

