package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityCluster")
@js.native
class EntityCluster ()
  extends cesiumLib.cesiumMod.CesiumNs.EntityCluster {
  def this(options: cesiumLib.Anon_ClusterBillboards) = this()
  /* CompleteClass */
  override var clusterBillboards: scala.Boolean = js.native
  /* CompleteClass */
  override var clusterEvent: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[_]] = js.native
  /* CompleteClass */
  override var clusterLabels: scala.Boolean = js.native
  /* CompleteClass */
  override var clusterPoints: scala.Boolean = js.native
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /* CompleteClass */
  override var minimumClusterSize: scala.Double = js.native
  /* CompleteClass */
  override var pixelRange: scala.Double = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
}

