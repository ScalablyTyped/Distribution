package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpatialFilterOptions extends js.Object {
  /** End location of the route (only for nearroute filter). */
  var end: js.UndefOr[String | Location] = js.undefined
  /** Intersection object. Can be a well known text string or a LocationRect object (only for intersects filter). */
  var intersects: js.UndefOr[String | LocationRect | IPrimitive] = js.undefined
  /** Location at which the filter should be applied (only for nearby filter). */
  var location: js.UndefOr[String | Location] = js.undefined
  /** 
    * Radius to use when performing a nearby search. The distance in kilometers and must be between 0.16 and 1000 kilometers
    * (only for nearby filter).
    */
  var radius: js.UndefOr[Double] = js.undefined
  /** 
    * One of the following values:
    * • nearby – Searches in a radius around a location.
    * • nearRoute – Searches for results that are within 1 mile of a route.
    * • intersects – Searches for results that intersect with the specified geometry.
    * Note: Note that the NavteqNA and NavteqEU data sources only support nearby queries.
    */
  var spatialFilterType: String
  /** Start location of the route (only for nearroute filter). */
  var start: js.UndefOr[String | Location] = js.undefined
}

object ISpatialFilterOptions {
  @scala.inline
  def apply(
    spatialFilterType: String,
    end: String | Location = null,
    intersects: String | LocationRect | IPrimitive = null,
    location: String | Location = null,
    radius: Int | Double = null,
    start: String | Location = null
  ): ISpatialFilterOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (intersects != null) __obj.updateDynamic("intersects")(intersects.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpatialFilterOptions]
  }
}

