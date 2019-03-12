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
    RangedFilter: (js.Any, js.Any) => Filter,
    RangedTwoDimensionalFilter: js.Array[_] => Filter,
    TwoDimensionalFilter: js.Array[_] => Filter
  ): Filters = {
    val __obj = js.Dynamic.literal(RangedFilter = js.Any.fromFunction2(RangedFilter), RangedTwoDimensionalFilter = js.Any.fromFunction1(RangedTwoDimensionalFilter), TwoDimensionalFilter = js.Any.fromFunction1(TwoDimensionalFilter))
  
    __obj.asInstanceOf[Filters]
  }
}

