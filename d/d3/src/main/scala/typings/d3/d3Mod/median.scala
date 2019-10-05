package typings.d3.d3Mod

import typings.d3DashArray.d3DashArrayMod.Numeric
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "median")
@js.native
object median extends js.Object {
  def apply[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def apply[T](
    array: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
}

