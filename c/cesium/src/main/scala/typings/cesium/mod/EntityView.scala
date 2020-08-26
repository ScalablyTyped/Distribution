package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityView")
@js.native
class EntityView protected () extends js.Object {
  def this(entity: Entity, scene: Scene) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: Ellipsoid) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: js.UndefOr[scala.Nothing], boundingSphere: BoundingSphere) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: Ellipsoid, boundingSphere: BoundingSphere) = this()
  var boundingSphere: Entity = js.native
  var ellipsoid: Ellipsoid = js.native
  var entity: Entity = js.native
  var scene: Scene = js.native
  def update(time: JulianDate): Unit = js.native
}

/* static members */
@JSImport("cesium", "EntityView")
@js.native
object EntityView extends js.Object {
  var defaultOffset3D: Cartesian3 = js.native
}

