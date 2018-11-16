package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialMath")
@js.native
object SpatialMathNsMembers extends js.Object {
  def convertArea(area: scala.Double, fromUnits: AreaUnits, toUnits: AreaUnits): scala.Double = js.native
  def convertDistance(distance: scala.Double, fromUnits: DistanceUnits, toUnits: DistanceUnits): scala.Double = js.native
  def getCardinalSpline(locations: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getCardinalSpline(locations: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location], tension: scala.Double): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    tension: scala.Double,
    nodeSize: scala.Double
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    tension: scala.Double,
    nodeSize: scala.Double,
    close: scala.Boolean
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getDestination(origin: bingmapsLib.MicrosoftNs.MapsNs.Location, bearing: scala.Double, distance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def getDestination(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    bearing: scala.Double,
    distance: scala.Double,
    units: DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def getDistanceTo(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    destination: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Double = js.native
  def getDistanceTo(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    destination: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: DistanceUnits
  ): scala.Double = js.native
  def getDistanceTo(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    destination: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def getEarthRadius(): scala.Double = js.native
  def getEarthRadius(units: DistanceUnits): scala.Double = js.native
  def getGeodesicPath(path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getGeodesicPath(path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location], nodeSize: scala.Double): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getHeading(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    destination: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Double = js.native
  def getLengthOfPath(path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]): scala.Double = js.native
  def getLengthOfPath(path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location], units: DistanceUnits): scala.Double = js.native
  def getLengthOfPath(
    path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    units: DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def getLocationAlongPath(path: bingmapsLib.MicrosoftNs.MapsNs.Polyline, distance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def getLocationAlongPath(path: bingmapsLib.MicrosoftNs.MapsNs.Polyline, distance: scala.Double, units: DistanceUnits): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def getLocationAlongPath(path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location], distance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def getLocationAlongPath(
    path: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    distance: scala.Double,
    units: DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def getRegularPolygon(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    radius: scala.Double,
    numberOfPoints: scala.Double
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getRegularPolygon(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    radius: scala.Double,
    numberOfPoints: scala.Double,
    units: DistanceUnits
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def getRegularPolygon(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    radius: scala.Double,
    numberOfPoints: scala.Double,
    units: DistanceUnits,
    offset: scala.Double
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def interpolate(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    destination: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def interpolate(
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location,
    destination: bingmapsLib.MicrosoftNs.MapsNs.Location,
    fraction: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def locationRectToPolygon(bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect): bingmapsLib.MicrosoftNs.MapsNs.Polygon = js.native
  def toDegMinSec(loc: bingmapsLib.MicrosoftNs.MapsNs.Location): java.lang.String = js.native
  def tryParseDegMinSec(input: java.lang.String): scala.Double | bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
}

