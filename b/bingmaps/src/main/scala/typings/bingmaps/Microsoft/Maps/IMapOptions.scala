package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapOptions extends StObject {
  
  /**
    * A boolean that, when set to true, allows the road labels to be hidden. Default: false
    * This property can only be set when using the Map constructor. This property can only be set when using the Map constructor.
    */
  var allowHidingLabelsOfRoad: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating if the infobox is allowed to overflow outside the bounds of the map. Default: false. */
  var allowInfoboxOverflow: js.UndefOr[Boolean] = js.undefined
  
  /** The color to use for the map control background. The default color is #EAE8E1. This property can only be set when using the Map constructor. */
  var backgroundColor: js.UndefOr[String | Color] = js.undefined
  
  /** Custom map styles used to modify the look and feel of the base map. */
  var customMapStyle: js.UndefOr[ICustomMapStyle] = js.undefined
  
  /**
    * A boolean indicating whether to disable the bird’s eye map type. The default value is false. If this property is set to true, bird’s eye will be removed
    * from the map navigation control and the birdseye MapTypeId is disabled. Additionally, the auto map type will only display road or aerial.
    * This property can only be set when using the Map constructor.
    */
  var disableBirdseye: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean value indicating whether to disable the user’s ability to control the using the keyboard. Default: false */
  var disableKeyboardInput: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean value indicating if mousing over the map type selector should open it or not. Default: false */
  var disableMapTypeSelectorMouseOver: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean value indicating whether to disable the user's ability to pan the map. Default: false */
  var disablePanning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scrolling the mouse wheel over the map will zoom it in or out, but will not scroll the page.
    * Setting this property to true disables the zooming of the map and instead reverts back to scrolling the page.
    * Default: false
    */
  var disableScrollWheelZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean indicating whether to disable streetside mode.If this property is set to true, streetside will be removed from
    * the navigation bar, and the automatic coverage overlay will be disabled when zoomed in at lower zoom levels. Default false
    * This property can only be set when using the Map constructor.
    */
  var disableStreetside: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean indicating whether to disable the automatic streetside coverage layer that appears when zoomed in at lower zoom
    * levels. Default false
    * This property can only be set when using the Map constructor.
    **/
  var disableStreetsideAutoCoverage: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean value indicating whether to disable the user's ability to zoom in or out. Default: false */
  var disableZooming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating if CORS (Cross-origin Resource Sharing) should be enabled for tiles. Useful if directly accessing the canvas to generate an image of the map. Default: false
    * Known Limitations: IE and Edge will not cache tiles when CORS is enabled. Chrome throws errors when this property is set enabled and custom tile layers don’t have CORS enabled on the server.
    * This property can only be set when using the Map constructor.
    */
  var enableCORS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether the Bing(TM) logo on the map is clickable. Default: true.
    * This property can only be set when using the Map constructor.
    */
  var enableClickableLogo: js.UndefOr[Boolean] = js.undefined
  
  /**
  		* Enables the map to use map tiles suitable for a higher DPI display, if the display supports it. 
  		* When set to false and the map is loaded on a high DPI display, custom tile layers will load tiles 
  		* at a higher zoom level and scale the image to increase the DPI. Default: false.
  		*/
  var enableHighDpi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to use the inertia animation effect during map navigation. Default: true
    * This property can only be set when using the Map constructor.
    */
  var enableInertia: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean that indicates if the map should be rendered using lite mode. When set to true vector map labels are
    * disabled and map labels are rendered directly into the map tiles. This offers improved performance, but will result
    * in the labels being rendered behind data on the map and the labels will also not use collision dection with pushpins.
    * If this property is not set, the map set this value based on the target device and browser as vector labels perform
    * better in some scenrarios than others.
    * This property can only be set when using the Map constructor.
    */
  var liteMode: js.UndefOr[Boolean] = js.undefined
  
  /** A bounding area that restricts the map view. */
  var maxBounds: js.UndefOr[LocationRect] = js.undefined
  
  /** The maximum zoom level that the map can be zoomed into. */
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  /** The minimum zoom level that the map cab be zoomed out to. */
  var minZoom: js.UndefOr[Double] = js.undefined
  
  /** Specifies how the navigation bar should be rendered on the map. */
  var navigationBarMode: js.UndefOr[NavigationBarMode] = js.undefined
  
  /** A boolean whether what orientation should be used when laying out the navigation controls. */
  var navigationBarOrientation: js.UndefOr[NavigationBarOrientation] = js.undefined
  
  /**
    * A boolean value indicating whether to display the “breadcrumb control”. The breadcrumb control shows the current center location’s geography hierarchy.
    * The default value is false. Requires the showLocateMeButton map option to be set to true. The breadcrumb control displays best when the width of the map
    * is at least 400 pixels.
    */
  var showBreadcrumb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to show the map navigation control. Default: true This property can only be set when using the Map constructor.
    */
  var showDashboard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to show a button that centers the map over the user's location in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showLocateMeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether or not to show the map Bing logo. The default value is true.
    * This property can only be set when using the Map constructor.
    */
  var showLogo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to show the map type selector in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showMapTypeSelector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to show the scale bar. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showScalebar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to show a link to the End User Terms of Use, which appears to the right of the copyrights, or not. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showTermsLink: js.UndefOr[Boolean] = js.undefined
  
  /** When using the minified navigation bar, a traffic button is displayed. Setting this option to false will hide this button. */
  var showTrafficButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value indicating whether to show the zoom buttons in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showZoomButtons: js.UndefOr[Boolean] = js.undefined
  
  /** A set of properties for the streetside mode of the map. */
  var streetsideOptions: js.UndefOr[IStreetsideOptions] = js.undefined
  
  /** Additional support map types that should be added to the navigaiton bar such as canvasDark, canvasLight, and grayscale.*/
  var supportedMapTypes: js.UndefOr[js.Array[MapTypeId]] = js.undefined
}
object IMapOptions {
  
