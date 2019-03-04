package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

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
  var avoid: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An integer distance specified in meters.
    * Use this parameter to make sure that the moving vehicle has enough distance 
    * to make the first turn
    */
  var distanceBeforeFirstTurn: js.UndefOr[scala.Double] = js.undefined
  /** 
    * An integer value between 0 and 359 that represents degrees from north 
    * where north is 0 degrees and the heading is specified clockwise from north. 
    * For example, setting the heading of 270 degrees creates a route that initially heads west 
    */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /**
    * One of the following values:
    * • distance - The route is calculated to minimize the distance.Traffic information is not used.
    * • time[default] - The route is calculated to minimize the time.Traffic information is not used.
    * • timeWithTraffic - The route is calculated to minimize the time and uses current traffic information.
    */
  var optimize: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * One of the following values:
    *  • Driving [default]
    *  • Walking
    */
  var travelMode: js.UndefOr[java.lang.String] = js.undefined
}

object IFindNearRouteOptions {
  @scala.inline
  def apply(
    spatialFilterType: java.lang.String,
    avoid: js.Array[java.lang.String] = null,
    distanceBeforeFirstTurn: scala.Int | scala.Double = null,
    end: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location = null,
    heading: scala.Int | scala.Double = null,
    intersects: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.LocationRect | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive = null,
    location: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location = null,
    optimize: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    start: java.lang.String | bingmapsLib.MicrosoftNs.MapsNs.Location = null,
    travelMode: java.lang.String = null
  ): IFindNearRouteOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType)
    if (avoid != null) __obj.updateDynamic("avoid")(avoid)
    if (distanceBeforeFirstTurn != null) __obj.updateDynamic("distanceBeforeFirstTurn")(distanceBeforeFirstTurn.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (intersects != null) __obj.updateDynamic("intersects")(intersects.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (optimize != null) __obj.updateDynamic("optimize")(optimize)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (travelMode != null) __obj.updateDynamic("travelMode")(travelMode)
    __obj.asInstanceOf[IFindNearRouteOptions]
  }
}

