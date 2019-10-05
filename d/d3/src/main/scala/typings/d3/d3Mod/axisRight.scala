package typings.d3.d3Mod

import typings.d3DashAxis.d3DashAxisMod.Axis
import typings.d3DashAxis.d3DashAxisMod.AxisDomain
import typings.d3DashAxis.d3DashAxisMod.AxisScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "axisRight")
@js.native
object axisRight extends js.Object {
  def apply[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = js.native
}

