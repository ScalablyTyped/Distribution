package typings.d3Array.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "maxIndex")
@js.native
object maxIndex extends js.Object {
  
  def apply[T](iterable: Iterable[T]): Double = js.native
  def apply[TDatum, U](
    iterable: Iterable[TDatum],
    accessor: js.Function3[
      /* datum */ TDatum, 
      /* index */ Double, 
      /* array */ Iterable[TDatum], 
      js.UndefOr[U | Null]
    ]
  ): Double = js.native
}
