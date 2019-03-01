package typings
package cancanLib.cancanMod.CanCanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var createError: js.UndefOr[js.Function0[_]] = js.undefined
  var instanceOf: js.UndefOr[js.Function2[/* instance */ js.Any, /* model */ js.Any, scala.Boolean]] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    createError: js.Function0[_] = null,
    instanceOf: js.Function2[/* instance */ js.Any, /* model */ js.Any, scala.Boolean] = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (createError != null) __obj.updateDynamic("createError")(createError)
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(instanceOf)
    __obj.asInstanceOf[Option]
  }
}

