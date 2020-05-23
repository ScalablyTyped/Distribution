package typings.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Location")
@js.native
class Location protected ()
  extends typings.bingmaps.Microsoft.Maps.Location {
  /**
    * @constructor
    * @param latitude The location north or south of the equator from +90 to -90
    * @param longitude The location east or west of the prime meridian +180 to -180
    */
  def this(latitude: js.Any, longitude: js.Any) = this()
  /** The location north or south of the equator from +90 to -90 */
  /* CompleteClass */
  override var latitude: Double = js.native
  /** The location east or west of the prime meridian +180 to -180 */
  /* CompleteClass */
  override var longitude: Double = js.native
}

/* static members */
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
    location1: typings.bingmaps.Microsoft.Maps.Location,
    location2: typings.bingmaps.Microsoft.Maps.Location
  ): Boolean = js.native
  /**
    * Creates a proper Location from an object that has the same signature.
    * @param source A Location or Location-like object that contains the same properties.
    * @returns A copy of the map location.
    */
  def cloneFrom(source: typings.bingmaps.Microsoft.Maps.Location): typings.bingmaps.Microsoft.Maps.Location = js.native
  /**
    * Normalizes the longitude by wrapping it around the earth.
    * @param longitude The input longitude.
    * @returns The longitude normalized to within -180 and +180.
    */
  def normalizeLongitude(longitude: Double): Double = js.native
  /**
    * Parses a location string of the form "lat,long".
    * @param str The location string.
    * @returns The parsed location or null otherwise.
    */
  def parseLatLong(str: String): typings.bingmaps.Microsoft.Maps.Location = js.native
}

