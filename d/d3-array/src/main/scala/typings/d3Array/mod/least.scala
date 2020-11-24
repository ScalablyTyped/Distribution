package typings.d3Array.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "least")
@js.native
object least extends js.Object {
  
  def apply[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  def apply[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = js.native
  def apply[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[T] = js.native
}
