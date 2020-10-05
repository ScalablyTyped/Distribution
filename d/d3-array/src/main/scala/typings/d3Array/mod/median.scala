package typings.d3Array.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "median")
@js.native
object median extends js.Object {
  def apply[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def apply[T](
    array: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
}

