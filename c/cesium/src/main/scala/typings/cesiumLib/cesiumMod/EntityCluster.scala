package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityCluster")
@js.native
class EntityCluster () extends js.Object {
  def this(options: cesiumLib.Anon_ClusterBillboards) = this()
  var clusterBillboards: scala.Boolean = js.native
  var clusterEvent: Event[js.Array[_]] = js.native
  var clusterLabels: scala.Boolean = js.native
  var clusterPoints: scala.Boolean = js.native
  var enabled: scala.Boolean = js.native
  var minimumClusterSize: scala.Double = js.native
  var pixelRange: scala.Double = js.native
  def destroy(): scala.Unit = js.native
}

