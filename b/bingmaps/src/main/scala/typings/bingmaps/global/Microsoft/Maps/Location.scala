package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
/* static members */
object Location {
  
  /**
    * Determines if two locations are equal.
    * @param location1 The first location to test.
    * @param location2 The second location to test.
    * @returns True if both locations are equivalent.
    */
  @JSGlobal("Microsoft.Maps.Location.areEqual")
  @js.native
  def areEqual(
    location1: typings.bingmaps.Microsoft.Maps.Location,
    location2: typings.bingmaps.Microsoft.Maps.Location
  ): Boolean = js.native
  
  /**
    * Creates a proper Location from an object that has the same signature.
    * @param source A Location or Location-like object that contains the same properties.
    * @returns A copy of the map location.
    */
  @JSGlobal("Microsoft.Maps.Location.cloneFrom")
  @js.native
  def cloneFrom(source: typings.bingmaps.Microsoft.Maps.Location): typings.bingmaps.Microsoft.Maps.Location = js.native
  
  /**
    * Normalizes the longitude by wrapping it around the earth.
    * @param longitude The input longitude.
    * @returns The longitude normalized to within -180 and +180.
    */
  @JSGlobal("Microsoft.Maps.Location.normalizeLongitude")
  @js.native
  def normalizeLongitude(longitude: Double): Double = js.native
  
  /**
    * Parses a location string of the form "lat,long".
    * @param str The location string.
    * @returns The parsed location or null otherwise.
    */
  @JSGlobal("Microsoft.Maps.Location.parseLatLong")
  @js.native
  def parseLatLong(str: String): typings.bingmaps.Microsoft.Maps.Location = js.native
}
