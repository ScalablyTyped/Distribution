package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.LocationRect")
@js.native
class LocationRect protected () extends js.Object {
  /**
    * @constructor
    * @param center The center of the LocationRect.
    * @param width The width of the LocationRect in degrees.
    * @param height The height of the LocationRect in degrees.
    */
  def this(center: Location, width: scala.Double, height: scala.Double) = this()
  /** The location that defines the center of the rectangle. */
  var center: Location = js.native
  /** The height, in degrees, of the rectangle. */
  var height: scala.Double = js.native
  /** The width, in degrees, of the rectangle. */
  var width: scala.Double = js.native
  /**
    * Scales the size of a LocationRect by multiplying the width and height properties by a percentage.
    * @param percentage A percentage value to increase the size of the LocationRect by.
    */
  def buffer(percentage: scala.Double): scala.Unit = js.native
  /**
    * Gets whether the specified Location is within the LocationRect.
    * @returns A boolean indicating if a location is within a LocationRect.
    */
  def contains(location: Location): scala.Boolean = js.native
  /**
    * Determines if the LocationRect crosses the 180th meridian.
    * @returns A boolean indicating if the LocationRect crosses the international date line (-180/180 degrees longitude).
    */
  def crossesInternationalDateLine(): scala.Boolean = js.native
  /**
    * Gets the longitude that defines the eastern edge of the LocationRect.
    * @returns The eastern longitude value of the LocationRect.
    */
  def getEast(): scala.Double = js.native
  /**
    * Gets the latitude that defines the northern edge of the LocationRect.
    * @returns The northern latitude value of the LocationRect.
    */
  def getNorth(): scala.Double = js.native
  /**
    * Gets the Location that defines the northwest corner of the LocationRect.
    * @returns The northwest corner location of the LocationRect.
    */
  def getNorthwest(): Location = js.native
  /**
    * Gets the latitude that defines the southern edge of the LocationRect.
    * @returns The southern latitude value of the LocationRect.
    */
  def getSouth(): scala.Double = js.native
  /**
    * Gets the Location that defines the southeast corner of the LocationRect.
    * @returns The southeast corner location of the LocationRect.
    */
  def getSoutheast(): Location = js.native
  /**
    * Gets the latitude that defines the western edge of the LocationRect.
    * @returns The western longitude value of the LocationRect.
    */
  def getWest(): scala.Double = js.native
  /**
    * Gets whether the specified LocationRect intersects with this LocationRect.
    * @param rect A second LocationRect to test for intersection with.
    * @returns A boolean indicating if a second LocationRect interests with this LocationRect.
    */
  def intersects(rect: LocationRect): scala.Boolean = js.native
  /**
    * If a LocationRect crosses the international date line, this method splits it into two LocationRect objects and returns them as an array.
    * @returns An array of LocationRects, that are split by the international date line (-180/180 degrees longitude)
    */
  def splitByInternationalDateLine(): js.Array[LocationRect] = js.native
}

/* static members */
@JSGlobal("Microsoft.Maps.LocationRect")
@js.native
object LocationRect extends js.Object {
  /**
    * Gets a LocationRect using the specified locations for the northwest and southeast corners.
    * @param northwest The north west corner of the LocationRect.
    * @param southeast The south east corner of the LocationRect.
    * @returns A LocationRect using the specified locations for the northwest and southeast corners.
    */
  def fromCorners(
    northwest: bingmapsLib.MicrosoftNs.MapsNs.Location,
    southeast: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  /**
    * Gets a LocationRect using the specified northern and southern latitudes and western and eastern longitudes for the rectangle boundaries.
    * @param north The northern latitude of the LocationRect.
    * @param west The western longitude of the LocationRect.
    * @param south The southern latitude of the LocationRect.
    * @param east The eastern longitude of the LocationRect.
    * @returns A LocationRect defined by the specified northern and southern latitudes and western and eastern longitudes for the rectangle boundaries.
    */
  def fromEdges(north: scala.Double, west: scala.Double, south: scala.Double, east: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  /**
    * Gets a LocationRect using a list of locations.
    * @param locations A list of locations.
    * @returns A LocationRect that encloses all the specified locations.
    */
  def fromLocations(locations: bingmapsLib.MicrosoftNs.MapsNs.Location*): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  /**
    * Gets a LocationRect using an array of locations.
    * @param locations An array of locations.
    * @returns A LocationRect that encloses all the specified locations.
    */
  def fromLocations(locations: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  /**
    * Calculates the LocationRect for an indivudal shape or an array of shapes.
    * @param shapes An indivudal shape or an array of shapes to calculate the LocationRect for.
    * @returns A LocationRect for the shapes.
    */
  def fromShapes(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  def fromShapes(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  /**
    * Creates a LocationRect from a string with the following format: "north,west,south,east". North, west, south and east specify the coordinate number values.
    * @param str A string that repsents a LocationRect with the format "north,west,south,east".
    * @returns A LocationRect defined by the specified northern and southern latitudes and western and eastern longitudes for the rectangle boundaries that have been parsed by the string.
    */
  def fromString(str: java.lang.String): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  /**
    * A static function that merges two LocationRect to form a new LocationRect which represents the combined area of the two LocationRect objects.
    * @param rect1 The first LocationRect to merge with the second LocationRect.
    * @param rect2 The second LocationRect to merge with the first LocationRect.
    * @returns A new LocationRect which represents the combined area of the two LocationRect objects.
    */
  def merge(
    rect1: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    rect2: bingmapsLib.MicrosoftNs.MapsNs.LocationRect
  ): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
}

