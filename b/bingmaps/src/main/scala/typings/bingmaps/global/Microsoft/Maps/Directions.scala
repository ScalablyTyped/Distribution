package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.Directions.IWaypointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Directions {
  
  @JSGlobal("Microsoft.Maps.Directions.DirectionsManager")
  @js.native
  class DirectionsManager protected ()
    extends StObject
       with typings.bingmaps.Microsoft.Maps.Directions.DirectionsManager {
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
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit & Double] = js.native
    
    /* 0 */ val km: typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit.km & Double = js.native
    
    /* 1 */ val miles: typings.bingmaps.Microsoft.Maps.Directions.DistanceUnit.miles & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteAvoidance")
  @js.native
  object RouteAvoidance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance & Double] = js.native
    
    /* 32 */ val avoidAirline: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidAirline & Double = js.native
    
    /* 64 */ val avoidBulletTrain: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidBulletTrain & Double = js.native
    
    /* 16 */ val avoidExpressTrain: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidExpressTrain & Double = js.native
    
    /* 4 */ val avoidHighways: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidHighways & Double = js.native
    
    /* 8 */ val avoidToll: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.avoidToll & Double = js.native
    
    /* 1 */ val minimizeHighways: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.minimizeHighways & Double = js.native
    
    /* 2 */ val minimizeToll: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.minimizeToll & Double = js.native
    
    /* 0 */ val none: typings.bingmaps.Microsoft.Maps.Directions.RouteAvoidance.none & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteMode")
  @js.native
  object RouteMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteMode & Double] = js.native
    
    /* 0 */ val driving: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.driving & Double = js.native
    
    /* 1 */ val transit: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.transit & Double = js.native
    
    /* 2 */ val truck: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.truck & Double = js.native
    
    /* 3 */ val walking: typings.bingmaps.Microsoft.Maps.Directions.RouteMode.walking & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteOptimization")
  @js.native
  object RouteOptimization extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization & Double] = js.native
    
    /* 4 */ val minimizeMoney: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeMoney & Double = js.native
    
    /* 5 */ val minimizeTransfers: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeTransfers & Double = js.native
    
    /* 6 */ val minimizeWalking: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.minimizeWalking & Double = js.native
    
    /* 1 */ val shortestDistance: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.shortestDistance & Double = js.native
    
    /* 0 */ val shortestTime: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.shortestTime & Double = js.native
    
    /* 3 */ val timeAvoidClosure: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.timeAvoidClosure & Double = js.native
    
    /* 2 */ val timeWithTraffic: typings.bingmaps.Microsoft.Maps.Directions.RouteOptimization.timeWithTraffic & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.RouteResponseCode")
  @js.native
  object RouteResponseCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode & Double] = js.native
    
    /* 15 */ val atleastTwoWaypointRequired: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.atleastTwoWaypointRequired & Double = js.native
    
    /* 2 */ val cannotFindNearbyRoad: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.cannotFindNearbyRoad & Double = js.native
    
    /* 5 */ val dataSourceNotFound: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.dataSourceNotFound & Double = js.native
    
    /* 14 */ val exceedMaxWaypointLimit: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.exceedMaxWaypointLimit & Double = js.native
    
    /* 16 */ val firstOrLastStoppointIsVia: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.firstOrLastStoppointIsVia & Double = js.native
    
    /* 13 */ val hasEmptyWaypoint: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.hasEmptyWaypoint & Double = js.native
    
    /* 18 */ val invalidCredentials: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.invalidCredentials & Double = js.native
    
    /* 7 */ val noAvailableTransitTrip: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noAvailableTransitTrip & Double = js.native
    
    /* 4 */ val noSolution: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.noSolution & Double = js.native
    
    /* 10 */ val outOfTransitBounds: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.outOfTransitBounds & Double = js.native
    
    /* 17 */ val searchServiceFailed: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.searchServiceFailed & Double = js.native
    
    /* 0 */ val success: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.success & Double = js.native
    
    /* 11 */ val timeOut: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.timeOut & Double = js.native
    
    /* 3 */ val tooFar: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.tooFar & Double = js.native
    
    /* 8 */ val transitStopsTooClose: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.transitStopsTooClose & Double = js.native
    
    /* 1 */ val unknownError: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.unknownError & Double = js.native
    
    /* 9 */ val walkingBestAlternative: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.walkingBestAlternative & Double = js.native
    
    /* 12 */ val waypointDisambiguation: typings.bingmaps.Microsoft.Maps.Directions.RouteResponseCode.waypointDisambiguation & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.TimeType")
  @js.native
  object TimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Directions.TimeType & Double] = js.native
    
    /* 0 */ val arrival: typings.bingmaps.Microsoft.Maps.Directions.TimeType.arrival & Double = js.native
    
    /* 1 */ val departure: typings.bingmaps.Microsoft.Maps.Directions.TimeType.departure & Double = js.native
    
    /* 2 */ val firstAvailable: typings.bingmaps.Microsoft.Maps.Directions.TimeType.firstAvailable & Double = js.native
    
    /* 3 */ val lastAvailable: typings.bingmaps.Microsoft.Maps.Directions.TimeType.lastAvailable & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Directions.Waypoint")
  @js.native
  class Waypoint protected ()
    extends StObject
       with typings.bingmaps.Microsoft.Maps.Directions.Waypoint {
    /**
      * @constructor
      * @param options: Options used to define the Waypoint.
      */
    def this(options: IWaypointOptions) = this()
    
    /** Releases any resources associated with the waypoint. */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets the address associated with the waypoint.
      * @returns The address associated with the waypoint.
      */
    /* CompleteClass */
    override def getAddress(): String = js.native
    
    /**
      * Gets the location of the waypoint.
      * @returns The location of the waypoint.
      */
    /* CompleteClass */
    override def getLocation(): typings.bingmaps.Microsoft.Maps.Location = js.native
    
    /**
      * Gets a boolean value indicating whether the waypoint is a via point.
      * @returns A boolean value indicating whether the waypoint is a via point.
      */
    /* CompleteClass */
    override def isViapoint(): Boolean = js.native
    
    /**
      * Sets options for the waypoint. For these options to take effect, you must recalculate the route.
      * @param options Options used to define the Waypoint.
      */
    /* CompleteClass */
    override def setOptions(options: IWaypointOptions): Unit = js.native
  }
}
