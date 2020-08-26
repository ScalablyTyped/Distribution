package typings.bizcharts.mod.Guide

import typings.antvG2.mod.Styles.line
import typings.bizcharts.anon.AutoRotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineProps extends js.Object {
  var end: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  var lineStyle: js.UndefOr[line] = js.native
  var start: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  var text: js.UndefOr[AutoRotate] = js.native
  var top: js.UndefOr[Boolean] = js.native
}

object LineProps {
  @scala.inline
  def apply(): LineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineProps]
  }
  @scala.inline
  implicit class LinePropsOps[Self <: LineProps] (val x: Self) extends AnyVal {
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
    def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = this.set("end", js.Any.fromFunction2(value))
    @scala.inline
    def setEndVarargs(value: js.Any*): Self = this.set("end", js.Array(value :_*))
    @scala.inline
    def setEnd(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setLineStyle(value: line): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def setStartVarargs(value: js.Any*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setText(value: AutoRotate): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

