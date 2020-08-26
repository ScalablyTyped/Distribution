package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapOptions extends js.Object {
  /**
    * A boolean that, when set to true, allows the road labels to be hidden. Default: false
    * This property can only be set when using the Map constructor. This property can only be set when using the Map constructor.
    */
  var allowHidingLabelsOfRoad: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the infobox is allowed to overflow outside the bounds of the map. Default: false. */
  var allowInfoboxOverflow: js.UndefOr[Boolean] = js.native
  /** The color to use for the map control background. The default color is #EAE8E1. This property can only be set when using the Map constructor. */
  var backgroundColor: js.UndefOr[String | Color] = js.native
  /** Custom map styles used to modify the look and feel of the base map. */
  var customMapStyle: js.UndefOr[ICustomMapStyle] = js.native
  /**
    * A boolean indicating whether to disable the bird’s eye map type. The default value is false. If this property is set to true, bird’s eye will be removed
    * from the map navigation control and the birdseye MapTypeId is disabled. Additionally, the auto map type will only display road or aerial.
    * This property can only be set when using the Map constructor.
    */
  var disableBirdseye: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating whether to disable the user’s ability to control the using the keyboard. Default: false */
  var disableKeyboardInput: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating if mousing over the map type selector should open it or not. Default: false */
  var disableMapTypeSelectorMouseOver: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating whether to disable the user's ability to pan the map. Default: false */
  var disablePanning: js.UndefOr[Boolean] = js.native
  /**
    * Scrolling the mouse wheel over the map will zoom it in or out, but will not scroll the page.
    * Setting this property to true disables the zooming of the map and instead reverts back to scrolling the page.
    * Default: false
    */
  var disableScrollWheelZoom: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether to disable streetside mode.If this property is set to true, streetside will be removed from
    * the navigation bar, and the automatic coverage overlay will be disabled when zoomed in at lower zoom levels. Default false
    * This property can only be set when using the Map constructor.
    */
  var disableStreetside: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether to disable the automatic streetside coverage layer that appears when zoomed in at lower zoom
    * levels. Default false
    * This property can only be set when using the Map constructor.
    **/
  var disableStreetsideAutoCoverage: js.UndefOr[Boolean] = js.native
  /** A boolean value indicating whether to disable the user's ability to zoom in or out. Default: false */
  var disableZooming: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating if CORS (Cross-origin Resource Sharing) should be enabled for tiles. Useful if directly accessing the canvas to generate an image of the map. Default: false
    * Known Limitations: IE and Edge will not cache tiles when CORS is enabled. Chrome throws errors when this property is set enabled and custom tile layers don’t have CORS enabled on the server.
    * This property can only be set when using the Map constructor.
    */
  var enableCORS: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether the Bing(TM) logo on the map is clickable. Default: true.
    * This property can only be set when using the Map constructor.
    */
  var enableClickableLogo: js.UndefOr[Boolean] = js.native
  /**
  		* Enables the map to use map tiles suitable for a higher DPI display, if the display supports it. 
  		* When set to false and the map is loaded on a high DPI display, custom tile layers will load tiles 
  		* at a higher zoom level and scale the image to increase the DPI. Default: false.
  		*/
  var enableHighDpi: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to use the inertia animation effect during map navigation. Default: true
    * This property can only be set when using the Map constructor.
    */
  var enableInertia: js.UndefOr[Boolean] = js.native
  /**
    * A boolean that indicates if the map should be rendered using lite mode. When set to true vector map labels are
    * disabled and map labels are rendered directly into the map tiles. This offers improved performance, but will result
    * in the labels being rendered behind data on the map and the labels will also not use collision dection with pushpins.
    * If this property is not set, the map set this value based on the target device and browser as vector labels perform
    * better in some scenrarios than others.
    * This property can only be set when using the Map constructor.
    */
  var liteMode: js.UndefOr[Boolean] = js.native
  /** A bounding area that restricts the map view. */
  var maxBounds: js.UndefOr[LocationRect] = js.native
  /** The maximum zoom level that the map can be zoomed into. */
  var maxZoom: js.UndefOr[Double] = js.native
  /** The minimum zoom level that the map cab be zoomed out to. */
  var minZoom: js.UndefOr[Double] = js.native
  /** Specifies how the navigation bar should be rendered on the map. */
  var navigationBarMode: js.UndefOr[NavigationBarMode] = js.native
  /** A boolean whether what orientation should be used when laying out the navigation controls. */
  var navigationBarOrientation: js.UndefOr[NavigationBarOrientation] = js.native
  /**
    * A boolean value indicating whether to display the “breadcrumb control”. The breadcrumb control shows the current center location’s geography hierarchy.
    * The default value is false. Requires the showLocateMeButton map option to be set to true. The breadcrumb control displays best when the width of the map
    * is at least 400 pixels.
    */
  var showBreadcrumb: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the map navigation control. Default: true This property can only be set when using the Map constructor.
    */
  var showDashboard: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show a button that centers the map over the user's location in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showLocateMeButton: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether or not to show the map Bing logo. The default value is true.
    * This property can only be set when using the Map constructor.
    */
  var showLogo: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the map type selector in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showMapTypeSelector: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the scale bar. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showScalebar: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show a link to the End User Terms of Use, which appears to the right of the copyrights, or not. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showTermsLink: js.UndefOr[Boolean] = js.native
  /** When using the minified navigation bar, a traffic button is displayed. Setting this option to false will hide this button. */
  var showTrafficButton: js.UndefOr[Boolean] = js.native
  /**
    * A boolean value indicating whether to show the zoom buttons in the map navigation control. Default: true
    * This property can only be set when using the Map constructor.
    */
  var showZoomButtons: js.UndefOr[Boolean] = js.native
  /** A set of properties for the streetside mode of the map. */
  var streetsideOptions: js.UndefOr[IStreetsideOptions] = js.native
  /** Additional support map types that should be added to the navigaiton bar such as canvasDark, canvasLight, and grayscale.*/
  var supportedMapTypes: js.UndefOr[js.Array[MapTypeId]] = js.native
}

