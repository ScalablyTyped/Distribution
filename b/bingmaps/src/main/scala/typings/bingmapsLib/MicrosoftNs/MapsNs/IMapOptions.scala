package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapOptions extends js.Object {
  /**
    * A boolean that, when set to true, allows the road labels to be hidden. Default: false
    * This property can only be set when using the Map constructor. This property can only be set when using the Map constructor.
    */
  var allowHidingLabelsOfRoad: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if the infobox is allowed to overflow outside the bounds of the map. Default: false. */
  var allowInfoboxOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /** The color to use for the map control background. The default color is #EAE8E1. This property can only be set when using the Map constructor. */
  var backgroundColor: js.UndefOr[java.lang.String | Color] = js.undefined
  /** Custom map styles used to modify the look and feel of the base map. */
  var customMapStyle: js.UndefOr[ICustomMapStyle] = js.undefined
  /**
    * A boolean indicating whether to disable the bird’s eye map type. The default value is false. If this property is set to true, bird’s eye will be removed
    * from the map navigation control and the birdseye MapTypeId is disabled. Additionally, the auto map type will only display road or aerial.
    * This property can only be set when using the Map constructor.
    */
  var disableBirdseye: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean value indicating whether to disable the user’s ability to control the using the keyboard. Default: false */
  var disableKeyboardInput: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean value indicating if mousing over the map type selector should open it or not. Default: false */
  var disableMapTypeSelectorMouseOver: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean value indicating whether to disable the user's ability to pan the map. Default: false */
  var disablePanning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Scrolling the mouse wheel over the map will zoom it in or out, but will not scroll the page.
    * Setting this property to true disables the zooming of the map and instead reverts back to scrolling the page.
    * Default: false
    */
  var disableScrollWheelZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean indicating whether to disable streetside mode.If this property is set to true, streetside will be removed from
    * the navigation bar, and the automatic coverage overlay will be disabled when zoomed in at lower zoom levels. Default false
    * This property can only be set when using the Map constructor.
    */
  var disableStreetside: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean indicating whether to disable the automatic streetside coverage layer that appears when zoomed in at lower zoom
    * levels. Default false
    * This property can only be set when using the Map constructor.
    **/
  var disableStreetsideAutoCoverage: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean value indicating whether to disable the user's ability to zoom in or out. Default: false */
  var disableZooming: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating if CORS (Cross-origin Resource Sharing) should be enabled for tiles. Useful if directly accessing the canvas to generate an image of the map. Default: false
    * Known Limitations: IE and Edge will not cache tiles when CORS is enabled. Chrome throws errors when this property is set enabled and custom tile layers don’t have CORS enabled on the server.
    * This property can only be set when using the Map constructor.
    */
  var enableCORS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether the Bing(TM) logo on the map is clickable. Default: true.
    * This property can only be set when using the Map constructor.
    */
  var enableClickableLogo: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Enables the map to use map tiles suitable for a higher DPI display, if the display supports it. 
  		* When set to false and the map is loaded on a high DPI display, custom tile layers will load tiles 
  		* at a higher zoom level and scale the image to increase the DPI. Default: false.
  		*/
  var enableHighDpi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to use the inertia animation effect during map navigation. Default: true
    * This property can only be set when using the Map constructor.
    */
  var enableInertia: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean that indicates if the map should be rendered using lite mode. When set to true vector map labels are
    * disabled and map labels are rendered directly into the map tiles. This offers improved performance, but will result
    * in the labels being rendered behind data on the map and the labels will also not use collision dection with pushpins.
    * If this property is not set, the map set this value based on the target device and browser as vector labels perform
    * better in some scenrarios than others.
    * This property can only be set when using the Map constructor.
    */
  var liteMode: js.UndefOr[scala.Boolean] = js.undefined
  /** A bounding area that restricts the map view. */
  var maxBounds: js.UndefOr[LocationRect] = js.undefined
  /** The maximum zoom level that the map can be zoomed into. */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /** The minimum zoom level that the map cab be zoomed out to. */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /** Specifies how the navigation bar should be rendered on the map. */
  var navigationBarMode: js.UndefOr[NavigationBarMode] = js.undefined
  /** A boolean whether what orientation should be used when laying out the navigation controls. */
  var navigationBarOrientation: js.UndefOr[NavigationBarOrientation] = js.undefined
  /**
    * A boolean value indicating whether to display the “breadcrumb control”. The breadcrumb control shows the current center location’s geography hierarchy.
    * The default value is false. Requires the showLocateMeButton map option to be set to true. The breadcrumb control displays best when the width of the map
    * is at least 400 pixels.
    */
  var showBreadcrumb: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to show the map navigation control. Default: true This property can only be set when using the Map constructor.
    */
  var showDashboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to show a button that centers the map over the user's location in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showLocateMeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether or not to show the map Bing logo. The default value is true.
    * This property can only be set when using the Map constructor.
    */
  var showLogo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to show the map type selector in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showMapTypeSelector: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to show the scale bar. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showScalebar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to show a link to the End User Terms of Use, which appears to the right of the copyrights, or not. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showTermsLink: js.UndefOr[scala.Boolean] = js.undefined
  /** When using the minified navigation bar, a traffic button is displayed. Setting this option to false will hide this button. */
  var showTrafficButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean value indicating whether to show the zoom buttons in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showZoomButtons: js.UndefOr[scala.Boolean] = js.undefined
  /** A set of properties for the streetside mode of the map. */
  var streetsideOptions: js.UndefOr[IStreetsideOptions] = js.undefined
  /** Additional support map types that should be added to the navigaiton bar such as canvasDark, canvasLight, and grayscale.*/
  var supportedMapTypes: js.UndefOr[js.Array[MapTypeId]] = js.undefined
}

