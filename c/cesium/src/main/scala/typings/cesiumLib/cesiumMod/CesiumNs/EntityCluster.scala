package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityCluster extends js.Object {
  var clusterBillboards: scala.Boolean
  var clusterEvent: Event
  var clusterLabels: scala.Boolean
  var clusterPoints: scala.Boolean
  var enabled: scala.Boolean
  var minimumClusterSize: scala.Double
  var pixelRange: scala.Double
  def destroy(): scala.Unit
}

object EntityCluster {
  @scala.inline
  def apply(
    clusterBillboards: scala.Boolean,
    clusterEvent: Event,
    clusterLabels: scala.Boolean,
    clusterPoints: scala.Boolean,
    destroy: () => scala.Unit,
    enabled: scala.Boolean,
    minimumClusterSize: scala.Double,
    pixelRange: scala.Double
  ): EntityCluster = {
    val __obj = js.Dynamic.literal(clusterBillboards = clusterBillboards, clusterEvent = clusterEvent, clusterLabels = clusterLabels, clusterPoints = clusterPoints, destroy = js.Any.fromFunction0(destroy), enabled = enabled, minimumClusterSize = minimumClusterSize, pixelRange = pixelRange)
  
    __obj.asInstanceOf[EntityCluster]
  }
}

