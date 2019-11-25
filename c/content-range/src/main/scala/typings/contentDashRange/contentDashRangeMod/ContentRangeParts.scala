package typings.contentDashRange.contentDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRangeParts extends js.Object {
  var first: Double | Null
  var last: Double | Null
  var length: Double | Null
  var unit: String
}

object ContentRangeParts {
  @scala.inline
  def apply(unit: String, first: Int | Double = null, last: Int | Double = null, length: Int | Double = null): ContentRangeParts = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeParts]
  }
}

