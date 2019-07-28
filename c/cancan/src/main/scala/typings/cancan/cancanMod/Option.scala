package typings.cancan.cancanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var createError: js.UndefOr[js.Function0[_]] = js.undefined
  var instanceOf: js.UndefOr[js.Function2[/* instance */ js.Any, /* model */ js.Any, Boolean]] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    createError: () => _ = null,
    instanceOf: (/* instance */ js.Any, /* model */ js.Any) => Boolean = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (createError != null) __obj.updateDynamic("createError")(js.Any.fromFunction0(createError))
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(js.Any.fromFunction2(instanceOf))
    __obj.asInstanceOf[Option]
  }
}

