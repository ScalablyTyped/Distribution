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
    computeVisibility: BoundingSphere => scala.Double,
    isBoundingSphereVisible: BoundingSphere => scala.Boolean,
    isPointVisible: Cartesian3 => scala.Boolean,
    position: Cartesian3,
    radius: scala.Double
  ): Occluder = {
    val __obj = js.Dynamic.literal(cameraPosition = cameraPosition, computeVisibility = js.Any.fromFunction1(computeVisibility), isBoundingSphereVisible = js.Any.fromFunction1(isBoundingSphereVisible), isPointVisible = js.Any.fromFunction1(isPointVisible), position = position, radius = radius)
  
    __obj.asInstanceOf[Occluder]
  }
}

