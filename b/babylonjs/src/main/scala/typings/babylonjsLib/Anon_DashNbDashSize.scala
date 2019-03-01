package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DashNbDashSize extends js.Object {
  var dashNb: js.UndefOr[scala.Double] = js.undefined
  var dashSize: js.UndefOr[scala.Double] = js.undefined
  var gapSize: js.UndefOr[scala.Double] = js.undefined
  var instance: js.UndefOr[babylonjsLib.BABYLONNs.LinesMesh] = js.undefined
  var points: js.Array[babylonjsLib.BABYLONNs.Vector3]
  var updatable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DashNbDashSize {
  @scala.inline
  def apply(
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    dashNb: scala.Int | scala.Double = null,
    dashSize: scala.Int | scala.Double = null,
    gapSize: scala.Int | scala.Double = null,
    instance: babylonjsLib.BABYLONNs.LinesMesh = null,
    updatable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DashNbDashSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("points")(points)
    if (dashNb != null) __obj.updateDynamic("dashNb")(dashNb.asInstanceOf[js.Any])
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable)
    __obj.asInstanceOf[Anon_DashNbDashSize]
  }
}

