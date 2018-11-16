package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeometryVisualizer")
@js.native
class GeometryVisualizer protected ()
  extends cesiumLib.cesiumMod.CesiumNs.GeometryVisualizer {
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene, entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection) = this()
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene, entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection, primitives: cesiumLib.cesiumMod.CesiumNs.PrimitiveCollection) = this()
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene, entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection, primitives: cesiumLib.cesiumMod.CesiumNs.PrimitiveCollection, groundPrimitives: cesiumLib.cesiumMod.CesiumNs.PrimitiveCollection) = this()
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

