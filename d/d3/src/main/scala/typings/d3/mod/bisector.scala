package typings.d3.mod

import typings.d3Array.mod.Bisector_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "bisector")
@js.native
object bisector extends js.Object {
  
  def apply[T, U](accessor: js.Function1[/* x */ T, U]): Bisector_[T, U] = js.native
  def apply[T, U](comparator: js.Function2[/* a */ T, /* b */ U, Double]): Bisector_[T, U] = js.native
}
