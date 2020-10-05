package typings.d3Array.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "scan")
@js.native
object scan extends js.Object {
  def apply(array: Iterable[Double]): js.UndefOr[Double] = js.native
  def apply(array: Iterable[Double], comparator: js.Function2[/* a */ Double, /* b */ Double, Double]): js.UndefOr[Double] = js.native
}

