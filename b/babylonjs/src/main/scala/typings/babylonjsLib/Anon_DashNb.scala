package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DashNb extends js.Object {
  var dashNb: js.UndefOr[scala.Double] = js.undefined
  var dashSize: js.UndefOr[scala.Double] = js.undefined
  var gapSize: js.UndefOr[scala.Double] = js.undefined
  var points: js.Array[babylonjsLib.BABYLONNs.Vector3]
}

object Anon_DashNb {
  @scala.inline
  def apply(
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    dashNb: scala.Int | scala.Double = null,
    dashSize: scala.Int | scala.Double = null,
    gapSize: scala.Int | scala.Double = null
  ): Anon_DashNb = {
    val __obj = js.Dynamic.literal(points = points)
    if (dashNb != null) __obj.updateDynamic("dashNb")(dashNb.asInstanceOf[js.Any])
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DashNb]
  }
}

