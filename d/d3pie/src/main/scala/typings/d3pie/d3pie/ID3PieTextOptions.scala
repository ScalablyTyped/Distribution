package typings.d3pie.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieTextOptions extends ID3PieStyleOptions {
  var text: js.UndefOr[String] = js.undefined
}

object ID3PieTextOptions {
  @scala.inline
  def apply(color: String = null, font: String = null, fontSize: Int | Double = null, text: String = null): ID3PieTextOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieTextOptions]
  }
}

