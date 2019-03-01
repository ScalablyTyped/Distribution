package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClusterBillboards extends js.Object {
  var clusterBillboards: js.UndefOr[scala.Boolean] = js.undefined
  var clusterLabels: js.UndefOr[scala.Boolean] = js.undefined
  var clusterPoints: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var minimumClusterSize: js.UndefOr[scala.Double] = js.undefined
  var pixelRange: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ClusterBillboards {
  @scala.inline
  def apply(
    clusterBillboards: js.UndefOr[scala.Boolean] = js.undefined,
    clusterLabels: js.UndefOr[scala.Boolean] = js.undefined,
    clusterPoints: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    minimumClusterSize: scala.Int | scala.Double = null,
    pixelRange: scala.Int | scala.Double = null
  ): Anon_ClusterBillboards = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clusterBillboards)) __obj.updateDynamic("clusterBillboards")(clusterBillboards)
    if (!js.isUndefined(clusterLabels)) __obj.updateDynamic("clusterLabels")(clusterLabels)
    if (!js.isUndefined(clusterPoints)) __obj.updateDynamic("clusterPoints")(clusterPoints)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (minimumClusterSize != null) __obj.updateDynamic("minimumClusterSize")(minimumClusterSize.asInstanceOf[js.Any])
    if (pixelRange != null) __obj.updateDynamic("pixelRange")(pixelRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClusterBillboards]
  }
}

