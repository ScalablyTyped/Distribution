package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterBillboards extends js.Object {
  var clusterBillboards: js.UndefOr[Boolean] = js.undefined
  var clusterLabels: js.UndefOr[Boolean] = js.undefined
  var clusterPoints: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var minimumClusterSize: js.UndefOr[Double] = js.undefined
  var pixelRange: js.UndefOr[Double] = js.undefined
}

object ClusterBillboards {
  @scala.inline
  def apply(
    clusterBillboards: js.UndefOr[Boolean] = js.undefined,
    clusterLabels: js.UndefOr[Boolean] = js.undefined,
    clusterPoints: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    minimumClusterSize: js.UndefOr[Double] = js.undefined,
    pixelRange: js.UndefOr[Double] = js.undefined
  ): ClusterBillboards = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clusterBillboards)) __obj.updateDynamic("clusterBillboards")(clusterBillboards.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterLabels)) __obj.updateDynamic("clusterLabels")(clusterLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clusterPoints)) __obj.updateDynamic("clusterPoints")(clusterPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumClusterSize)) __obj.updateDynamic("minimumClusterSize")(minimumClusterSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRange)) __obj.updateDynamic("pixelRange")(pixelRange.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBillboards]
  }
}

