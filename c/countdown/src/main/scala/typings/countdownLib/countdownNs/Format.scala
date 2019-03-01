package typings
package countdownLib.countdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var delim: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var formatNumber: js.UndefOr[js.Function1[/* value */ scala.Double, java.lang.String]] = js.undefined
  var formatter: js.UndefOr[
    js.Function2[/* value */ scala.Double, /* unit */ scala.Double, java.lang.String]
  ] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var plural: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var singular: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    delim: java.lang.String = null,
    empty: java.lang.String = null,
    formatNumber: js.Function1[/* value */ scala.Double, java.lang.String] = null,
    formatter: js.Function2[/* value */ scala.Double, /* unit */ scala.Double, java.lang.String] = null,
    last: java.lang.String = null,
    plural: java.lang.String | js.Array[java.lang.String] = null,
    singular: java.lang.String | js.Array[java.lang.String] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (delim != null) __obj.updateDynamic("delim")(delim)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (formatNumber != null) __obj.updateDynamic("formatNumber")(formatNumber)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (last != null) __obj.updateDynamic("last")(last)
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (singular != null) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

