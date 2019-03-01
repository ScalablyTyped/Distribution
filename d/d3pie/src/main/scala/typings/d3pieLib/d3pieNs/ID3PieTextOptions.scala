package typings
package d3pieLib.d3pieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieTextOptions extends ID3PieStyleOptions {
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ID3PieTextOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    text: java.lang.String = null
  ): ID3PieTextOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ID3PieTextOptions]
  }
}

