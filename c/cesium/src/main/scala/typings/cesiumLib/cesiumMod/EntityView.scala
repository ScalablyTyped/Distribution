package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityView")
@js.native
class EntityView protected ()
  extends cesiumLib.cesiumMod.CesiumNs.EntityView {
  def this(entity: cesiumLib.cesiumMod.CesiumNs.Entity, scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  def this(entity: cesiumLib.cesiumMod.CesiumNs.Entity, scene: cesiumLib.cesiumMod.CesiumNs.Scene, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid) = this()
  def this(entity: cesiumLib.cesiumMod.CesiumNs.Entity, scene: cesiumLib.cesiumMod.CesiumNs.Scene, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid, boundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere) = this()
  /* CompleteClass */
  override var boundingSphere: cesiumLib.cesiumMod.CesiumNs.Entity = js.native
  /* CompleteClass */
  override var ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  /* CompleteClass */
  override var entity: cesiumLib.cesiumMod.CesiumNs.Entity = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "EntityView")
@js.native
object EntityView extends js.Object {
  var defaultOffset3D: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
}

