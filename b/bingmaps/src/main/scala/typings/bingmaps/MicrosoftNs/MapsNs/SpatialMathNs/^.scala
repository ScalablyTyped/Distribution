package typings.bingmaps.MicrosoftNs.MapsNs.SpatialMathNs

import typings.bingmaps.MicrosoftNs.MapsNs.Location
import typings.bingmaps.MicrosoftNs.MapsNs.LocationRect
import typings.bingmaps.MicrosoftNs.MapsNs.Polygon
import typings.bingmaps.MicrosoftNs.MapsNs.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialMath")
@js.native
object ^ extends js.Object {
  def convertArea(area: Double, fromUnits: AreaUnits, toUnits: AreaUnits): Double = js.native
  def convertDistance(distance: Double, fromUnits: DistanceUnits, toUnits: DistanceUnits): Double = js.native
  def getCardinalSpline(locations: js.Array[Location]): js.Array[Location] = js.native
  def getCardinalSpline(locations: js.Array[Location], tension: Double): js.Array[Location] = js.native
  def getCardinalSpline(locations: js.Array[Location], tension: Double, nodeSize: Double): js.Array[Location] = js.native
  def getCardinalSpline(locations: js.Array[Location], tension: Double, nodeSize: Double, close: Boolean): js.Array[Location] = js.native
  def getDestination(origin: Location, bearing: Double, distance: Double): Location = js.native
  def getDestination(origin: Location, bearing: Double, distance: Double, units: DistanceUnits): Location = js.native
  def getDistanceTo(origin: Location, destination: Location): Double = js.native
  def getDistanceTo(origin: Location, destination: Location, units: DistanceUnits): Double = js.native
  def getDistanceTo(origin: Location, destination: Location, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def getEarthRadius(): Double = js.native
  def getEarthRadius(units: DistanceUnits): Double = js.native
  def getGeodesicPath(path: js.Array[Location]): js.Array[Location] = js.native
  def getGeodesicPath(path: js.Array[Location], nodeSize: Double): js.Array[Location] = js.native
  def getHeading(origin: Location, destination: Location): Double = js.native
  def getLengthOfPath(path: js.Array[Location]): Double = js.native
  def getLengthOfPath(path: js.Array[Location], units: DistanceUnits): Double = js.native
  def getLengthOfPath(path: js.Array[Location], units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def getLocationAlongPath(path: js.Array[Location], distance: Double): Location = js.native
  def getLocationAlongPath(path: js.Array[Location], distance: Double, units: DistanceUnits): Location = js.native
  def getLocationAlongPath(path: Polyline, distance: Double): Location = js.native
  def getLocationAlongPath(path: Polyline, distance: Double, units: DistanceUnits): Location = js.native
  def getRegularPolygon(origin: Location, radius: Double, numberOfPoints: Double): js.Array[Location] = js.native
  def getRegularPolygon(origin: Location, radius: Double, numberOfPoints: Double, units: DistanceUnits): js.Array[Location] = js.native
  def getRegularPolygon(origin: Location, radius: Double, numberOfPoints: Double, units: DistanceUnits, offset: Double): js.Array[Location] = js.native
  def interpolate(origin: Location, destination: Location): Location = js.native
  def interpolate(origin: Location, destination: Location, fraction: Double): Location = js.native
  def locationRectToPolygon(bounds: LocationRect): Polygon = js.native
  def toDegMinSec(loc: Location): String = js.native
  def tryParseDegMinSec(input: String): Double | Location = js.native
}

