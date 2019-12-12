package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.atleastTwoWaypointRequired
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.cannotFindNearbyRoad
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.dataSourceNotFound
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.exceedMaxWaypointLimit
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.firstOrLastStoppointIsVia
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.hasEmptyWaypoint
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.invalidCredentials
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noAvailableTransitTrip
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noSolution
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.outOfTransitBounds
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.searchServiceFailed
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.success
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.timeOut
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.tooFar
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.transitStopsTooClose
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.unknownError
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.walkingBestAlternative
import typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.waypointDisambiguation
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
  sealed trait atleastTwoWaypointRequired extends RouteResponseCode
  
  /** A nearby road cannot be found for one or more of the route waypoints. */
  @js.native
  sealed trait cannotFindNearbyRoad extends RouteResponseCode
  
  /** There is no route data for the specified waypoints. */
  @js.native
  sealed trait dataSourceNotFound extends RouteResponseCode
  
  /** The maximum number of waypoints, which is 25, has been exceeded. */
  @js.native
  sealed trait exceedMaxWaypointLimit extends RouteResponseCode
  
  /** The first or last waypoint is a via point, which is not allowed. */
  @js.native
  sealed trait firstOrLastStoppointIsVia extends RouteResponseCode
  
  /** One or more waypoints do not have an address or location specified. */
  @js.native
  sealed trait hasEmptyWaypoint extends RouteResponseCode
  
  /** The credentials passed to the Directions module are invalid. */
  @js.native
  sealed trait invalidCredentials extends RouteResponseCode
  
  /** There are no transit options available for the specified time. */
  @js.native
  sealed trait noAvailableTransitTrip extends RouteResponseCode
  
  /**
    * A route cannot be calculated for the specified waypoints. For example, this code is returned when a route between
    * “Seattle, WA” and “Honolulu, HI” is requested.
    */
  @js.native
  sealed trait noSolution extends RouteResponseCode
  
  /**
    * There is no transit data available for the route or for one or more of the specified waypoints,
    * or the waypoints are in different transit areas that do not overlap.
    */
  @js.native
  sealed trait outOfTransitBounds extends RouteResponseCode
  
  /** The search service failed to return results. */
  @js.native
  sealed trait searchServiceFailed extends RouteResponseCode
  
  /** The route was successfully calculated. */
  @js.native
  sealed trait success extends RouteResponseCode
  
  /** The directions calculation request has timed out. */
  @js.native
  sealed trait timeOut extends RouteResponseCode
  
  /**
    * The distance between two route waypoints, or the total length of the route exceeds the limit of the route mode.
    * Modify the waypoint locations so that they are closer together.
    */
  @js.native
  sealed trait tooFar extends RouteResponseCode
  
  /** The transit stops are so close that walking is always a better option. */
  @js.native
  sealed trait transitStopsTooClose extends RouteResponseCode
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknownError extends RouteResponseCode
  
  /** The transit stops are so close that walking is a better option. */
  @js.native
  sealed trait walkingBestAlternative extends RouteResponseCode
  
  /**
    * One or more waypoints need to be disambiguated. This error does not occur if the
    * autoDisplayDisambiguation directions render option is set to true.
    */
  @js.native
  sealed trait waypointDisambiguation extends RouteResponseCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RouteResponseCode with Double] = js.native
  /* 15 */ @js.native
  object atleastTwoWaypointRequired extends TopLevel[atleastTwoWaypointRequired with Double]
  
  /* 2 */ @js.native
  object cannotFindNearbyRoad extends TopLevel[cannotFindNearbyRoad with Double]
  
  /* 5 */ @js.native
  object dataSourceNotFound extends TopLevel[dataSourceNotFound with Double]
  
  /* 14 */ @js.native
  object exceedMaxWaypointLimit extends TopLevel[exceedMaxWaypointLimit with Double]
  
  /* 16 */ @js.native
  object firstOrLastStoppointIsVia extends TopLevel[firstOrLastStoppointIsVia with Double]
  
  /* 13 */ @js.native
  object hasEmptyWaypoint extends TopLevel[hasEmptyWaypoint with Double]
  
  /* 18 */ @js.native
  object invalidCredentials extends TopLevel[invalidCredentials with Double]
  
  /* 7 */ @js.native
  object noAvailableTransitTrip extends TopLevel[noAvailableTransitTrip with Double]
  
  /* 4 */ @js.native
  object noSolution extends TopLevel[noSolution with Double]
  
  /* 10 */ @js.native
  object outOfTransitBounds extends TopLevel[outOfTransitBounds with Double]
  
  /* 17 */ @js.native
  object searchServiceFailed extends TopLevel[searchServiceFailed with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 11 */ @js.native
  object timeOut extends TopLevel[timeOut with Double]
  
  /* 3 */ @js.native
  object tooFar extends TopLevel[tooFar with Double]
  
  /* 8 */ @js.native
  object transitStopsTooClose extends TopLevel[transitStopsTooClose with Double]
  
  /* 1 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
  /* 9 */ @js.native
  object walkingBestAlternative extends TopLevel[walkingBestAlternative with Double]
  
  /* 12 */ @js.native
  object waypointDisambiguation extends TopLevel[waypointDisambiguation with Double]
  
}

