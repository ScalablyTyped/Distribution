package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Location")
@js.native
class Location protected () extends js.Object {
  /**
          * @constructor
          * @param latitude The location north or south of the equator from +90 to -90
          * @param longitude The location east or west of the prime meridian +180 to -180
          */
  def this(latitude: js.Any, longitude: js.Any) = this()
  /** The location north or south of the equator from +90 to -90 */
  var latitude: scala.Double = js.native
  /** The location east or west of the prime meridian +180 to -180 */
  var longitude: scala.Double = js.native
}

@JSGlobal("Microsoft.Maps.Location")
@js.native
object Location extends js.Object {
  /**
          * Determines if two locations are equal.
          * @param location1 The first location to test.
          * @param location2 The second location to test.
          * @returns True if both locations are equivalent.
          */
  def areEqual(
    location1: bingmapsLib.MicrosoftNs.MapsNs.Location,
    location2: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Boolean = js.native
  /**
          * Creates a proper Location from an object that has the same signature.
          * @param source A Location or Location-like object that contains the same properties.
          * @returns A copy of the map location.
          */
  def cloneFrom(source: bingmapsLib.MicrosoftNs.MapsNs.Location): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  /**
          * Normalizes the longitude by wrapping it around the earth.
          * @param longitude The input longitude.
          * @returns The longitude normalized to within -180 and +180.
          */
  def normalizeLongitude(longitude: scala.Double): scala.Double = js.native
  /**
          * Parses a location string of the form "lat,long".
          * @param str The location string.
          * @returns The parsed location or null otherwise.
          */
  def parseLatLong(str: java.lang.String): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
}

