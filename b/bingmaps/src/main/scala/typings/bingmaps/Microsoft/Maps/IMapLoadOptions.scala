package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapLoadOptions
  extends IMapOptions
     with IViewOptions {
  /** 
    * @deprecated
    * The Bing Maps Key used to authenticate the application.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference. This option will continue to work.
    */
  var credentials: js.UndefOr[String] = js.undefined
}

object IMapLoadOptions {
  @scala.inline
  def apply(
    allowHidingLabelsOfRoad: js.UndefOr[Boolean] = js.undefined,
    allowInfoboxOverflow: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String | Color = null,
    bounds: LocationRect = null,
    center: Location = null,
    centerOffset: Point = null,
    credentials: String = null,
    customMapStyle: ICustomMapStyle = null,
    disableBirdseye: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardInput: js.UndefOr[Boolean] = js.undefined,
    disableMapTypeSelectorMouseOver: js.UndefOr[Boolean] = js.undefined,
    disablePanning: js.UndefOr[Boolean] = js.undefined,
    disableScrollWheelZoom: js.UndefOr[Boolean] = js.undefined,
    disableStreetside: js.UndefOr[Boolean] = js.undefined,
    disableStreetsideAutoCoverage: js.UndefOr[Boolean] = js.undefined,
    disableZooming: js.UndefOr[Boolean] = js.undefined,
    enableCORS: js.UndefOr[Boolean] = js.undefined,
    enableClickableLogo: js.UndefOr[Boolean] = js.undefined,
    enableHighDpi: js.UndefOr[Boolean] = js.undefined,
    enableInertia: js.UndefOr[Boolean] = js.undefined,
    heading: Int | Double = null,
    labelOverlay: LabelOverlay = null,
    liteMode: js.UndefOr[Boolean] = js.undefined,
    mapTypeId: MapTypeId = null,
    maxBounds: LocationRect = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    navigationBarMode: NavigationBarMode = null,
    navigationBarOrientation: NavigationBarOrientation = null,
    padding: Int | Double = null,
    pitch: Int | Double = null,
    showBreadcrumb: js.UndefOr[Boolean] = js.undefined,
    showDashboard: js.UndefOr[Boolean] = js.undefined,
    showLocateMeButton: js.UndefOr[Boolean] = js.undefined,
    showLogo: js.UndefOr[Boolean] = js.undefined,
    showMapTypeSelector: js.UndefOr[Boolean] = js.undefined,
    showScalebar: js.UndefOr[Boolean] = js.undefined,
    showTermsLink: js.UndefOr[Boolean] = js.undefined,
    showTrafficButton: js.UndefOr[Boolean] = js.undefined,
    showZoomButtons: js.UndefOr[Boolean] = js.undefined,
    streetsideOptions: IStreetsideOptions = null,
    supportedMapTypes: js.Array[MapTypeId] = null,
    zoom: Int | Double = null
  ): IMapLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHidingLabelsOfRoad)) __obj.updateDynamic("allowHidingLabelsOfRoad")(allowHidingLabelsOfRoad.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInfoboxOverflow)) __obj.updateDynamic("allowInfoboxOverflow")(allowInfoboxOverflow.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (centerOffset != null) __obj.updateDynamic("centerOffset")(centerOffset.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBirdseye)) __obj.updateDynamic("disableBirdseye")(disableBirdseye.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardInput)) __obj.updateDynamic("disableKeyboardInput")(disableKeyboardInput.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMapTypeSelectorMouseOver)) __obj.updateDynamic("disableMapTypeSelectorMouseOver")(disableMapTypeSelectorMouseOver.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollWheelZoom)) __obj.updateDynamic("disableScrollWheelZoom")(disableScrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStreetside)) __obj.updateDynamic("disableStreetside")(disableStreetside.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStreetsideAutoCoverage)) __obj.updateDynamic("disableStreetsideAutoCoverage")(disableStreetsideAutoCoverage.asInstanceOf[js.Any])
    if (!js.isUndefined(disableZooming)) __obj.updateDynamic("disableZooming")(disableZooming.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCORS)) __obj.updateDynamic("enableCORS")(enableCORS.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClickableLogo)) __obj.updateDynamic("enableClickableLogo")(enableClickableLogo.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighDpi)) __obj.updateDynamic("enableHighDpi")(enableHighDpi.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInertia)) __obj.updateDynamic("enableInertia")(enableInertia.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (labelOverlay != null) __obj.updateDynamic("labelOverlay")(labelOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode.asInstanceOf[js.Any])
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (navigationBarMode != null) __obj.updateDynamic("navigationBarMode")(navigationBarMode.asInstanceOf[js.Any])
    if (navigationBarOrientation != null) __obj.updateDynamic("navigationBarOrientation")(navigationBarOrientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(showBreadcrumb)) __obj.updateDynamic("showBreadcrumb")(showBreadcrumb.asInstanceOf[js.Any])
    if (!js.isUndefined(showDashboard)) __obj.updateDynamic("showDashboard")(showDashboard.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocateMeButton)) __obj.updateDynamic("showLocateMeButton")(showLocateMeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showLogo)) __obj.updateDynamic("showLogo")(showLogo.asInstanceOf[js.Any])
    if (!js.isUndefined(showMapTypeSelector)) __obj.updateDynamic("showMapTypeSelector")(showMapTypeSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(showScalebar)) __obj.updateDynamic("showScalebar")(showScalebar.asInstanceOf[js.Any])
    if (!js.isUndefined(showTermsLink)) __obj.updateDynamic("showTermsLink")(showTermsLink.asInstanceOf[js.Any])
    if (!js.isUndefined(showTrafficButton)) __obj.updateDynamic("showTrafficButton")(showTrafficButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomButtons)) __obj.updateDynamic("showZoomButtons")(showZoomButtons.asInstanceOf[js.Any])
    if (streetsideOptions != null) __obj.updateDynamic("streetsideOptions")(streetsideOptions.asInstanceOf[js.Any])
    if (supportedMapTypes != null) __obj.updateDynamic("supportedMapTypes")(supportedMapTypes.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapLoadOptions]
  }
}

