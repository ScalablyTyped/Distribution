package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJpgOptions extends ExportOptions {
  /**
    * quality Specifies the quality of the image from 0
    * (low quality, low filesize) to 1 (high quality, high filesize).
    * If not set, the browser's default quality value is used.
    */
  var quality: js.UndefOr[Double] = js.undefined
}

object ExportJpgOptions {
  @scala.inline
  def apply(
    bg: String = null,
    full: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): ExportJpgOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJpgOptions]
  }
}