  inline def apply(): IMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapOptions]
  }
  
  extension [Self <: IMapOptions](x: Self) {
    
    inline def setAllowHidingLabelsOfRoad(value: Boolean): Self = StObject.set(x, "allowHidingLabelsOfRoad", value.asInstanceOf[js.Any])
    
    inline def setAllowHidingLabelsOfRoadUndefined: Self = StObject.set(x, "allowHidingLabelsOfRoad", js.undefined)
    
    inline def setAllowInfoboxOverflow(value: Boolean): Self = StObject.set(x, "allowInfoboxOverflow", value.asInstanceOf[js.Any])
    
    inline def setAllowInfoboxOverflowUndefined: Self = StObject.set(x, "allowInfoboxOverflow", js.undefined)
    
    inline def setBackgroundColor(value: String | Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCustomMapStyle(value: ICustomMapStyle): Self = StObject.set(x, "customMapStyle", value.asInstanceOf[js.Any])
    
    inline def setCustomMapStyleUndefined: Self = StObject.set(x, "customMapStyle", js.undefined)
    
    inline def setDisableBirdseye(value: Boolean): Self = StObject.set(x, "disableBirdseye", value.asInstanceOf[js.Any])
    
    inline def setDisableBirdseyeUndefined: Self = StObject.set(x, "disableBirdseye", js.undefined)
    
    inline def setDisableKeyboardInput(value: Boolean): Self = StObject.set(x, "disableKeyboardInput", value.asInstanceOf[js.Any])
    
    inline def setDisableKeyboardInputUndefined: Self = StObject.set(x, "disableKeyboardInput", js.undefined)
    
    inline def setDisableMapTypeSelectorMouseOver(value: Boolean): Self = StObject.set(x, "disableMapTypeSelectorMouseOver", value.asInstanceOf[js.Any])
    
    inline def setDisableMapTypeSelectorMouseOverUndefined: Self = StObject.set(x, "disableMapTypeSelectorMouseOver", js.undefined)
    
    inline def setDisablePanning(value: Boolean): Self = StObject.set(x, "disablePanning", value.asInstanceOf[js.Any])
    
    inline def setDisablePanningUndefined: Self = StObject.set(x, "disablePanning", js.undefined)
    
    inline def setDisableScrollWheelZoom(value: Boolean): Self = StObject.set(x, "disableScrollWheelZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollWheelZoomUndefined: Self = StObject.set(x, "disableScrollWheelZoom", js.undefined)
    
    inline def setDisableStreetside(value: Boolean): Self = StObject.set(x, "disableStreetside", value.asInstanceOf[js.Any])
    
    inline def setDisableStreetsideAutoCoverage(value: Boolean): Self = StObject.set(x, "disableStreetsideAutoCoverage", value.asInstanceOf[js.Any])
    
    inline def setDisableStreetsideAutoCoverageUndefined: Self = StObject.set(x, "disableStreetsideAutoCoverage", js.undefined)
    
    inline def setDisableStreetsideUndefined: Self = StObject.set(x, "disableStreetside", js.undefined)
    
    inline def setDisableZooming(value: Boolean): Self = StObject.set(x, "disableZooming", value.asInstanceOf[js.Any])
    
    inline def setDisableZoomingUndefined: Self = StObject.set(x, "disableZooming", js.undefined)
    
    inline def setEnableCORS(value: Boolean): Self = StObject.set(x, "enableCORS", value.asInstanceOf[js.Any])
    
    inline def setEnableCORSUndefined: Self = StObject.set(x, "enableCORS", js.undefined)
    
    inline def setEnableClickableLogo(value: Boolean): Self = StObject.set(x, "enableClickableLogo", value.asInstanceOf[js.Any])
    
    inline def setEnableClickableLogoUndefined: Self = StObject.set(x, "enableClickableLogo", js.undefined)
    
    inline def setEnableHighDpi(value: Boolean): Self = StObject.set(x, "enableHighDpi", value.asInstanceOf[js.Any])
    
    inline def setEnableHighDpiUndefined: Self = StObject.set(x, "enableHighDpi", js.undefined)
    
    inline def setEnableInertia(value: Boolean): Self = StObject.set(x, "enableInertia", value.asInstanceOf[js.Any])
    
    inline def setEnableInertiaUndefined: Self = StObject.set(x, "enableInertia", js.undefined)
    
    inline def setLiteMode(value: Boolean): Self = StObject.set(x, "liteMode", value.asInstanceOf[js.Any])
    
    inline def setLiteModeUndefined: Self = StObject.set(x, "liteMode", js.undefined)
    
    inline def setMaxBounds(value: LocationRect): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    inline def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setNavigationBarMode(value: NavigationBarMode): Self = StObject.set(x, "navigationBarMode", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarModeUndefined: Self = StObject.set(x, "navigationBarMode", js.undefined)
    
    inline def setNavigationBarOrientation(value: NavigationBarOrientation): Self = StObject.set(x, "navigationBarOrientation", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarOrientationUndefined: Self = StObject.set(x, "navigationBarOrientation", js.undefined)
    
    inline def setShowBreadcrumb(value: Boolean): Self = StObject.set(x, "showBreadcrumb", value.asInstanceOf[js.Any])
    
    inline def setShowBreadcrumbUndefined: Self = StObject.set(x, "showBreadcrumb", js.undefined)
    
    inline def setShowDashboard(value: Boolean): Self = StObject.set(x, "showDashboard", value.asInstanceOf[js.Any])
    
    inline def setShowDashboardUndefined: Self = StObject.set(x, "showDashboard", js.undefined)
    
    inline def setShowLocateMeButton(value: Boolean): Self = StObject.set(x, "showLocateMeButton", value.asInstanceOf[js.Any])
    
    inline def setShowLocateMeButtonUndefined: Self = StObject.set(x, "showLocateMeButton", js.undefined)
    
    inline def setShowLogo(value: Boolean): Self = StObject.set(x, "showLogo", value.asInstanceOf[js.Any])
    
    inline def setShowLogoUndefined: Self = StObject.set(x, "showLogo", js.undefined)
    
    inline def setShowMapTypeSelector(value: Boolean): Self = StObject.set(x, "showMapTypeSelector", value.asInstanceOf[js.Any])
    
    inline def setShowMapTypeSelectorUndefined: Self = StObject.set(x, "showMapTypeSelector", js.undefined)
    
    inline def setShowScalebar(value: Boolean): Self = StObject.set(x, "showScalebar", value.asInstanceOf[js.Any])
    
    inline def setShowScalebarUndefined: Self = StObject.set(x, "showScalebar", js.undefined)
    
    inline def setShowTermsLink(value: Boolean): Self = StObject.set(x, "showTermsLink", value.asInstanceOf[js.Any])
    
    inline def setShowTermsLinkUndefined: Self = StObject.set(x, "showTermsLink", js.undefined)
    
    inline def setShowTrafficButton(value: Boolean): Self = StObject.set(x, "showTrafficButton", value.asInstanceOf[js.Any])
    
    inline def setShowTrafficButtonUndefined: Self = StObject.set(x, "showTrafficButton", js.undefined)
    
    inline def setShowZoomButtons(value: Boolean): Self = StObject.set(x, "showZoomButtons", value.asInstanceOf[js.Any])
    
    inline def setShowZoomButtonsUndefined: Self = StObject.set(x, "showZoomButtons", js.undefined)
    
    inline def setStreetsideOptions(value: IStreetsideOptions): Self = StObject.set(x, "streetsideOptions", value.asInstanceOf[js.Any])
    
    inline def setStreetsideOptionsUndefined: Self = StObject.set(x, "streetsideOptions", js.undefined)
    
    inline def setSupportedMapTypes(value: js.Array[MapTypeId]): Self = StObject.set(x, "supportedMapTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedMapTypesUndefined: Self = StObject.set(x, "supportedMapTypes", js.undefined)
    
    inline def setSupportedMapTypesVarargs(value: MapTypeId*): Self = StObject.set(x, "supportedMapTypes", js.Array(value*))
  }
}
