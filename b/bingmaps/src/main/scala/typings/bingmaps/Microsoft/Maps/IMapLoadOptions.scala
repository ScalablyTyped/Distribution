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
    heading: js.UndefOr[Double] = js.undefined,
    labelOverlay: LabelOverlay = null,
    liteMode: js.UndefOr[Boolean] = js.undefined,
    mapTypeId: MapTypeId = null,
    maxBounds: LocationRect = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    navigationBarMode: NavigationBarMode = null,
    navigationBarOrientation: NavigationBarOrientation = null,
    padding: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined,
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
    zoom: js.UndefOr[Double] = js.undefined
  ): IMapLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHidingLabelsOfRoad)) __obj.updateDynamic("allowHidingLabelsOfRoad")(allowHidingLabelsOfRoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInfoboxOverflow)) __obj.updateDynamic("allowInfoboxOverflow")(allowInfoboxOverflow.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (centerOffset != null) __obj.updateDynamic("centerOffset")(centerOffset.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBirdseye)) __obj.updateDynamic("disableBirdseye")(disableBirdseye.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardInput)) __obj.updateDynamic("disableKeyboardInput")(disableKeyboardInput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMapTypeSelectorMouseOver)) __obj.updateDynamic("disableMapTypeSelectorMouseOver")(disableMapTypeSelectorMouseOver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollWheelZoom)) __obj.updateDynamic("disableScrollWheelZoom")(disableScrollWheelZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStreetside)) __obj.updateDynamic("disableStreetside")(disableStreetside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStreetsideAutoCoverage)) __obj.updateDynamic("disableStreetsideAutoCoverage")(disableStreetsideAutoCoverage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableZooming)) __obj.updateDynamic("disableZooming")(disableZooming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCORS)) __obj.updateDynamic("enableCORS")(enableCORS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClickableLogo)) __obj.updateDynamic("enableClickableLogo")(enableClickableLogo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighDpi)) __obj.updateDynamic("enableHighDpi")(enableHighDpi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInertia)) __obj.updateDynamic("enableInertia")(enableInertia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (labelOverlay != null) __obj.updateDynamic("labelOverlay")(labelOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode.get.asInstanceOf[js.Any])
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (navigationBarMode != null) __obj.updateDynamic("navigationBarMode")(navigationBarMode.asInstanceOf[js.Any])
    if (navigationBarOrientation != null) __obj.updateDynamic("navigationBarOrientation")(navigationBarOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBreadcrumb)) __obj.updateDynamic("showBreadcrumb")(showBreadcrumb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDashboard)) __obj.updateDynamic("showDashboard")(showDashboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocateMeButton)) __obj.updateDynamic("showLocateMeButton")(showLocateMeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLogo)) __obj.updateDynamic("showLogo")(showLogo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMapTypeSelector)) __obj.updateDynamic("showMapTypeSelector")(showMapTypeSelector.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showScalebar)) __obj.updateDynamic("showScalebar")(showScalebar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTermsLink)) __obj.updateDynamic("showTermsLink")(showTermsLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTrafficButton)) __obj.updateDynamic("showTrafficButton")(showTrafficButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomButtons)) __obj.updateDynamic("showZoomButtons")(showZoomButtons.get.asInstanceOf[js.Any])
    if (streetsideOptions != null) __obj.updateDynamic("streetsideOptions")(streetsideOptions.asInstanceOf[js.Any])
    if (supportedMapTypes != null) __obj.updateDynamic("supportedMapTypes")(supportedMapTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapLoadOptions]
  }
}

