package typings
package daterangepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultOptions extends js.Object {
  var defaultOptions: js.UndefOr[daterangepickerLib.daterangepickerMod.daterangepickerNs.Options] = js.undefined
}

object Anon_DefaultOptions {
  @scala.inline
  def apply(defaultOptions: daterangepickerLib.daterangepickerMod.daterangepickerNs.Options = null): Anon_DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    __obj.asInstanceOf[Anon_DefaultOptions]
  }
}

