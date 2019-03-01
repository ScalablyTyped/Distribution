package typings
package contentDashRangeLib.contentDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRangeFormatOptions extends js.Object {
  var first: js.UndefOr[scala.Double] = js.undefined
  var last: js.UndefOr[scala.Double] = js.undefined
  var length: scala.Double | scala.Null
  var limit: js.UndefOr[scala.Double] = js.undefined
  var unit: java.lang.String
}

object ContentRangeFormatOptions {
  @scala.inline
  def apply(
    unit: java.lang.String,
    first: scala.Int | scala.Double = null,
    last: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null
  ): ContentRangeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unit")(unit)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeFormatOptions]
  }
}

