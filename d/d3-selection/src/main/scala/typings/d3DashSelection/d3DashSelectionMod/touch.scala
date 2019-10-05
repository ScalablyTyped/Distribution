package typings.d3DashSelection.d3DashSelectionMod

import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-selection", "touch")
@js.native
object touch extends js.Object {
  def apply(container: ContainerElement, identifier: Double): (js.Tuple2[Double, Double]) | Null = js.native
  def apply(container: ContainerElement, touches: TouchList, identifier: Double): (js.Tuple2[Double, Double]) | Null = js.native
}

