package typings.d3.mod

import typings.d3Axis.mod.Axis
import typings.d3Axis.mod.AxisDomain
import typings.d3Axis.mod.AxisScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "axisTop")
@js.native
object axisTop extends js.Object {
  def apply[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = js.native
}

