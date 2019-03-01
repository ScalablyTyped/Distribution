package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.ExportStringOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ trait ExportJpgStringOptions extends ExportJpgOptions {
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[
    cytoscapeLib.cytoscapeLibStrings.base64uri | cytoscapeLib.cytoscapeLibStrings.base64
  ] = js.undefined
}

object ExportJpgStringOptions {
  @scala.inline
  def apply(
    bg: java.lang.String = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    output: cytoscapeLib.cytoscapeLibStrings.base64uri | cytoscapeLib.cytoscapeLibStrings.base64 = null,
    quality: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): ExportJpgStringOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJpgStringOptions]
  }
}

