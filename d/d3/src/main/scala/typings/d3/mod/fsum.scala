package typings.d3.mod

import typings.d3Array.mod.Numeric
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "fsum")
@js.native
object fsum extends js.Object {
  
  def apply[T /* <: Numeric */](values: Iterable[js.UndefOr[T | Null]]): Double = js.native
  def apply[T](
    values: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = js.native
}
