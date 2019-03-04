package typings
package contentDashRangeLib.contentDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRangeParts extends js.Object {
  var first: scala.Double | scala.Null
  var last: scala.Double | scala.Null
  var length: scala.Double | scala.Null
  var unit: java.lang.String
}

object ContentRangeParts {
  @scala.inline
  def apply(
    unit: java.lang.String,
    first: scala.Int | scala.Double = null,
    last: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null
  ): ContentRangeParts = {
    val __obj = js.Dynamic.literal(unit = unit)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeParts]
  }
}

