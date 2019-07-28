package typings.cypress.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValHook[TElement] extends js.Object {
  var get: js.UndefOr[js.Function1[/* elem */ TElement, _]] = js.undefined
  var set: js.UndefOr[js.Function2[/* elem */ TElement, /* value */ js.Any, _]] = js.undefined
}

object ValHook {
  @scala.inline
  def apply[TElement](get: /* elem */ TElement => _ = null, set: (/* elem */ TElement, /* value */ js.Any) => _ = null): ValHook[TElement] = {
    val __obj = js.Dynamic.literal()
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    __obj.asInstanceOf[ValHook[TElement]]
  }
}

