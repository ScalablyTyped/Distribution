package typings
package coreDashJsLib

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
    bind: js.Function3[Function, js.Any, /* repeated */ js.Any, js.Any],
    part: js.Function2[Function, /* repeated */ js.Any, js.Any]
  ): Anon_ArgArray = {
    val __obj = js.Dynamic.literal(bind = bind, part = part)
  
    __obj.asInstanceOf[Anon_ArgArray]
  }
}

