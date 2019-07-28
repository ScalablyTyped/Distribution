package typings.browserDashHarness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var func: js.Function
}

object Anon_Args {
  @scala.inline
  def apply(func: js.Function, args: js.Array[_] = null): Anon_Args = {
    val __obj = js.Dynamic.literal(func = func)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[Anon_Args]
  }
}

