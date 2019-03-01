package typings
package betterDashCurryLib.BetterCurryModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegateOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var as: js.UndefOr[java.lang.String] = js.undefined
  var len: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DelegateOptions {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    as: java.lang.String = null,
    len: scala.Int | scala.Double = null,
    name: java.lang.String = null
  ): DelegateOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (as != null) __obj.updateDynamic("as")(as)
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DelegateOptions]
  }
}

