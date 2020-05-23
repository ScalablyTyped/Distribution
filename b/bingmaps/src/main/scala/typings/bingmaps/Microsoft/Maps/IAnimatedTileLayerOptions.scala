package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimatedTileLayerOptions extends js.Object {
  /** A boolean that specifies whether the animation should auto-start when it is added to the map or not. Default: true **/
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  /** The number of miliseconds between two layer frames. Default: 1000 **/
  var frameRate: js.UndefOr[Double] = js.undefined
  /** A custom loading screen to show on the map when the map tiles are being fetched. **/
  var loadingScreen: js.UndefOr[CustomOverlay] = js.undefined
  /** The max amount of total loading time of all tiles in a viewport in milliseconds. Default: 15000 **/
  var maxTotalLoadTime: js.UndefOr[Double] = js.undefined
  /** The array of tile layer sources to animate through. **/
  var mercator: js.Array[TileSource]
  /** A boolean specifying if the animated tile layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IAnimatedTileLayerOptions {
  @scala.inline
  def apply(
    mercator: js.Array[TileSource],
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    frameRate: js.UndefOr[Double] = js.undefined,
    loadingScreen: CustomOverlay = null,
    maxTotalLoadTime: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IAnimatedTileLayerOptions = {
    val __obj = js.Dynamic.literal(mercator = mercator.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.get.asInstanceOf[js.Any])
    if (loadingScreen != null) __obj.updateDynamic("loadingScreen")(loadingScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTotalLoadTime)) __obj.updateDynamic("maxTotalLoadTime")(maxTotalLoadTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedTileLayerOptions]
  }
}

