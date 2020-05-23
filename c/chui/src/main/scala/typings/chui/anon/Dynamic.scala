package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dynamic extends js.Object {
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  var dynamic: js.UndefOr[Boolean] = js.undefined
}

object Dynamic {
  @scala.inline
  def apply(callback: /* args */ js.UndefOr[js.Any] => _ = null, dynamic: js.UndefOr[Boolean] = js.undefined): Dynamic = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dynamic]
  }
}

