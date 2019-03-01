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
    update: js.Function1[JulianDate, scala.Unit]
  ): EntityView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingSphere")(boundingSphere)
    __obj.updateDynamic("ellipsoid")(ellipsoid)
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[EntityView]
  }
}

