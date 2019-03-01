package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerOptions extends js.Object {
  var copyright: js.UndefOr[Copyright] = js.undefined
  var tileUrlTemplate: js.UndefOr[java.lang.String] = js.undefined
  var transparentPng: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object TileLayerOptions {
  @scala.inline
  def apply(
    copyright: Copyright = null,
    tileUrlTemplate: java.lang.String = null,
    transparentPng: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (tileUrlTemplate != null) __obj.updateDynamic("tileUrlTemplate")(tileUrlTemplate)
    if (!js.isUndefined(transparentPng)) __obj.updateDynamic("transparentPng")(transparentPng)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerOptions]
  }
}

