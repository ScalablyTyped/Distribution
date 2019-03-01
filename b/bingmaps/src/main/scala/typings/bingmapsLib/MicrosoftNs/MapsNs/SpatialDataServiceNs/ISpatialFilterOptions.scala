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

object ISpatialFilterOptions {
  @scala.inline
  def apply(
    spatialFilterType: java.lang.String,
    end: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location = null,
    intersects: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.LocationRect | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive = null,
    location: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location = null,
    radius: scala.Int | scala.Double = null,
    start: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location = null
  ): ISpatialFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spatialFilterType")(spatialFilterType)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (intersects != null) __obj.updateDynamic("intersects")(intersects.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpatialFilterOptions]
  }
}

