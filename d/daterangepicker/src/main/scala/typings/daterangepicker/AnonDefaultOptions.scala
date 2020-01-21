package typings.daterangepicker

import typings.daterangepicker.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultOptions extends js.Object {
  var defaultOptions: js.UndefOr[Options] = js.undefined
}

object AnonDefaultOptions {
  @scala.inline
  def apply(defaultOptions: Options = null): AnonDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultOptions]
  }
}

