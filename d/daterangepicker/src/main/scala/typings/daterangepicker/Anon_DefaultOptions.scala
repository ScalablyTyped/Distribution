package typings.daterangepicker

import typings.daterangepicker.daterangepickerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultOptions extends js.Object {
  var defaultOptions: js.UndefOr[Options] = js.undefined
}

object Anon_DefaultOptions {
  @scala.inline
  def apply(defaultOptions: Options = null): Anon_DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    __obj.asInstanceOf[Anon_DefaultOptions]
  }
}

