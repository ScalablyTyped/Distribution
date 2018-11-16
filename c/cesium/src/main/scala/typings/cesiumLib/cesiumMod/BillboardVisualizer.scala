package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BillboardVisualizer")
@js.native
class BillboardVisualizer protected ()
  extends cesiumLib.cesiumMod.CesiumNs.BillboardVisualizer {
  def this(entityCluster: cesiumLib.cesiumMod.CesiumNs.EntityCluster, entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection) = this()
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

