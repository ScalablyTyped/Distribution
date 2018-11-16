package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Directions.DirectionsManager")
@js.native
class DirectionsManager protected () extends js.Object {
  /**
           * @constructor
           * @param map A map to calculate directions for.
           * @param waypoints An array of waypoints to be added to the route.
           */
  def this(map: bingmapsLib.MicrosoftNs.MapsNs.Map) = this()
  /**
           * @constructor
           * @param map A map to calculate directions for.
           * @param waypoints An array of waypoints to be added to the route.
           */
  def this(map: bingmapsLib.MicrosoftNs.MapsNs.Map, waypoints: js.Array[Waypoint]) = this()
  /**
           * Adds a waypoint to the route at the given index, if specified. If an index is not specified, the waypoint is added as the last waypoint in the route. The maximum number of walking or driving waypoints is 25. The maximum number of transit waypoints is 2. Up to 10 via points are allowed between two stop waypoints. To recalculate the route, use calculateDirections.
           * @param waypoint The waypoint to be added to the directions manager.
           * @param index An index at which the waypoint is to be added.
           */
  def addWaypoint(waypoint: Waypoint): scala.Unit = js.native
  /**
           * Adds a waypoint to the route at the given index, if specified. If an index is not specified, the waypoint is added as the last waypoint in the route. The maximum number of walking or driving waypoints is 25. The maximum number of transit waypoints is 2. Up to 10 via points are allowed between two stop waypoints. To recalculate the route, use calculateDirections.
           * @param waypoint The waypoint to be added to the directions manager.
           * @param index An index at which the waypoint is to be added.
           */
  def addWaypoint(waypoint: Waypoint, index: scala.Double): scala.Unit = js.native
  /**
           * Calculates directions based on request and render options set 
           */
  def calculateDirections(): scala.Unit = js.native
  /** Clears the directions request and render options and removes all waypoints */
  def clearAll(): scala.Unit = js.native
  /**
           * Clears the directions displayed and removes the route line from the map. 
           * This method does not remove waypoints from the route and retains all calculated direction information and option settings. 
           */
  def clearDisplay(): scala.Unit = js.native
  /** Deletes the DirectionsManager object and releases any associated resources. */
  def dispose(): scala.Unit = js.native
  /**
           * Returns all current pushpins for the rendered route.This includes pushpins created by addWaypoint and viaPoints created due to drag and drop.
           */
  def getAllPushpins(): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Pushpin] = js.native
  /**
           * Gets all the waypoints in the directions manager.
           * @returns All the waypoints in the directions manager.
           */
  def getAllWaypoints(): js.Array[Waypoint] = js.native
  /**
           * Gets the currently displayed route information.
           * @returns The currently displayed route information.
           */
  def getCurrentRoute(): IRoute = js.native
  /**
          * Gets the route render options.
          * @returns The route render options
          */
  def getRenderOptions(): IDirectionsRenderOptions = js.native
  /**
           * Gets the directions request options.
           * @returns The directions request options.
           */
  def getRequestOptions(): IDirectionsRequestOptions = js.native
  /**
           * Gets the current calculated route(s)
           * @returns The current calculated route(s). If the route was not successfully calculated, null is returned.
           */
  def getRouteResult(): js.Array[IRoute] = js.native
  /**
          * Removes the given waypoint or the waypoint identified by the given index from the route. 
          * @param waypointOrIndex A Waypoint object to be removed or the index of the waypoint to be removed
          */
  def removeWaypoint(waypointOrIndex: Waypoint): scala.Unit = js.native
  /**
          * Removes the given waypoint or the waypoint identified by the given index from the route. 
          * @param waypointOrIndex A Waypoint object to be removed or the index of the waypoint to be removed
          */
  def removeWaypoint(waypointOrIndex: scala.Double): scala.Unit = js.native
  /**
           * Sets the specified render options for the route.
           * @param options The options that customize the rendering of the calculated route.
           */
  def setRenderOptions(options: IDirectionsRenderOptions): scala.Unit = js.native
  /**
           * Sets the specified route calculation options.
           * @param options The route calculation options.
           */
  def setRequestOptions(options: IDirectionsRequestOptions): scala.Unit = js.native
  /**
          * Displays an input panel for calculating directions in the specified container. Provides autosuggest for location inputs.
          * @param inputContainerId The id name of the HTML container in which to render the directions input panel.
          */
  def showInputPanel(inputContainerId: java.lang.String): scala.Unit = js.native
}

