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

