package typings.countdown.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var delim: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[String] = js.undefined
  var formatNumber: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  var formatter: js.UndefOr[js.Function2[/* value */ Double, /* unit */ Double, String]] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var plural: js.UndefOr[String | js.Array[String]] = js.undefined
  var singular: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    delim: String = null,
    empty: String = null,
    formatNumber: /* value */ Double => String = null,
    formatter: (/* value */ Double, /* unit */ Double) => String = null,
    last: String = null,
    plural: String | js.Array[String] = null,
    singular: String | js.Array[String] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (delim != null) __obj.updateDynamic("delim")(delim.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (formatNumber != null) __obj.updateDynamic("formatNumber")(js.Any.fromFunction1(formatNumber))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2(formatter))
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (singular != null) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

