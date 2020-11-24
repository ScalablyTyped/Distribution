package typings.d3.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "map")
@js.native
object map extends js.Object {
  
  def apply[T, U](
    iterable: Iterable[T],
    mapper: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], U]
  ): js.Array[U] = js.native
}
