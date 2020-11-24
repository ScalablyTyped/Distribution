package typings.d3Array.mod

import typings.std.Float64Array
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "cumsum")
@js.native
object cumsum extends js.Object {
  
  def apply[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): Float64Array = js.native
  def apply[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Float64Array = js.native
}