object IMapOptions {
  @scala.inline
  def apply(
    allowHidingLabelsOfRoad: js.UndefOr[scala.Boolean] = js.undefined,
    allowInfoboxOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | Color = null,
    customMapStyle: ICustomMapStyle = null,
    disableBirdseye: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardInput: js.UndefOr[scala.Boolean] = js.undefined,
    disableMapTypeSelectorMouseOver: js.UndefOr[scala.Boolean] = js.undefined,
    disablePanning: js.UndefOr[scala.Boolean] = js.undefined,
    disableScrollWheelZoom: js.UndefOr[scala.Boolean] = js.undefined,
    disableStreetside: js.UndefOr[scala.Boolean] = js.undefined,
    disableStreetsideAutoCoverage: js.UndefOr[scala.Boolean] = js.undefined,
    disableZooming: js.UndefOr[scala.Boolean] = js.undefined,
    enableCORS: js.UndefOr[scala.Boolean] = js.undefined,
    enableClickableLogo: js.UndefOr[scala.Boolean] = js.undefined,
    enableHighDpi: js.UndefOr[scala.Boolean] = js.undefined,
    enableInertia: js.UndefOr[scala.Boolean] = js.undefined,
    liteMode: js.UndefOr[scala.Boolean] = js.undefined,
    maxBounds: LocationRect = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    navigationBarMode: NavigationBarMode = null,
    navigationBarOrientation: NavigationBarOrientation = null,
    showBreadcrumb: js.UndefOr[scala.Boolean] = js.undefined,
    showDashboard: js.UndefOr[scala.Boolean] = js.undefined,
    showLocateMeButton: js.UndefOr[scala.Boolean] = js.undefined,
    showLogo: js.UndefOr[scala.Boolean] = js.undefined,
    showMapTypeSelector: js.UndefOr[scala.Boolean] = js.undefined,
    showScalebar: js.UndefOr[scala.Boolean] = js.undefined,
    showTermsLink: js.UndefOr[scala.Boolean] = js.undefined,
    showTrafficButton: js.UndefOr[scala.Boolean] = js.undefined,
    showZoomButtons: js.UndefOr[scala.Boolean] = js.undefined,
    streetsideOptions: IStreetsideOptions = null,
    supportedMapTypes: js.Array[MapTypeId] = null
  ): IMapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHidingLabelsOfRoad)) __obj.updateDynamic("allowHidingLabelsOfRoad")(allowHidingLabelsOfRoad)
    if (!js.isUndefined(allowInfoboxOverflow)) __obj.updateDynamic("allowInfoboxOverflow")(allowInfoboxOverflow)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle)
    if (!js.isUndefined(disableBirdseye)) __obj.updateDynamic("disableBirdseye")(disableBirdseye)
    if (!js.isUndefined(disableKeyboardInput)) __obj.updateDynamic("disableKeyboardInput")(disableKeyboardInput)
    if (!js.isUndefined(disableMapTypeSelectorMouseOver)) __obj.updateDynamic("disableMapTypeSelectorMouseOver")(disableMapTypeSelectorMouseOver)
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning)
    if (!js.isUndefined(disableScrollWheelZoom)) __obj.updateDynamic("disableScrollWheelZoom")(disableScrollWheelZoom)
    if (!js.isUndefined(disableStreetside)) __obj.updateDynamic("disableStreetside")(disableStreetside)
    if (!js.isUndefined(disableStreetsideAutoCoverage)) __obj.updateDynamic("disableStreetsideAutoCoverage")(disableStreetsideAutoCoverage)
    if (!js.isUndefined(disableZooming)) __obj.updateDynamic("disableZooming")(disableZooming)
    if (!js.isUndefined(enableCORS)) __obj.updateDynamic("enableCORS")(enableCORS)
    if (!js.isUndefined(enableClickableLogo)) __obj.updateDynamic("enableClickableLogo")(enableClickableLogo)
    if (!js.isUndefined(enableHighDpi)) __obj.updateDynamic("enableHighDpi")(enableHighDpi)
    if (!js.isUndefined(enableInertia)) __obj.updateDynamic("enableInertia")(enableInertia)
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode)
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (navigationBarMode != null) __obj.updateDynamic("navigationBarMode")(navigationBarMode)
    if (navigationBarOrientation != null) __obj.updateDynamic("navigationBarOrientation")(navigationBarOrientation)
    if (!js.isUndefined(showBreadcrumb)) __obj.updateDynamic("showBreadcrumb")(showBreadcrumb)
    if (!js.isUndefined(showDashboard)) __obj.updateDynamic("showDashboard")(showDashboard)
    if (!js.isUndefined(showLocateMeButton)) __obj.updateDynamic("showLocateMeButton")(showLocateMeButton)
    if (!js.isUndefined(showLogo)) __obj.updateDynamic("showLogo")(showLogo)
    if (!js.isUndefined(showMapTypeSelector)) __obj.updateDynamic("showMapTypeSelector")(showMapTypeSelector)
    if (!js.isUndefined(showScalebar)) __obj.updateDynamic("showScalebar")(showScalebar)
    if (!js.isUndefined(showTermsLink)) __obj.updateDynamic("showTermsLink")(showTermsLink)
    if (!js.isUndefined(showTrafficButton)) __obj.updateDynamic("showTrafficButton")(showTrafficButton)
    if (!js.isUndefined(showZoomButtons)) __obj.updateDynamic("showZoomButtons")(showZoomButtons)
    if (streetsideOptions != null) __obj.updateDynamic("streetsideOptions")(streetsideOptions)
    if (supportedMapTypes != null) __obj.updateDynamic("supportedMapTypes")(supportedMapTypes)
    __obj.asInstanceOf[IMapOptions]
  }
}

