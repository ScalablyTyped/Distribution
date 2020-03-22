package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  decimalPlaces ? :number} & d3pie.d3pie.ID3PieStyleOptions */
trait decimalPlacesnumberID3Pie extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
}

object decimalPlacesnumberID3Pie {
  @scala.inline
  def apply(
    color: String = null,
    decimalPlaces: Int | Double = null,
    font: String = null,
    fontSize: Int | Double = null
  ): decimalPlacesnumberID3Pie = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[decimalPlacesnumberID3Pie]
  }
}

