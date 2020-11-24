package typings.d3.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "some")
@js.native
object some extends js.Object {
  
  def apply[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], _]
  ): Boolean = js.native
}
