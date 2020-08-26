package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolygonOptions extends IPolylineOptions {
  /** CSS string or Color object as the polygon's filling color. */
  var fillColor: js.UndefOr[String | Color] = js.native
}

object IPolygonOptions {
  @scala.inline
  def apply(): IPolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolygonOptions]
  }
  @scala.inline
  implicit class IPolygonOptionsOps[Self <: IPolygonOptions] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String | Color): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
  }
  
}

