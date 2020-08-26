package typings.bizcharts.mod.Guide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProps extends js.Object {
  var end: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  var height: js.UndefOr[Double] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var src: js.UndefOr[String] = js.native
  var start: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  var top: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ImageProps {
  @scala.inline
  def apply(): ImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProps]
  }
  @scala.inline
  implicit class ImagePropsOps[Self <: ImageProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
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
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

