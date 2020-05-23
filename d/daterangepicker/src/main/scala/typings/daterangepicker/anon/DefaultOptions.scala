package typings.daterangepicker.anon

import typings.daterangepicker.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var defaultOptions: js.UndefOr[Options] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(defaultOptions: Options = null): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

