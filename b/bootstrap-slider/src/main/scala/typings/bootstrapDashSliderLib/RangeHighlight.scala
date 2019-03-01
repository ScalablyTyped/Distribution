package typings
package bootstrapDashSliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeHighlight extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object RangeHighlight {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): RangeHighlight = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeHighlight]
  }
}

