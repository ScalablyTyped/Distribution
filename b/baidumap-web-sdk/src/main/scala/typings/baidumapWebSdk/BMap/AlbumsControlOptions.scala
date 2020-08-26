package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumsControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.native
  var imageHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var offset: js.UndefOr[Size] = js.native
}

object AlbumsControlOptions {
  @scala.inline
  def apply(): AlbumsControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumsControlOptions]
  }
  @scala.inline
  implicit class AlbumsControlOptionsOps[Self <: AlbumsControlOptions] (val x: Self) extends AnyVal {
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
    def setAnchor(value: ControlAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageHeight: Self = this.set("imageHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

