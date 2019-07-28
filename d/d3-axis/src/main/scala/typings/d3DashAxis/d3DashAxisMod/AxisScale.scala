package typings.d3DashAxis.d3DashAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisScale[Domain] extends js.Object {
  var bandwidth: js.UndefOr[js.Function0[Double]] = js.native
  def apply(x: Domain): js.UndefOr[Double] = js.native
  def copy(): this.type = js.native
  def domain(): js.Array[Domain] = js.native
  def range(): js.Array[Double] = js.native
}

