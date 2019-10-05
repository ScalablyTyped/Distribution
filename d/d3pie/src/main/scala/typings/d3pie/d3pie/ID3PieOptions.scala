package typings.d3pie.d3pie

import typings.d3pie.Anon_CanvasHeight
import typings.d3pie.Anon_CanvasPadding
import typings.d3pie.Anon_Caption
import typings.d3pie.Anon_Content
import typings.d3pie.Anon_Context
import typings.d3pie.Anon_HighlightLuminosity
import typings.d3pie.Anon_Left
import typings.d3pie.Anon_Location
import typings.d3pie.Anon_OnClickSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieOptions extends js.Object {
  var callbacks: js.UndefOr[Anon_OnClickSegment] = js.undefined
  var data: Anon_Content
  var effects: js.UndefOr[Anon_HighlightLuminosity] = js.undefined
  var footer: js.UndefOr[Anon_Left with ID3PieTextOptions] = js.undefined
  var header: js.UndefOr[Anon_Location] = js.undefined
  var labels: js.UndefOr[Anon_Context] = js.undefined
  var misc: js.UndefOr[Anon_CanvasPadding] = js.undefined
  var size: js.UndefOr[Anon_CanvasHeight] = js.undefined
  var tooltips: js.UndefOr[Anon_Caption] = js.undefined
}

object ID3PieOptions {
  @scala.inline
  def apply(
    data: Anon_Content,
    callbacks: Anon_OnClickSegment = null,
    effects: Anon_HighlightLuminosity = null,
    footer: Anon_Left with ID3PieTextOptions = null,
    header: Anon_Location = null,
    labels: Anon_Context = null,
    misc: Anon_CanvasPadding = null,
    size: Anon_CanvasHeight = null,
    tooltips: Anon_Caption = null
  ): ID3PieOptions = {
    val __obj = js.Dynamic.literal(data = data)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (misc != null) __obj.updateDynamic("misc")(misc)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    __obj.asInstanceOf[ID3PieOptions]
  }
}

