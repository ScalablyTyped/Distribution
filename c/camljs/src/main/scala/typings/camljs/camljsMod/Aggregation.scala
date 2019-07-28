package typings.camljs.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregation extends js.Object {
  var avg: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var stdev: js.UndefOr[String] = js.undefined
  var sum: js.UndefOr[String] = js.undefined
  var `var`: js.UndefOr[String] = js.undefined
}

object Aggregation {
  @scala.inline
  def apply(
    avg: String = null,
    count: String = null,
    max: String = null,
    min: String = null,
    stdev: String = null,
    sum: String = null,
    `var`: String = null
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

