package typings.d3Array.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "count")
@js.native
object count extends js.Object {
  
  def apply[TObject](iterable: Iterable[TObject]): Double = js.native
  def apply[TObject](
    iterable: Iterable[TObject],
    accessor: js.Function2[/* a */ TObject, /* b */ TObject, js.UndefOr[Double | Null]]
  ): Double = js.native
}
