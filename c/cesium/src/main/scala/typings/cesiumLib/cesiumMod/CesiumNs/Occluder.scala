package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Occluder extends js.Object {
  var cameraPosition: Cartesian3
  var position: Cartesian3
  var radius: scala.Double
  def computeVisibility(occludeeBS: BoundingSphere): scala.Double
  def isBoundingSphereVisible(occludee: BoundingSphere): scala.Boolean
  def isPointVisible(occludee: Cartesian3): scala.Boolean
}

object Occluder {
  @scala.inline
  def apply(
    cameraPosition: Cartesian3,
    computeVisibility: js.Function1[BoundingSphere, scala.Double],
    isBoundingSphereVisible: js.Function1[BoundingSphere, scala.Boolean],
    isPointVisible: js.Function1[Cartesian3, scala.Boolean],
    position: Cartesian3,
    radius: scala.Double
  ): Occluder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cameraPosition")(cameraPosition)
    __obj.updateDynamic("computeVisibility")(computeVisibility)
    __obj.updateDynamic("isBoundingSphereVisible")(isBoundingSphereVisible)
    __obj.updateDynamic("isPointVisible")(isPointVisible)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("radius")(radius)
    __obj.asInstanceOf[Occluder]
  }
}

