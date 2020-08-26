package typings.d3pie.d3pie

import typings.d3pie.anon.CanvasHeight
import typings.d3pie.anon.CanvasPadding
import typings.d3pie.anon.Content
import typings.d3pie.anon.Formatter
import typings.d3pie.anon.HighlightLuminosity
import typings.d3pie.anon.Location
import typings.d3pie.anon.OnClickSegment
import typings.d3pie.anon.PlaceholderParser
import typings.d3pie.anon.locationleftundefinedID3P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ID3PieOptions extends js.Object {
  var callbacks: js.UndefOr[OnClickSegment] = js.native
  var data: Content = js.native
  var effects: js.UndefOr[HighlightLuminosity] = js.native
  var footer: js.UndefOr[locationleftundefinedID3P] = js.native
  var header: js.UndefOr[Location] = js.native
  var labels: js.UndefOr[Formatter] = js.native
  var misc: js.UndefOr[CanvasPadding] = js.native
  var size: js.UndefOr[CanvasHeight] = js.native
  var tooltips: js.UndefOr[PlaceholderParser] = js.native
}

object ID3PieOptions {
  @scala.inline
  def apply(data: Content): ID3PieOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieOptions]
  }
  @scala.inline
  implicit class ID3PieOptionsOps[Self <: ID3PieOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Content): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbacks(value: OnClickSegment): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setEffects(value: HighlightLuminosity): Self = this.set("effects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    @scala.inline
    def setFooter(value: locationleftundefinedID3P): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHeader(value: Location): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setLabels(value: Formatter): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMisc(value: CanvasPadding): Self = this.set("misc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMisc: Self = this.set("misc", js.undefined)
    @scala.inline
    def setSize(value: CanvasHeight): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTooltips(value: PlaceholderParser): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

