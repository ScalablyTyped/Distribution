package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFindNearRouteOptions extends ISpatialFilterOptions {
  /**
    * A list of values that limit the use of highways and toll roads in the route.
    * Use one of the following values:
    * • highways - Avoids the use of highways in the route.
    * • tolls - Avoids the use of toll roads in the route.
    * • minimizeHighways - Minimizes (tries to avoid) the use of highways in the route.
    * • minimizeTolls - Minimizes (tries to avoid) the use of toll roads in the route.
    */
  var avoid: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An integer distance specified in meters.
    * Use this parameter to make sure that the moving vehicle has enough distance 
    * to make the first turn
    */
  var distanceBeforeFirstTurn: js.UndefOr[Double] = js.undefined
  /** 
    * An integer value between 0 and 359 that represents degrees from north 
    * where north is 0 degrees and the heading is specified clockwise from north. 
    * For example, setting the heading of 270 degrees creates a route that initially heads west 
    */
  var heading: js.UndefOr[Double] = js.undefined
  /**
    * One of the following values:
    * • distance - The route is calculated to minimize the distance.Traffic information is not used.
    * • time[default] - The route is calculated to minimize the time.Traffic information is not used.
    * • timeWithTraffic - The route is calculated to minimize the time and uses current traffic information.
    */
  var optimize: js.UndefOr[String] = js.undefined
  /** 
    * One of the following values:
    *  • Driving [default]
    *  • Walking
    */
  var travelMode: js.UndefOr[String] = js.undefined
}

object IFindNearRouteOptions {
  @scala.inline
  def apply(
    spatialFilterType: String,
    avoid: js.Array[String] = null,
    distanceBeforeFirstTurn: js.UndefOr[Double] = js.undefined,
    end: String | Location = null,
    heading: js.UndefOr[Double] = js.undefined,
    intersects: String | LocationRect | IPrimitive = null,
    location: String | Location = null,
    optimize: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    start: String | Location = null,
    travelMode: String = null
  ): IFindNearRouteOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    if (avoid != null) __obj.updateDynamic("avoid")(avoid.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceBeforeFirstTurn)) __obj.updateDynamic("distanceBeforeFirstTurn")(distanceBeforeFirstTurn.get.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (intersects != null) __obj.updateDynamic("intersects")(intersects.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (optimize != null) __obj.updateDynamic("optimize")(optimize.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (travelMode != null) __obj.updateDynamic("travelMode")(travelMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindNearRouteOptions]
  }
}

