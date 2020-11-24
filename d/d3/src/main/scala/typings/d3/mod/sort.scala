package typings.d3.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "sort")
@js.native
object sort extends js.Object {
  
  def apply[T](iterable: Iterable[T]): js.Array[T] = js.native
  def apply[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
}
