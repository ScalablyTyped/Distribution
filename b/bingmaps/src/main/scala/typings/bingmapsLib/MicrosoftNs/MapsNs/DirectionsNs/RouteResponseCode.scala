package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RouteResponseCode extends js.Object

@JSGlobal("Microsoft.Maps.Directions.RouteResponseCode")
@js.native
object RouteResponseCode extends js.Object {
  /** At least two waypoints are required to calculate a route. */
  @js.native
  sealed trait atleastTwoWaypointRequired
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** A nearby road cannot be found for one or more of the route waypoints. */
  @js.native
  sealed trait cannotFindNearbyRoad
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** There is no route data for the specified waypoints. */
  @js.native
  sealed trait dataSourceNotFound
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The maximum number of waypoints, which is 25, has been exceeded. */
  @js.native
  sealed trait exceedMaxWaypointLimit
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The first or last waypoint is a via point, which is not allowed. */
  @js.native
  sealed trait firstOrLastStoppointIsVia
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** One or more waypoints do not have an address or location specified. */
  @js.native
  sealed trait hasEmptyWaypoint
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The credentials passed to the Directions module are invalid. */
  @js.native
  sealed trait invalidCredentials
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** There are no transit options available for the specified time. */
  @js.native
  sealed trait noAvailableTransitTrip
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /**
          * A route cannot be calculated for the specified waypoints. For example, this code is returned when a route between
          * “Seattle, WA” and “Honolulu, HI” is requested.
          */
  @js.native
  sealed trait noSolution
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /**
          * There is no transit data available for the route or for one or more of the specified waypoints,
          * or the waypoints are in different transit areas that do not overlap.
          */
  @js.native
  sealed trait outOfTransitBounds
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The search service failed to return results. */
  @js.native
  sealed trait searchServiceFailed
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The route was successfully calculated. */
  @js.native
  sealed trait success
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The directions calculation request has timed out. */
  @js.native
  sealed trait timeOut
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /**
          * The distance between two route waypoints, or the total length of the route exceeds the limit of the route mode.
          * Modify the waypoint locations so that they are closer together.
          */
  @js.native
  sealed trait tooFar
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The transit stops are so close that walking is always a better option. */
  @js.native
  sealed trait transitStopsTooClose
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknownError
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /** The transit stops are so close that walking is a better option. */
  @js.native
  sealed trait walkingBestAlternative
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /**
          * One or more waypoints need to be disambiguated. This error does not occur if the
          * autoDisplayDisambiguation directions render option is set to true.
          */
  @js.native
  sealed trait waypointDisambiguation
    extends bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode
  
  /* 15 */ val atleastTwoWaypointRequired: atleastTwoWaypointRequired with scala.Double = js.native
  /* 2 */ val cannotFindNearbyRoad: cannotFindNearbyRoad with scala.Double = js.native
  /* 5 */ val dataSourceNotFound: dataSourceNotFound with scala.Double = js.native
  /* 14 */ val exceedMaxWaypointLimit: exceedMaxWaypointLimit with scala.Double = js.native
  /* 16 */ val firstOrLastStoppointIsVia: firstOrLastStoppointIsVia with scala.Double = js.native
  /* 13 */ val hasEmptyWaypoint: hasEmptyWaypoint with scala.Double = js.native
  /* 18 */ val invalidCredentials: invalidCredentials with scala.Double = js.native
  /* 7 */ val noAvailableTransitTrip: noAvailableTransitTrip with scala.Double = js.native
  /* 4 */ val noSolution: noSolution with scala.Double = js.native
  /* 10 */ val outOfTransitBounds: outOfTransitBounds with scala.Double = js.native
  /* 17 */ val searchServiceFailed: searchServiceFailed with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 11 */ val timeOut: timeOut with scala.Double = js.native
  /* 3 */ val tooFar: tooFar with scala.Double = js.native
  /* 8 */ val transitStopsTooClose: transitStopsTooClose with scala.Double = js.native
  /* 1 */ val unknownError: unknownError with scala.Double = js.native
  /* 9 */ val walkingBestAlternative: walkingBestAlternative with scala.Double = js.native
  /* 12 */ val waypointDisambiguation: waypointDisambiguation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.RouteResponseCode with scala.Double] = js.native
}

