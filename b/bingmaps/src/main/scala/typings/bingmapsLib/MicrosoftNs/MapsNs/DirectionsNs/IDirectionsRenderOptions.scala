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

object IDirectionsRenderOptions {
  @scala.inline
  def apply(
    autoUpdateMapView: js.UndefOr[scala.Boolean] = js.undefined,
    displayDisclaimer: js.UndefOr[scala.Boolean] = js.undefined,
    displayManeuverIcons: js.UndefOr[scala.Boolean] = js.undefined,
    displayPostItineraryItemHints: js.UndefOr[scala.Boolean] = js.undefined,
    displayPreItineraryItemHints: js.UndefOr[scala.Boolean] = js.undefined,
    displayRouteSelector: js.UndefOr[scala.Boolean] = js.undefined,
    displayStepWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    displayWalkingWarning: js.UndefOr[scala.Boolean] = js.undefined,
    drivingPolylineOptions: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions = null,
    firstWaypointPushpinOptions: bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions = null,
    itineraryContainer: stdLib.HTMLElement = null,
    lastWaypointPushpinOptions: bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions = null,
    showInputPanel: js.UndefOr[scala.Boolean] = js.undefined,
    transitPolylineOptions: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions = null,
    walkingPolylineOptions: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions = null,
    waypointPushpinOptions: bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions = null
  ): IDirectionsRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdateMapView)) __obj.updateDynamic("autoUpdateMapView")(autoUpdateMapView)
    if (!js.isUndefined(displayDisclaimer)) __obj.updateDynamic("displayDisclaimer")(displayDisclaimer)
    if (!js.isUndefined(displayManeuverIcons)) __obj.updateDynamic("displayManeuverIcons")(displayManeuverIcons)
    if (!js.isUndefined(displayPostItineraryItemHints)) __obj.updateDynamic("displayPostItineraryItemHints")(displayPostItineraryItemHints)
    if (!js.isUndefined(displayPreItineraryItemHints)) __obj.updateDynamic("displayPreItineraryItemHints")(displayPreItineraryItemHints)
    if (!js.isUndefined(displayRouteSelector)) __obj.updateDynamic("displayRouteSelector")(displayRouteSelector)
    if (!js.isUndefined(displayStepWarnings)) __obj.updateDynamic("displayStepWarnings")(displayStepWarnings)
    if (!js.isUndefined(displayWalkingWarning)) __obj.updateDynamic("displayWalkingWarning")(displayWalkingWarning)
    if (drivingPolylineOptions != null) __obj.updateDynamic("drivingPolylineOptions")(drivingPolylineOptions)
    if (firstWaypointPushpinOptions != null) __obj.updateDynamic("firstWaypointPushpinOptions")(firstWaypointPushpinOptions)
    if (itineraryContainer != null) __obj.updateDynamic("itineraryContainer")(itineraryContainer)
    if (lastWaypointPushpinOptions != null) __obj.updateDynamic("lastWaypointPushpinOptions")(lastWaypointPushpinOptions)
    if (!js.isUndefined(showInputPanel)) __obj.updateDynamic("showInputPanel")(showInputPanel)
    if (transitPolylineOptions != null) __obj.updateDynamic("transitPolylineOptions")(transitPolylineOptions)
    if (walkingPolylineOptions != null) __obj.updateDynamic("walkingPolylineOptions")(walkingPolylineOptions)
    if (waypointPushpinOptions != null) __obj.updateDynamic("waypointPushpinOptions")(waypointPushpinOptions)
    __obj.asInstanceOf[IDirectionsRenderOptions]
  }
}

