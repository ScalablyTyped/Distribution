package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileLayerOptions extends js.Object {
  /**
    * The number of milliseconds allowed for the tile layer image download. If the timeout occurs before the image is fully
    * downloaded, the map control considers the download a failure. The default value is 10000.
    */
  var downloadTimeout: js.UndefOr[Double] = js.undefined
  /** Allow retrieving data from CORS supported server. */
  var enableCORS: js.UndefOr[Boolean] = js.undefined
  /** The tile source for the tile layer. */
  var mercator: js.UndefOr[TileSource] = js.undefined
  /** The opacity of the tile layer, defined by a number between 0 (not visible) and 1. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies that CORS should be made with the "use-credentials" flag instead of "anonymous". */
  var useCredentialsForCORS: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean indicating whether to show or hide the tile layer. The default value is true. A value of false indicates that
    * the tile layer is hidden, although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The z-index of the tile layer. */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ITileLayerOptions {
  @scala.inline
  def apply(
    downloadTimeout: Int | Double = null,
    enableCORS: js.UndefOr[Boolean] = js.undefined,
    mercator: TileSource = null,
    opacity: Int | Double = null,
    useCredentialsForCORS: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): ITileLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (downloadTimeout != null) __obj.updateDynamic("downloadTimeout")(downloadTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCORS)) __obj.updateDynamic("enableCORS")(enableCORS)
    if (mercator != null) __obj.updateDynamic("mercator")(mercator)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(useCredentialsForCORS)) __obj.updateDynamic("useCredentialsForCORS")(useCredentialsForCORS)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITileLayerOptions]
  }
}

