package typings.babylonjs

import typings.babylonjs.BABYLON.LinesMesh
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDashSizeGapSize extends js.Object {
  var dashNb: js.UndefOr[Double] = js.undefined
  var dashSize: js.UndefOr[Double] = js.undefined
  var gapSize: js.UndefOr[Double] = js.undefined
  var instance: js.UndefOr[LinesMesh] = js.undefined
  var points: js.Array[Vector3]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object AnonDashSizeGapSize {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    dashNb: Int | Double = null,
    dashSize: Int | Double = null,
    gapSize: Int | Double = null,
    instance: LinesMesh = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): AnonDashSizeGapSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (dashNb != null) __obj.updateDynamic("dashNb")(dashNb.asInstanceOf[js.Any])
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDashSizeGapSize]
  }
}

