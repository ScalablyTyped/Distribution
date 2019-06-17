package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, reactLib.reactMod.ReactNode]] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply[T](children: /* args */ T => reactLib.reactMod.ReactNode = null): Anon_Args[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[Anon_Args[T]]
  }
}

