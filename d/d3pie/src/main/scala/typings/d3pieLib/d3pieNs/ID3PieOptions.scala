package typings
package d3pieLib.d3pieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieOptions extends js.Object {
  var callbacks: js.UndefOr[d3pieLib.Anon_OnClickSegment] = js.undefined
  var data: d3pieLib.Anon_Content
  var effects: js.UndefOr[d3pieLib.Anon_HighlightLuminosity] = js.undefined
  var footer: js.UndefOr[d3pieLib.Anon_Left with ID3PieTextOptions] = js.undefined
  var header: js.UndefOr[d3pieLib.Anon_Location] = js.undefined
  var labels: js.UndefOr[d3pieLib.Anon_Context] = js.undefined
  var misc: js.UndefOr[d3pieLib.Anon_CanvasPadding] = js.undefined
  var size: js.UndefOr[d3pieLib.Anon_CanvasHeight] = js.undefined
  var tooltips: js.UndefOr[d3pieLib.Anon_Caption] = js.undefined
}

object ID3PieOptions {
  @scala.inline
  def apply(
    data: d3pieLib.Anon_Content,
    callbacks: d3pieLib.Anon_OnClickSegment = null,
    effects: d3pieLib.Anon_HighlightLuminosity = null,
    footer: d3pieLib.Anon_Left with ID3PieTextOptions = null,
    header: d3pieLib.Anon_Location = null,
    labels: d3pieLib.Anon_Context = null,
    misc: d3pieLib.Anon_CanvasPadding = null,
    size: d3pieLib.Anon_CanvasHeight = null,
    tooltips: d3pieLib.Anon_Caption = null
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

