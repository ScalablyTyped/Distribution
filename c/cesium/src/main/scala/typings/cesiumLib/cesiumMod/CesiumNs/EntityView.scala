package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityView extends js.Object {
  var boundingSphere: Entity
  var ellipsoid: Ellipsoid
  var entity: Entity
  var scene: Scene
  def update(time: JulianDate): scala.Unit
}

object EntityView {
  @scala.inline
  def apply(
    boundingSphere: Entity,
    ellipsoid: Ellipsoid,
    entity: Entity,
    scene: Scene,
    update: JulianDate => scala.Unit
  ): EntityView = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere, ellipsoid = ellipsoid, entity = entity, scene = scene, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EntityView]
  }
}

