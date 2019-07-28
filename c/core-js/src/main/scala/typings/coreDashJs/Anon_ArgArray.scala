package typings.coreDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgArray extends js.Object {
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any
  def part(target: Function, args: js.Any*): js.Any
}

object Anon_ArgArray {
  @scala.inline
  def apply(
    bind: (Function, js.Any, /* repeated */ js.Any) => js.Any,
    part: (Function, /* repeated */ js.Any) => js.Any
  ): Anon_ArgArray = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), part = js.Any.fromFunction2(part))
  
    __obj.asInstanceOf[Anon_ArgArray]
  }
}

