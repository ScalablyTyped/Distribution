package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJpgOptions extends ExportOptions {
  /**
    * quality Specifies the quality of the image from 0
    * (low quality, low filesize) to 1 (high quality, high filesize).
    * If not set, the browser's default quality value is used.
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object ExportJpgOptions {
  @scala.inline
  def apply(
    bg: java.lang.String = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): ExportJpgOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJpgOptions]
  }
}

