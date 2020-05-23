package typings.d3pie.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
}

object ID3PieStyleOptions {
  @scala.inline
  def apply(color: String = null, font: String = null, fontSize: js.UndefOr[Double] = js.undefined): ID3PieStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieStyleOptions]
  }
}

