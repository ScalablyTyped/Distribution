package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.IPolylineOptions
import typings.bingmaps.Microsoft.Maps.IPushpinOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectionsRenderOptions extends StObject {
  
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
  
  inline def apply(): IDirectionsRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectionsRenderOptions]
  }
  
  extension [Self <: IDirectionsRenderOptions](x: Self) {
    
    inline def setAutoUpdateMapView(value: Boolean): Self = StObject.set(x, "autoUpdateMapView", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateMapViewUndefined: Self = StObject.set(x, "autoUpdateMapView", js.undefined)
    
    inline def setDisplayDisclaimer(value: Boolean): Self = StObject.set(x, "displayDisclaimer", value.asInstanceOf[js.Any])
    
    inline def setDisplayDisclaimerUndefined: Self = StObject.set(x, "displayDisclaimer", js.undefined)
    
    inline def setDisplayManeuverIcons(value: Boolean): Self = StObject.set(x, "displayManeuverIcons", value.asInstanceOf[js.Any])
    
    inline def setDisplayManeuverIconsUndefined: Self = StObject.set(x, "displayManeuverIcons", js.undefined)
    
    inline def setDisplayPostItineraryItemHints(value: Boolean): Self = StObject.set(x, "displayPostItineraryItemHints", value.asInstanceOf[js.Any])
    
    inline def setDisplayPostItineraryItemHintsUndefined: Self = StObject.set(x, "displayPostItineraryItemHints", js.undefined)
    
    inline def setDisplayPreItineraryItemHints(value: Boolean): Self = StObject.set(x, "displayPreItineraryItemHints", value.asInstanceOf[js.Any])
    
    inline def setDisplayPreItineraryItemHintsUndefined: Self = StObject.set(x, "displayPreItineraryItemHints", js.undefined)
    
    inline def setDisplayRouteSelector(value: Boolean): Self = StObject.set(x, "displayRouteSelector", value.asInstanceOf[js.Any])
    
    inline def setDisplayRouteSelectorUndefined: Self = StObject.set(x, "displayRouteSelector", js.undefined)
    
    inline def setDisplayStepWarnings(value: Boolean): Self = StObject.set(x, "displayStepWarnings", value.asInstanceOf[js.Any])
    
    inline def setDisplayStepWarningsUndefined: Self = StObject.set(x, "displayStepWarnings", js.undefined)
    
    inline def setDisplayWalkingWarning(value: Boolean): Self = StObject.set(x, "displayWalkingWarning", value.asInstanceOf[js.Any])
    
    inline def setDisplayWalkingWarningUndefined: Self = StObject.set(x, "displayWalkingWarning", js.undefined)
    
    inline def setDrivingPolylineOptions(value: IPolylineOptions): Self = StObject.set(x, "drivingPolylineOptions", value.asInstanceOf[js.Any])
    
    inline def setDrivingPolylineOptionsUndefined: Self = StObject.set(x, "drivingPolylineOptions", js.undefined)
    
    inline def setFirstWaypointPushpinOptions(value: IPushpinOptions): Self = StObject.set(x, "firstWaypointPushpinOptions", value.asInstanceOf[js.Any])
    
    inline def setFirstWaypointPushpinOptionsUndefined: Self = StObject.set(x, "firstWaypointPushpinOptions", js.undefined)
    
    inline def setItineraryContainer(value: HTMLElement): Self = StObject.set(x, "itineraryContainer", value.asInstanceOf[js.Any])
    
    inline def setItineraryContainerUndefined: Self = StObject.set(x, "itineraryContainer", js.undefined)
    
    inline def setLastWaypointPushpinOptions(value: IPushpinOptions): Self = StObject.set(x, "lastWaypointPushpinOptions", value.asInstanceOf[js.Any])
    
    inline def setLastWaypointPushpinOptionsUndefined: Self = StObject.set(x, "lastWaypointPushpinOptions", js.undefined)
    
    inline def setShowInputPanel(value: Boolean): Self = StObject.set(x, "showInputPanel", value.asInstanceOf[js.Any])
    
    inline def setShowInputPanelUndefined: Self = StObject.set(x, "showInputPanel", js.undefined)
    
    inline def setTransitPolylineOptions(value: IPolylineOptions): Self = StObject.set(x, "transitPolylineOptions", value.asInstanceOf[js.Any])
    
    inline def setTransitPolylineOptionsUndefined: Self = StObject.set(x, "transitPolylineOptions", js.undefined)
    
    inline def setWalkingPolylineOptions(value: IPolylineOptions): Self = StObject.set(x, "walkingPolylineOptions", value.asInstanceOf[js.Any])
    
    inline def setWalkingPolylineOptionsUndefined: Self = StObject.set(x, "walkingPolylineOptions", js.undefined)
    
    inline def setWaypointPushpinOptions(value: IPushpinOptions): Self = StObject.set(x, "waypointPushpinOptions", value.asInstanceOf[js.Any])
    
    inline def setWaypointPushpinOptionsUndefined: Self = StObject.set(x, "waypointPushpinOptions", js.undefined)
  }
}
