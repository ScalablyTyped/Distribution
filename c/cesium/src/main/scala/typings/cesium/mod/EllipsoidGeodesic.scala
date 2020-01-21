package typings.cesium.mod

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
  var endHeading: Double = js.native
  var start: Cartographic = js.native
  var startHeading: Double = js.native
  var surfaceDistance: Double = js.native
  def interpolateUsingFraction(fraction: Double): Cartographic = js.native
  def interpolateUsingSurfaceDistance(distance: Double): Cartographic = js.native
  def setEndPoints(start: Cartographic, end: Cartographic): Unit = js.native
}

