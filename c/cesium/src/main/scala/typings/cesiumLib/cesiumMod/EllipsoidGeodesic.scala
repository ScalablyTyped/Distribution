package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidGeodesic")
@js.native
class EllipsoidGeodesic () extends js.Object {
  def this(start: Cartographic) = this()
  def this(start: Cartographic, end: Cartographic) = this()
  def this(start: Cartographic, end: Cartographic, ellipsoid: Ellipsoid) = this()
  var end: Cartographic = js.native
  var endHeading: scala.Double = js.native
  var start: Cartographic = js.native
  var startHeading: scala.Double = js.native
  var surfaceDistance: scala.Double = js.native
  def interpolateUsingFraction(fraction: scala.Double): Cartographic = js.native
  def interpolateUsingSurfaceDistance(distance: scala.Double): Cartographic = js.native
  def setEndPoints(start: Cartographic, end: Cartographic): scala.Unit = js.native
}

