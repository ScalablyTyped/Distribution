package typings.babylonjs

import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGapSize extends js.Object {
  var dashNb: js.UndefOr[Double] = js.undefined
  var dashSize: js.UndefOr[Double] = js.undefined
  var gapSize: js.UndefOr[Double] = js.undefined
  var instance: js.UndefOr[LinesMesh] = js.undefined
  var points: js.Array[Vector3]
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object AnonGapSize {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    dashNb: Int | Double = null,
    dashSize: Int | Double = null,
    gapSize: Int | Double = null,
    instance: LinesMesh = null,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): AnonGapSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (dashNb != null) __obj.updateDynamic("dashNb")(dashNb.asInstanceOf[js.Any])
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGapSize]
  }
}

