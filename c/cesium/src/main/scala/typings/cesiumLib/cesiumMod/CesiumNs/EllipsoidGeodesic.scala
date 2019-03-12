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

object EllipsoidGeodesic {
  @scala.inline
  def apply(
    end: Cartographic,
    endHeading: scala.Double,
    interpolateUsingFraction: scala.Double => Cartographic,
    interpolateUsingSurfaceDistance: scala.Double => Cartographic,
    setEndPoints: (Cartographic, Cartographic) => scala.Unit,
    start: Cartographic,
    startHeading: scala.Double,
    surfaceDistance: scala.Double
  ): EllipsoidGeodesic = {
    val __obj = js.Dynamic.literal(end = end, endHeading = endHeading, interpolateUsingFraction = js.Any.fromFunction1(interpolateUsingFraction), interpolateUsingSurfaceDistance = js.Any.fromFunction1(interpolateUsingSurfaceDistance), setEndPoints = js.Any.fromFunction2(setEndPoints), start = start, startHeading = startHeading, surfaceDistance = surfaceDistance)
  
    __obj.asInstanceOf[EllipsoidGeodesic]
  }
}

