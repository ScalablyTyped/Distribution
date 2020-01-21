package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  var dynamic: js.UndefOr[Boolean] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply(callback: /* args */ js.UndefOr[js.Any] => _ = null, dynamic: js.UndefOr[Boolean] = js.undefined): AnonArgs = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

