package typings
package csvDashStringifyLib.csvDashStringifyMod.stringifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOpts extends js.Object {
  var bool: js.UndefOr[js.Function1[/* value */ scala.Boolean, java.lang.String]] = js.undefined
  var date: js.UndefOr[js.Function1[/* value */ stdLib.Date, java.lang.String]] = js.undefined
  var `object`: js.UndefOr[js.Function1[/* value */ js.Any, java.lang.String]] = js.undefined
}

object FormatterOpts {
  @scala.inline
  def apply(
    bool: js.Function1[/* value */ scala.Boolean, java.lang.String] = null,
    date: js.Function1[/* value */ stdLib.Date, java.lang.String] = null,
    `object`: js.Function1[/* value */ js.Any, java.lang.String] = null
  ): FormatterOpts = {
    val __obj = js.Dynamic.literal()
    if (bool != null) __obj.updateDynamic("bool")(bool)
    if (date != null) __obj.updateDynamic("date")(date)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[FormatterOpts]
  }
}

