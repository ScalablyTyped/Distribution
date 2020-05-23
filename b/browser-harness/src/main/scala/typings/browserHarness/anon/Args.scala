package typings.browserHarness.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var func: js.Function
}

object Args {
  @scala.inline
  def apply(func: js.Function, args: js.Array[_] = null): Args = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

