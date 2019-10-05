package typings.d3DashArray.d3DashArrayMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "quantile")
@js.native
object quantile extends js.Object {
  def apply[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  def apply[T](
    array: Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
}

