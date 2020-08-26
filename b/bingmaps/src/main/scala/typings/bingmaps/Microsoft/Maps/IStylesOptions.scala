package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStylesOptions extends js.Object {
  /** Sets the options for all polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  /** Sets the options for all polylines. */
  var polylineOptions: js.UndefOr[IPolylineOptions] = js.native
  /** Sets the options for all pushpins. */
  var pushpinOptions: js.UndefOr[IPushpinOptions] = js.native
}

object IStylesOptions {
  @scala.inline
  def apply(): IStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStylesOptions]
  }
  @scala.inline
  implicit class IStylesOptionsOps[Self <: IStylesOptions] (val x: Self) extends AnyVal {
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
    def setPolygonOptions(value: IPolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    @scala.inline
    def setPolylineOptions(value: IPolylineOptions): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    @scala.inline
    def setPushpinOptions(value: IPushpinOptions): Self = this.set("pushpinOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushpinOptions: Self = this.set("pushpinOptions", js.undefined)
  }
  
}

