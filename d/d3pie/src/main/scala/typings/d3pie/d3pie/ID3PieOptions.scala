package typings.d3pie.d3pie

import typings.d3pie.anon.CanvasHeight
import typings.d3pie.anon.CanvasPadding
import typings.d3pie.anon.Content
import typings.d3pie.anon.Formatter
import typings.d3pie.anon.HighlightLuminosity
import typings.d3pie.anon.Location
import typings.d3pie.anon.OnClickSegment
import typings.d3pie.anon.PlaceholderParser
import typings.d3pie.anon.locationleftID3PieTextOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieOptions extends js.Object {
  var callbacks: js.UndefOr[OnClickSegment] = js.undefined
  var data: Content
  var effects: js.UndefOr[HighlightLuminosity] = js.undefined
  var footer: js.UndefOr[locationleftID3PieTextOpt] = js.undefined
  var header: js.UndefOr[Location] = js.undefined
  var labels: js.UndefOr[Formatter] = js.undefined
  var misc: js.UndefOr[CanvasPadding] = js.undefined
  var size: js.UndefOr[CanvasHeight] = js.undefined
  var tooltips: js.UndefOr[PlaceholderParser] = js.undefined
}

object ID3PieOptions {
  @scala.inline
  def apply(
    data: Content,
    callbacks: OnClickSegment = null,
    effects: HighlightLuminosity = null,
    footer: locationleftID3PieTextOpt = null,
    header: Location = null,
    labels: Formatter = null,
    misc: CanvasPadding = null,
    size: CanvasHeight = null,
    tooltips: PlaceholderParser = null
  ): ID3PieOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (misc != null) __obj.updateDynamic("misc")(misc.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieOptions]
  }
}

