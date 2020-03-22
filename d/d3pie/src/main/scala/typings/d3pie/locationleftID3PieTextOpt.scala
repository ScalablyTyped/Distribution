package typings.d3pie

import typings.d3pie.d3pieStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  location ? :'left'} & d3pie.d3pie.ID3PieTextOptions */
trait locationleftID3PieTextOpt extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[left] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object locationleftID3PieTextOpt {
  @scala.inline
  def apply(
    color: String = null,
    font: String = null,
    fontSize: Int | Double = null,
    location: left = null,
    text: String = null
  ): locationleftID3PieTextOpt = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationleftID3PieTextOpt]
  }
}

