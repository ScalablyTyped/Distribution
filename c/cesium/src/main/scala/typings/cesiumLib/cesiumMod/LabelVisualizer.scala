package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LabelVisualizer")
@js.native
class LabelVisualizer protected ()
  extends cesiumLib.cesiumMod.CesiumNs.LabelVisualizer {
  def this(entityCluster: cesiumLib.cesiumMod.CesiumNs.EntityCluster, entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection) = this()
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

