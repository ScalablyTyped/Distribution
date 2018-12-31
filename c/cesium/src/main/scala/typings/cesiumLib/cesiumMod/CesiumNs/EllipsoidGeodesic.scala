package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsoidGeodesic extends js.Object {
  var end: Cartographic
  var endHeading: scala.Double
  var start: Cartographic
  var startHeading: scala.Double
  var surfaceDistance: scala.Double
  def interpolateUsingFraction(fraction: scala.Double): Cartographic
  def interpolateUsingSurfaceDistance(distance: scala.Double): Cartographic
  def setEndPoints(start: Cartographic, end: Cartographic): scala.Unit
}