object IMapOptions {
  @scala.inline
  def apply(): IMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapOptions]
  }
  @scala.inline
  implicit class IMapOptionsOps[Self <: IMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowHidingLabelsOfRoad(value: Boolean): Self = this.set("allowHidingLabelsOfRoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHidingLabelsOfRoad: Self = this.set("allowHidingLabelsOfRoad", js.undefined)
    @scala.inline
    def setAllowInfoboxOverflow(value: Boolean): Self = this.set("allowInfoboxOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInfoboxOverflow: Self = this.set("allowInfoboxOverflow", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String | Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setCustomMapStyle(value: ICustomMapStyle): Self = this.set("customMapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMapStyle: Self = this.set("customMapStyle", js.undefined)
    @scala.inline
    def setDisableBirdseye(value: Boolean): Self = this.set("disableBirdseye", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBirdseye: Self = this.set("disableBirdseye", js.undefined)
    @scala.inline
    def setDisableKeyboardInput(value: Boolean): Self = this.set("disableKeyboardInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableKeyboardInput: Self = this.set("disableKeyboardInput", js.undefined)
    @scala.inline
    def setDisableMapTypeSelectorMouseOver(value: Boolean): Self = this.set("disableMapTypeSelectorMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableMapTypeSelectorMouseOver: Self = this.set("disableMapTypeSelectorMouseOver", js.undefined)
    @scala.inline
    def setDisablePanning(value: Boolean): Self = this.set("disablePanning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePanning: Self = this.set("disablePanning", js.undefined)
    @scala.inline
    def setDisableScrollWheelZoom(value: Boolean): Self = this.set("disableScrollWheelZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScrollWheelZoom: Self = this.set("disableScrollWheelZoom", js.undefined)
    @scala.inline
    def setDisableStreetside(value: Boolean): Self = this.set("disableStreetside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStreetside: Self = this.set("disableStreetside", js.undefined)
    @scala.inline
    def setDisableStreetsideAutoCoverage(value: Boolean): Self = this.set("disableStreetsideAutoCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStreetsideAutoCoverage: Self = this.set("disableStreetsideAutoCoverage", js.undefined)
    @scala.inline
    def setDisableZooming(value: Boolean): Self = this.set("disableZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableZooming: Self = this.set("disableZooming", js.undefined)
    @scala.inline
    def setEnableCORS(value: Boolean): Self = this.set("enableCORS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCORS: Self = this.set("enableCORS", js.undefined)
    @scala.inline
    def setEnableClickableLogo(value: Boolean): Self = this.set("enableClickableLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableClickableLogo: Self = this.set("enableClickableLogo", js.undefined)
    @scala.inline
    def setEnableHighDpi(value: Boolean): Self = this.set("enableHighDpi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighDpi: Self = this.set("enableHighDpi", js.undefined)
    @scala.inline
    def setEnableInertia(value: Boolean): Self = this.set("enableInertia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableInertia: Self = this.set("enableInertia", js.undefined)
    @scala.inline
    def setLiteMode(value: Boolean): Self = this.set("liteMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiteMode: Self = this.set("liteMode", js.undefined)
    @scala.inline
    def setMaxBounds(value: LocationRect): Self = this.set("maxBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBounds: Self = this.set("maxBounds", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setNavigationBarMode(value: NavigationBarMode): Self = this.set("navigationBarMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarMode: Self = this.set("navigationBarMode", js.undefined)
    @scala.inline
    def setNavigationBarOrientation(value: NavigationBarOrientation): Self = this.set("navigationBarOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarOrientation: Self = this.set("navigationBarOrientation", js.undefined)
    @scala.inline
    def setShowBreadcrumb(value: Boolean): Self = this.set("showBreadcrumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBreadcrumb: Self = this.set("showBreadcrumb", js.undefined)
    @scala.inline
    def setShowDashboard(value: Boolean): Self = this.set("showDashboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDashboard: Self = this.set("showDashboard", js.undefined)
    @scala.inline
    def setShowLocateMeButton(value: Boolean): Self = this.set("showLocateMeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLocateMeButton: Self = this.set("showLocateMeButton", js.undefined)
    @scala.inline
    def setShowLogo(value: Boolean): Self = this.set("showLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLogo: Self = this.set("showLogo", js.undefined)
    @scala.inline
    def setShowMapTypeSelector(value: Boolean): Self = this.set("showMapTypeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMapTypeSelector: Self = this.set("showMapTypeSelector", js.undefined)
    @scala.inline
    def setShowScalebar(value: Boolean): Self = this.set("showScalebar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowScalebar: Self = this.set("showScalebar", js.undefined)
    @scala.inline
    def setShowTermsLink(value: Boolean): Self = this.set("showTermsLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTermsLink: Self = this.set("showTermsLink", js.undefined)
    @scala.inline
    def setShowTrafficButton(value: Boolean): Self = this.set("showTrafficButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTrafficButton: Self = this.set("showTrafficButton", js.undefined)
    @scala.inline
    def setShowZoomButtons(value: Boolean): Self = this.set("showZoomButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowZoomButtons: Self = this.set("showZoomButtons", js.undefined)
    @scala.inline
    def setStreetsideOptions(value: IStreetsideOptions): Self = this.set("streetsideOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetsideOptions: Self = this.set("streetsideOptions", js.undefined)
    @scala.inline
    def setSupportedMapTypesVarargs(value: MapTypeId*): Self = this.set("supportedMapTypes", js.Array(value :_*))
    @scala.inline
    def setSupportedMapTypes(value: js.Array[MapTypeId]): Self = this.set("supportedMapTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedMapTypes: Self = this.set("supportedMapTypes", js.undefined)
  }
  
}

