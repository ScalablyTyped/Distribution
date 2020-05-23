package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.IPolylineOptions
import typings.bingmaps.Microsoft.Maps.IPushpinOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsRenderOptions extends js.Object {
  /** A boolean indicating whether to automatically set the map view to the best map view of the calculated route. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to display the disclaimer about the accuracy of the directions. Default: true */
  var displayDisclaimer: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to display the icons for each direction maneuver. Default: true */
  var displayManeuverIcons: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to display direction hints that describe when a direction step was missed. Default: true */
  var displayPostItineraryItemHints: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean indicating whether to display direction hints that describe what to look for before you come to the next
    * direction step. The default value is true.
    */
  var displayPreItineraryItemHints: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to display the route selector control. Default: true */
  var displayRouteSelector: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to display direction warnings. Default: true */
  var displayStepWarnings: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating whether to display a warning about walking directions. Default: true */
  var displayWalkingWarning: js.UndefOr[Boolean] = js.undefined
  /** The polyline options that define how to draw the route line on the map, if the RouteMode is driving. */
  var drivingPolylineOptions: js.UndefOr[IPolylineOptions] = js.undefined
  /** The pushpin options that define how the first waypoint should be rendered. */
  var firstWaypointPushpinOptions: js.UndefOr[IPushpinOptions] = js.undefined
  /** The DOM element inside which the directions itinerary will be rendered. */
  var itineraryContainer: js.UndefOr[HTMLElement] = js.undefined
  /** The pushpin options that define how the last waypoint should be rendered. */
  var lastWaypointPushpinOptions: js.UndefOr[IPushpinOptions] = js.undefined
  /** A boolean indicating whether to show the input panel. Default: false */
  var showInputPanel: js.UndefOr[Boolean] = js.undefined
  /** The options that define how to draw the route line on the map, if the RouteMode is transit. */
  var transitPolylineOptions: js.UndefOr[IPolylineOptions] = js.undefined
  /** The options that define how to draw the route line on the map, if the RouteMode is walking. */
  var walkingPolylineOptions: js.UndefOr[IPolylineOptions] = js.undefined
  /** The options that define the pushpin to use for all route waypoints by default. The first and last waypoints in the route will be overriden by firstWaypointPushpinOptions and lastWaypointPushpinOptions if set.  */
  var waypointPushpinOptions: js.UndefOr[IPushpinOptions] = js.undefined
}

object IDirectionsRenderOptions {
  @scala.inline
  def apply(
    autoUpdateMapView: js.UndefOr[Boolean] = js.undefined,
    displayDisclaimer: js.UndefOr[Boolean] = js.undefined,
    displayManeuverIcons: js.UndefOr[Boolean] = js.undefined,
    displayPostItineraryItemHints: js.UndefOr[Boolean] = js.undefined,
    displayPreItineraryItemHints: js.UndefOr[Boolean] = js.undefined,
    displayRouteSelector: js.UndefOr[Boolean] = js.undefined,
    displayStepWarnings: js.UndefOr[Boolean] = js.undefined,
    displayWalkingWarning: js.UndefOr[Boolean] = js.undefined,
    drivingPolylineOptions: IPolylineOptions = null,
    firstWaypointPushpinOptions: IPushpinOptions = null,
    itineraryContainer: HTMLElement = null,
    lastWaypointPushpinOptions: IPushpinOptions = null,
    showInputPanel: js.UndefOr[Boolean] = js.undefined,
    transitPolylineOptions: IPolylineOptions = null,
    walkingPolylineOptions: IPolylineOptions = null,
    waypointPushpinOptions: IPushpinOptions = null
  ): IDirectionsRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdateMapView)) __obj.updateDynamic("autoUpdateMapView")(autoUpdateMapView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDisclaimer)) __obj.updateDynamic("displayDisclaimer")(displayDisclaimer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayManeuverIcons)) __obj.updateDynamic("displayManeuverIcons")(displayManeuverIcons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayPostItineraryItemHints)) __obj.updateDynamic("displayPostItineraryItemHints")(displayPostItineraryItemHints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayPreItineraryItemHints)) __obj.updateDynamic("displayPreItineraryItemHints")(displayPreItineraryItemHints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayRouteSelector)) __obj.updateDynamic("displayRouteSelector")(displayRouteSelector.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayStepWarnings)) __obj.updateDynamic("displayStepWarnings")(displayStepWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayWalkingWarning)) __obj.updateDynamic("displayWalkingWarning")(displayWalkingWarning.get.asInstanceOf[js.Any])
    if (drivingPolylineOptions != null) __obj.updateDynamic("drivingPolylineOptions")(drivingPolylineOptions.asInstanceOf[js.Any])
    if (firstWaypointPushpinOptions != null) __obj.updateDynamic("firstWaypointPushpinOptions")(firstWaypointPushpinOptions.asInstanceOf[js.Any])
    if (itineraryContainer != null) __obj.updateDynamic("itineraryContainer")(itineraryContainer.asInstanceOf[js.Any])
    if (lastWaypointPushpinOptions != null) __obj.updateDynamic("lastWaypointPushpinOptions")(lastWaypointPushpinOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showInputPanel)) __obj.updateDynamic("showInputPanel")(showInputPanel.get.asInstanceOf[js.Any])
    if (transitPolylineOptions != null) __obj.updateDynamic("transitPolylineOptions")(transitPolylineOptions.asInstanceOf[js.Any])
    if (walkingPolylineOptions != null) __obj.updateDynamic("walkingPolylineOptions")(walkingPolylineOptions.asInstanceOf[js.Any])
    if (waypointPushpinOptions != null) __obj.updateDynamic("waypointPushpinOptions")(waypointPushpinOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsRenderOptions]
  }
}

