package typings.babylonjs.anon

import typings.babylonjs.BABYLON.LinesMesh
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashSizeGapSize extends js.Object {
  var dashNb: js.UndefOr[Double] = js.undefined
  var dashSize: js.UndefOr[Double] = js.undefined
  var gapSize: js.UndefOr[Double] = js.undefined
  var instance: js.UndefOr[LinesMesh] = js.undefined
  var points: js.Array[Vector3]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object DashSizeGapSize {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    dashNb: js.UndefOr[Double] = js.undefined,
    dashSize: js.UndefOr[Double] = js.undefined,
    gapSize: js.UndefOr[Double] = js.undefined,
    instance: LinesMesh = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): DashSizeGapSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (!js.isUndefined(dashNb)) __obj.updateDynamic("dashNb")(dashNb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dashSize)) __obj.updateDynamic("dashSize")(dashSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gapSize)) __obj.updateDynamic("gapSize")(gapSize.get.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashSizeGapSize]
  }
}

