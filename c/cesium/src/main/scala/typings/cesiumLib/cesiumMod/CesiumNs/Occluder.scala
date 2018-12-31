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

