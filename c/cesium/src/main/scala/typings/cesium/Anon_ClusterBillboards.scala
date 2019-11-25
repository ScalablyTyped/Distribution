package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClusterBillboards extends js.Object {
  var clusterBillboards: js.UndefOr[Boolean] = js.undefined
  var clusterLabels: js.UndefOr[Boolean] = js.undefined
  var clusterPoints: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var minimumClusterSize: js.UndefOr[Double] = js.undefined
  var pixelRange: js.UndefOr[Double] = js.undefined
}

object Anon_ClusterBillboards {
  @scala.inline
  def apply(
    clusterBillboards: js.UndefOr[Boolean] = js.undefined,
    clusterLabels: js.UndefOr[Boolean] = js.undefined,
    clusterPoints: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    minimumClusterSize: Int | Double = null,
    pixelRange: Int | Double = null
  ): Anon_ClusterBillboards = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clusterBillboards)) __obj.updateDynamic("clusterBillboards")(clusterBillboards.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterLabels)) __obj.updateDynamic("clusterLabels")(clusterLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterPoints)) __obj.updateDynamic("clusterPoints")(clusterPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (minimumClusterSize != null) __obj.updateDynamic("minimumClusterSize")(minimumClusterSize.asInstanceOf[js.Any])
    if (pixelRange != null) __obj.updateDynamic("pixelRange")(pixelRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClusterBillboards]
  }
}

