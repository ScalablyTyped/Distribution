package typings
package d3DashAxisLib.d3DashAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisScale[Domain] extends js.Object {
  var bandwidth: js.UndefOr[js.Function0[scala.Double]] = js.native
  def apply(x: Domain): js.UndefOr[scala.Double] = js.native
  def copy(): this.type = js.native
  def domain(): js.Array[Domain] = js.native
  def range(): js.Array[scala.Double] = js.native
}

