package typings
package d3pieLib.d3pieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieStyleOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
}

object ID3PieStyleOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null
  ): ID3PieStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieStyleOptions]
  }
}

