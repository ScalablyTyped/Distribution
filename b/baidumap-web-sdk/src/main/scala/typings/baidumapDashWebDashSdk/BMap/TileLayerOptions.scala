package typings.baidumapDashWebDashSdk.BMap

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
    zIndex: Int | Double = null
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (tileUrlTemplate != null) __obj.updateDynamic("tileUrlTemplate")(tileUrlTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(transparentPng)) __obj.updateDynamic("transparentPng")(transparentPng.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerOptions]
  }
}

