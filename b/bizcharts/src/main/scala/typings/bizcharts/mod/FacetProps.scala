package typings.bizcharts.mod

import typings.bizcharts.anon.OffsetX
import typings.bizcharts.anon.OffsetY
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetProps
  extends Props[js.Any] {
  var autoSetAxis: js.UndefOr[Boolean] = js.native
  var colTitle: js.UndefOr[OffsetY] = js.native
  var eachView: js.UndefOr[
    js.Function2[/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any], Unit]
  ] = js.native
  var fields: js.UndefOr[String | js.Array[_]] = js.native
  var margin: js.UndefOr[Double | js.Array[Double]] = js.native
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  var rowTitle: js.UndefOr[OffsetX] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[FacetType] = js.native
}

object FacetProps {
  @scala.inline
  def apply(): FacetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetProps]
  }
  @scala.inline
  implicit class FacetPropsOps[Self <: FacetProps] (val x: Self) extends AnyVal {
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
    def setAutoSetAxis(value: Boolean): Self = this.set("autoSetAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSetAxis: Self = this.set("autoSetAxis", js.undefined)
    @scala.inline
    def setColTitle(value: OffsetY): Self = this.set("colTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColTitle: Self = this.set("colTitle", js.undefined)
    @scala.inline
    def setEachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): Self = this.set("eachView", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEachView: Self = this.set("eachView", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: js.Any*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: String | js.Array[_]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: Double | js.Array[Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRowTitle(value: OffsetX): Self = this.set("rowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowTitle: Self = this.set("rowTitle", js.undefined)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setType(value: FacetType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

