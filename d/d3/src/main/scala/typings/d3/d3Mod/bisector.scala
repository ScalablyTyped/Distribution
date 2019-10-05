package typings.d3.d3Mod

import typings.d3DashArray.d3DashArrayMod.Bisector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "bisector")
@js.native
object bisector extends js.Object {
  def apply[T, U](accessor: js.Function1[/* x */ T, U]): Bisector[T, U] = js.native
  def apply[T, U](comparator: js.Function2[/* a */ T, /* b */ U, Double]): Bisector[T, U] = js.native
}

