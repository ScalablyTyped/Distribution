package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBind extends js.Object {
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any
  def part(target: Function, args: js.Any*): js.Any
}

object AnonBind {
  @scala.inline
  def apply(
    bind: (Function, js.Any, /* repeated */ js.Any) => js.Any,
    part: (Function, /* repeated */ js.Any) => js.Any
  ): AnonBind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), part = js.Any.fromFunction2(part))
  
    __obj.asInstanceOf[AnonBind]
  }
}

