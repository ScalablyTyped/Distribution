package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  def HierarchyFilter(path: String): Filter
  def RangedFilter(low: Double, high: Double): Filter
  def RangedTwoDimensionalFilter(arr: js.Array[js.Array[Double]]): Filter
  def TwoDimensionalFilter(filter: js.Array[Double]): Filter
}

object Filters {
  @scala.inline
  def apply(
    HierarchyFilter: String => Filter,
    RangedFilter: (Double, Double) => Filter,
    RangedTwoDimensionalFilter: js.Array[js.Array[Double]] => Filter,
    TwoDimensionalFilter: js.Array[Double] => Filter
  ): Filters = {
    val __obj = js.Dynamic.literal(HierarchyFilter = js.Any.fromFunction1(HierarchyFilter), RangedFilter = js.Any.fromFunction2(RangedFilter), RangedTwoDimensionalFilter = js.Any.fromFunction1(RangedTwoDimensionalFilter), TwoDimensionalFilter = js.Any.fromFunction1(TwoDimensionalFilter))
  
    __obj.asInstanceOf[Filters]
  }
}

