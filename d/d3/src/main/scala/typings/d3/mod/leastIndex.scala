package typings.d3.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "leastIndex")
@js.native
object leastIndex extends js.Object {
  
  def apply[T](iterable: Iterable[T]): js.UndefOr[Double] = js.native
  def apply[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = js.native
  def apply[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[Double] = js.native
}
