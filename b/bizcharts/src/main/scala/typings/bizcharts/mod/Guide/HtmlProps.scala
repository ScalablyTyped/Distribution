package typings.bizcharts.mod.Guide

import typings.bizcharts.mod.AlignXType
import typings.bizcharts.mod.AlignYType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlProps extends js.Object {
  var alignX: js.UndefOr[AlignXType] = js.native
  var alignY: js.UndefOr[AlignYType] = js.native
  var html: js.UndefOr[String] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var position: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object HtmlProps {
  @scala.inline
  def apply(): HtmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlProps]
  }
  @scala.inline
  implicit class HtmlPropsOps[Self <: HtmlProps] (val x: Self) extends AnyVal {
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
    def setAlignX(value: AlignXType): Self = this.set("alignX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignX: Self = this.set("alignX", js.undefined)
    @scala.inline
    def setAlignY(value: AlignYType): Self = this.set("alignY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignY: Self = this.set("alignY", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = this.set("position", js.Any.fromFunction2(value))
    @scala.inline
    def setPositionVarargs(value: js.Any*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

