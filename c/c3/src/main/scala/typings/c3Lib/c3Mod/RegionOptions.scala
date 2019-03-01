package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOptions extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var start: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
}

object RegionOptions {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    `class`: java.lang.String = null,
    end: java.lang.String | scala.Double | stdLib.Date = null,
    start: java.lang.String | scala.Double | stdLib.Date = null
  ): RegionOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionOptions]
  }
}

