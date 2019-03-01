package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPoint extends js.Object {
  var r: js.UndefOr[scala.Double] = js.undefined
  var t: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var y: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
}

object ChartPoint {
  @scala.inline
  def apply(
    r: scala.Int | scala.Double = null,
    t: scala.Double | java.lang.String | stdLib.Date = null,
    x: scala.Double | java.lang.String | stdLib.Date = null,
    y: scala.Double | java.lang.String | stdLib.Date = null
  ): ChartPoint = {
    val __obj = js.Dynamic.literal()
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPoint]
  }
}

