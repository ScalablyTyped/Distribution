package typings.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "quantileSorted")
@js.native
object quantileSorted extends js.Object {
  
  def apply[T /* <: Numeric */](array: js.Array[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  def apply[T](
    array: js.Array[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Array[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
}
