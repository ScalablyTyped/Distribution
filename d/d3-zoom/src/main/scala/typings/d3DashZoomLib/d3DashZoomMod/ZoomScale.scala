package typings
package d3DashZoomLib.d3DashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomScale extends js.Object {
  def copy(): ZoomScale = js.native
  def domain(): js.Array[stdLib.Date | scala.Double] = js.native
  def domain(domain: js.Array[stdLib.Date | scala.Double]): this.type = js.native
  def invert(value: scala.Double): scala.Double | stdLib.Date = js.native
  def range(): js.Array[scala.Double] = js.native
  def range(range: js.Array[scala.Double]): this.type = js.native
}

