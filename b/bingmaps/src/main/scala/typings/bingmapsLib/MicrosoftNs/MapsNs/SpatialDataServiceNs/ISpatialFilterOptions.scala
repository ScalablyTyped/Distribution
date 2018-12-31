package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpatialFilterOptions extends js.Object {
  /** End location of the route (only for nearroute filter). */
  var end: js.UndefOr[java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location] = js.undefined
  /** Intersection object. Can be a well known text string or a LocationRect object (only for intersects filter). */
  var intersects: js.UndefOr[
    java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.LocationRect | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ] = js.undefined
  /** Location at which the filter should be applied (only for nearby filter). */
  var location: js.UndefOr[java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location] = js.undefined
  /** 
    * Radius to use when performing a nearby search. The distance in kilometers and must be between 0.16 and 1000 kilometers
    * (only for nearby filter).
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** 
    * One of the following values:
    * • nearby – Searches in a radius around a location.
    * • nearRoute – Searches for results that are within 1 mile of a route.
    * • intersects – Searches for results that intersect with the specified geometry.
    * Note: Note that the NavteqNA and NavteqEU data sources only support nearby queries.
    */
  var spatialFilterType: java.lang.String
  /** Start location of the route (only for nearroute filter). */
  var start: js.UndefOr[java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location] = js.undefined
}

