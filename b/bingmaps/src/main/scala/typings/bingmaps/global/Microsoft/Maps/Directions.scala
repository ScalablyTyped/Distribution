package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.Directions.IWaypointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Directions {
  
  @JSGlobal("Microsoft.Maps.Directions.DirectionsManager")
  @js.native
  class DirectionsManager protected ()
    extends typings.bingmaps.Microsoft.Maps.Directions.DirectionsManager {
    /**
      * @constructor
      * @param map A map to calculate directions for.
      * @param waypoints An array of waypoints to be added to the route.
      */
    def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
    def this(
      map: typings.bingmaps.Microsoft.Maps.Map,
      waypoints: js.Array[typings.bingmaps.Microsoft.Maps.Directions.Waypoint]
    ) = this()
  }
  
  @JSGlobal("Microsoft.Maps.Directions.DistanceUnit")
  @js.native
  object DistanceUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit with Double] = js.native
    
    /* 0 */ val km: typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit.km with Double = js.native
    
    /* 1 */ val miles: typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit.miles with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteAvoidance")
  @js.native
  object RouteAvoidance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance with Double] = js.native
    
    /* 32 */ val avoidAirline: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidAirline with Double = js.native
    
    /* 64 */ val avoidBulletTrain: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidBulletTrain with Double = js.native
    
    /* 16 */ val avoidExpressTrain: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidExpressTrain with Double = js.native
    
    /* 4 */ val avoidHighways: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidHighways with Double = js.native
    
    /* 8 */ val avoidToll: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidToll with Double = js.native
    
    /* 1 */ val minimizeHighways: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.minimizeHighways with Double = js.native
    
    /* 2 */ val minimizeToll: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.minimizeToll with Double = js.native
    
    /* 0 */ val none: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.none with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteMode")
  @js.native
  object RouteMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteMode with Double] = js.native
    
    /* 0 */ val driving: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.driving with Double = js.native
    
    /* 1 */ val transit: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.transit with Double = js.native
    
    /* 2 */ val truck: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.truck with Double = js.native
    
    /* 3 */ val walking: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.walking with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteOptimization")
  @js.native
  object RouteOptimization extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization with Double] = js.native
    
    /* 4 */ val minimizeMoney: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeMoney with Double = js.native
    
    /* 5 */ val minimizeTransfers: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeTransfers with Double = js.native
    
    /* 6 */ val minimizeWalking: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeWalking with Double = js.native
    
    /* 1 */ val shortestDistance: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.shortestDistance with Double = js.native
    
    /* 0 */ val shortestTime: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.shortestTime with Double = js.native
    
    /* 3 */ val timeAvoidClosure: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.timeAvoidClosure with Double = js.native
    
    /* 2 */ val timeWithTraffic: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.timeWithTraffic with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteResponseCode")
  @js.native
  object RouteResponseCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode with Double] = js.native
    
    /* 15 */ val atleastTwoWaypointRequired: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.atleastTwoWaypointRequired with Double = js.native
    
    /* 2 */ val cannotFindNearbyRoad: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.cannotFindNearbyRoad with Double = js.native
    
    /* 5 */ val dataSourceNotFound: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.dataSourceNotFound with Double = js.native
    
    /* 14 */ val exceedMaxWaypointLimit: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.exceedMaxWaypointLimit with Double = js.native
    
    /* 16 */ val firstOrLastStoppointIsVia: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.firstOrLastStoppointIsVia with Double = js.native
    
    /* 13 */ val hasEmptyWaypoint: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.hasEmptyWaypoint with Double = js.native
    
    /* 18 */ val invalidCredentials: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.invalidCredentials with Double = js.native
    
    /* 7 */ val noAvailableTransitTrip: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noAvailableTransitTrip with Double = js.native
    
    /* 4 */ val noSolution: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noSolution with Double = js.native
    
    /* 10 */ val outOfTransitBounds: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.outOfTransitBounds with Double = js.native
    
    /* 17 */ val searchServiceFailed: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.searchServiceFailed with Double = js.native
    
    /* 0 */ val success: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.success with Double = js.native
    
    /* 11 */ val timeOut: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.timeOut with Double = js.native
    
    /* 3 */ val tooFar: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.tooFar with Double = js.native
    
    /* 8 */ val transitStopsTooClose: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.transitStopsTooClose with Double = js.native
    
    /* 1 */ val unknownError: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.unknownError with Double = js.native
    
    /* 9 */ val walkingBestAlternative: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.walkingBestAlternative with Double = js.native
    
    /* 12 */ val waypointDisambiguation: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.waypointDisambiguation with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.TimeType")
  @js.native
  object TimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.TimeType with Double] = js.native
    
    /* 0 */ val arrival: typings.bingmaps.Microsoft.Maps.Directions.TimeType.arrival with Double = js.native
    
    /* 1 */ val departure: typings.bingmaps.Microsoft.Maps.Directions.TimeType.departure with Double = js.native
    
    /* 2 */ val firstAvailable: typings.bingmaps.Microsoft.Maps.Directions.TimeType.firstAvailable with Double = js.native
    
    /* 3 */ val lastAvailable: typings.bingmaps.Microsoft.Maps.Directions.TimeType.lastAvailable with Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.Waypoint")
  @js.native
  class Waypoint protected ()
    extends typings.bingmaps.Microsoft.Maps.Directions.Waypoint {
    /**
      * @constructor
      * @param options: Options used to define the Waypoint.
      */
    def this(options: IWaypointOptions) = this()
  }
}
