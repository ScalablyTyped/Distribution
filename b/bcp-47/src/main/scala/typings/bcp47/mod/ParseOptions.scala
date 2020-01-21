package typings.bcp47.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var forgiving: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var warning: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* errorCode */ ErrorCodes, /* offset */ Double, Unit]
  ] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    forgiving: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    warning: (/* errorMessage */ String, /* errorCode */ ErrorCodes, /* offset */ Double) => Unit = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forgiving)) __obj.updateDynamic("forgiving")(forgiving.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(js.Any.fromFunction3(warning))
    __obj.asInstanceOf[ParseOptions]
  }
}

