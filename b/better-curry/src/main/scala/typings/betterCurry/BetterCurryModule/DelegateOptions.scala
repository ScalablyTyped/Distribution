package typings.betterCurry.BetterCurryModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegateOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var len: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object DelegateOptions {
  @scala.inline
  def apply(args: js.Array[_] = null, as: String = null, len: Int | Double = null, name: String = null): DelegateOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegateOptions]
  }
}

