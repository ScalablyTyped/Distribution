package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlLayerOptions extends IGeoXmlReadOptions {
  /** A boolean indicating if the map should automatically upate the view when a data set is loaded. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.undefined
  /** Options used to customize how the default infobox renders. */
  var infoboxOptions: js.UndefOr[IInfoboxOptions] = js.undefined
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.undefined
  /** A boolean indicating if infoboxes should automatically appear when shapes clicked. Default: false */
  var suppressInfoboxes: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating if the layer is visible or not. Default: true */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IGeoXmlLayerOptions {
  @scala.inline
  def apply(
    allowKmlScreenOverlays: js.UndefOr[Boolean] = js.undefined,
    autoUpdateMapView: js.UndefOr[Boolean] = js.undefined,
    captureGpxPathWaypoints: js.UndefOr[Boolean] = js.undefined,
    defaultStyles: IStylesOptions = null,
    error: /* msg */ String => Unit = null,
    ignoreVisibility: js.UndefOr[Boolean] = js.undefined,
    infoboxOptions: IInfoboxOptions = null,
    layerName: String = null,
    maxNetworkLinkDepth: js.UndefOr[Double] = js.undefined,
    maxNetworkLinks: js.UndefOr[Double] = js.undefined,
    setPushpinTitles: js.UndefOr[Boolean] = js.undefined,
    suppressInfoboxes: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IGeoXmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKmlScreenOverlays)) __obj.updateDynamic("allowKmlScreenOverlays")(allowKmlScreenOverlays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateMapView)) __obj.updateDynamic("autoUpdateMapView")(autoUpdateMapView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureGpxPathWaypoints)) __obj.updateDynamic("captureGpxPathWaypoints")(captureGpxPathWaypoints.get.asInstanceOf[js.Any])
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (!js.isUndefined(ignoreVisibility)) __obj.updateDynamic("ignoreVisibility")(ignoreVisibility.get.asInstanceOf[js.Any])
    if (infoboxOptions != null) __obj.updateDynamic("infoboxOptions")(infoboxOptions.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNetworkLinkDepth)) __obj.updateDynamic("maxNetworkLinkDepth")(maxNetworkLinkDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNetworkLinks)) __obj.updateDynamic("maxNetworkLinks")(maxNetworkLinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setPushpinTitles)) __obj.updateDynamic("setPushpinTitles")(setPushpinTitles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoboxes)) __obj.updateDynamic("suppressInfoboxes")(suppressInfoboxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoXmlLayerOptions]
  }
}

