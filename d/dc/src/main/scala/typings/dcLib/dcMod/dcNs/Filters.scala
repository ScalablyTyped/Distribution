package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  def RangedFilter(low: js.Any, high: js.Any): Filter
  def RangedTwoDimensionalFilter(arr: js.Array[_]): Filter
  def TwoDimensionalFilter(arr: js.Array[_]): Filter
}

object Filters {
  @scala.inline
  def apply(
    RangedFilter: js.Function2[js.Any, js.Any, Filter],
    RangedTwoDimensionalFilter: js.Function1[js.Array[_], Filter],
    TwoDimensionalFilter: js.Function1[js.Array[_], Filter]
  ): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RangedFilter")(RangedFilter)
    __obj.updateDynamic("RangedTwoDimensionalFilter")(RangedTwoDimensionalFilter)
    __obj.updateDynamic("TwoDimensionalFilter")(TwoDimensionalFilter)
    __obj.asInstanceOf[Filters]
  }
}

