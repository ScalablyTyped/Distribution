package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregation extends js.Object {
  var avg: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
  var stdev: js.UndefOr[java.lang.String] = js.undefined
  var sum: js.UndefOr[java.lang.String] = js.undefined
  var `var`: js.UndefOr[java.lang.String] = js.undefined
}

object Aggregation {
  @scala.inline
  def apply(
    avg: java.lang.String = null,
    count: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    stdev: java.lang.String = null,
    sum: java.lang.String = null,
    `var`: java.lang.String = null
  ): Aggregation = {
    val __obj = js.Dynamic.literal()
    if (avg != null) __obj.updateDynamic("avg")(avg)
    if (count != null) __obj.updateDynamic("count")(count)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (stdev != null) __obj.updateDynamic("stdev")(stdev)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    if (`var` != null) __obj.updateDynamic("var")(`var`)
    __obj.asInstanceOf[Aggregation]
  }
}

