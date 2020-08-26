package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimatedTileLayerOptions extends js.Object {
  /** A boolean that specifies whether the animation should auto-start when it is added to the map or not. Default: true **/
  var autoPlay: js.UndefOr[Boolean] = js.native
  /** The number of miliseconds between two layer frames. Default: 1000 **/
  var frameRate: js.UndefOr[Double] = js.native
  /** A custom loading screen to show on the map when the map tiles are being fetched. **/
  var loadingScreen: js.UndefOr[CustomOverlay] = js.native
  /** The max amount of total loading time of all tiles in a viewport in milliseconds. Default: 15000 **/
  var maxTotalLoadTime: js.UndefOr[Double] = js.native
  /** The array of tile layer sources to animate through. **/
  var mercator: js.Array[TileSource] = js.native
  /** A boolean specifying if the animated tile layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.native
}

object IAnimatedTileLayerOptions {
  @scala.inline
  def apply(mercator: js.Array[TileSource]): IAnimatedTileLayerOptions = {
    val __obj = js.Dynamic.literal(mercator = mercator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedTileLayerOptions]
  }
  @scala.inline
  implicit class IAnimatedTileLayerOptionsOps[Self <: IAnimatedTileLayerOptions] (val x: Self) extends AnyVal {
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
    def setMercatorVarargs(value: TileSource*): Self = this.set("mercator", js.Array(value :_*))
    @scala.inline
    def setMercator(value: js.Array[TileSource]): Self = this.set("mercator", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setLoadingScreen(value: CustomOverlay): Self = this.set("loadingScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingScreen: Self = this.set("loadingScreen", js.undefined)
    @scala.inline
    def setMaxTotalLoadTime(value: Double): Self = this.set("maxTotalLoadTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTotalLoadTime: Self = this.set("maxTotalLoadTime", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

