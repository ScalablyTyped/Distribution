package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.Location")
@js.native
class Location protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.Location {
  /**
    * @constructor
    * @param latitude The location north or south of the equator from +90 to -90
    * @param longitude The location east or west of the prime meridian +180 to -180
    */
  def this(latitude: js.Any, longitude: js.Any) = this()
  
  /** The location north or south of the equator from +90 to -90 */
  /* CompleteClass */
  var latitude: Double = js.native
  
  /** The location east or west of the prime meridian +180 to -180 */
  /* CompleteClass */
  var longitude: Double = js.native
}
/* static members */
object Location {
  
  @JSGlobal("Microsoft.Maps.Location")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determines if two locations are equal.
    * @param location1 The first location to test.
    * @param location2 The second location to test.
    * @returns True if both locations are equivalent.
    */
  @scala.inline
  def areEqual(
    location1: typings.bingmaps.Microsoft.Maps.Location,
    location2: typings.bingmaps.Microsoft.Maps.Location
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(location1.asInstanceOf[js.Any], location2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a proper Location from an object that has the same signature.
    * @param source A Location or Location-like object that contains the same properties.
    * @returns A copy of the map location.
    */
  @scala.inline
  def cloneFrom(source: typings.bingmaps.Microsoft.Maps.Location): typings.bingmaps.Microsoft.Maps.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneFrom")(source.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  
  /**
    * Normalizes the longitude by wrapping it around the earth.
    * @param longitude The input longitude.
    * @returns The longitude normalized to within -180 and +180.
    */
  @scala.inline
  def normalizeLongitude(longitude: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLongitude")(longitude.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Parses a location string of the form "lat,long".
    * @param str The location string.
    * @returns The parsed location or null otherwise.
    */
  @scala.inline
  def parseLatLong(str: String): typings.bingmaps.Microsoft.Maps.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLatLong")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
}
