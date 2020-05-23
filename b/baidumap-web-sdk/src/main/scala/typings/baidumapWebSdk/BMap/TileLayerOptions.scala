package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerOptions extends js.Object {
  var copyright: js.UndefOr[Copyright] = js.undefined
  var tileUrlTemplate: js.UndefOr[String] = js.undefined
  var transparentPng: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object TileLayerOptions {
  @scala.inline
  def apply(
    copyright: Copyright = null,
    tileUrlTemplate: String = null,
    transparentPng: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (tileUrlTemplate != null) __obj.updateDynamic("tileUrlTemplate")(tileUrlTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(transparentPng)) __obj.updateDynamic("transparentPng")(transparentPng.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerOptions]
  }
}

