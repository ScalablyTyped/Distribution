package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDirectionsRenderOptions extends js.Object {
  /** A boolean indicating whether to automatically set the map view to the best map view of the calculated route. Default: true */
  var autoUpdateMapView: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to display the disclaimer about the accuracy of the directions. Default: true */
  var displayDisclaimer: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to display the icons for each direction maneuver. Default: true */
  var displayManeuverIcons: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to display direction hints that describe when a direction step was missed. Default: true */
  var displayPostItineraryItemHints: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * A boolean indicating whether to display direction hints that describe what to look for before you come to the next
          * direction step. The default value is true.
          */
  var displayPreItineraryItemHints: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to display the route selector control. Default: true */
  var displayRouteSelector: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to display direction warnings. Default: true */
  var displayStepWarnings: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating whether to display a warning about walking directions. Default: true */
  var displayWalkingWarning: js.UndefOr[scala.Boolean] = js.undefined
  /** The polyline options that define how to draw the route line on the map, if the RouteMode is driving. */
  var drivingPolylineOptions: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions] = js.undefined
  /** The pushpin options that define how the first waypoint should be rendered. */
  var firstWaypointPushpinOptions: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions] = js.undefined
  /** The DOM element inside which the directions itinerary will be rendered. */
  var itineraryContainer: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** The pushpin options that define how the last waypoint should be rendered. */
  var lastWaypointPushpinOptions: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions] = js.undefined
  /** A boolean indicating whether to show the input panel. Default: false */
  var showInputPanel: js.UndefOr[scala.Boolean] = js.undefined
  /** The options that define how to draw the route line on the map, if the RouteMode is transit. */
  var transitPolylineOptions: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions] = js.undefined
  /** The options that define how to draw the route line on the map, if the RouteMode is walking. */
  var walkingPolylineOptions: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions] = js.undefined
  /** The options that define the pushpin to use for all route waypoints by default. The first and last waypoints in the route will be overriden by firstWaypointPushpinOptions and lastWaypointPushpinOptions if set.  */
  var waypointPushpinOptions: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions] = js.undefined
}

