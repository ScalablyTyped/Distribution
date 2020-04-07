package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDashNb extends js.Object {
  var dashNb: js.UndefOr[Double] = js.undefined
  var dashSize: js.UndefOr[Double] = js.undefined
  var gapSize: js.UndefOr[Double] = js.undefined
  var points: js.Array[Vector3]
}

object AnonDashNb {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    dashNb: Int | Double = null,
    dashSize: Int | Double = null,
    gapSize: Int | Double = null
  ): AnonDashNb = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (dashNb != null) __obj.updateDynamic("dashNb")(dashNb.asInstanceOf[js.Any])
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDashNb]
  }
}

