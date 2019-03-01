package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportBlobOptions extends ExportOptions {
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[cytoscapeLib.cytoscapeLibStrings.blob] = js.undefined
}

object ExportBlobOptions {
  @scala.inline
  def apply(
    bg: java.lang.String = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    output: cytoscapeLib.cytoscapeLibStrings.blob = null,
    scale: scala.Int | scala.Double = null
  ): ExportBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBlobOptions]
  }
}

