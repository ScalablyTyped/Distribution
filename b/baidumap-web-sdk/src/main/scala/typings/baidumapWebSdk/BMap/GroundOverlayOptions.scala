package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundOverlayOptions extends js.Object {
  var displayOnMaxLevel: js.UndefOr[Double] = js.native
  var displayOnMinLevel: js.UndefOr[Double] = js.native
  var imageURL: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object GroundOverlayOptions {
  @scala.inline
  def apply(): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundOverlayOptions]
  }
  @scala.inline
  implicit class GroundOverlayOptionsOps[Self <: GroundOverlayOptions] (val x: Self) extends AnyVal {
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
    def setDisplayOnMaxLevel(value: Double): Self = this.set("displayOnMaxLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayOnMaxLevel: Self = this.set("displayOnMaxLevel", js.undefined)
    @scala.inline
    def setDisplayOnMinLevel(value: Double): Self = this.set("displayOnMinLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayOnMinLevel: Self = this.set("displayOnMinLevel", js.undefined)
    @scala.inline
    def setImageURL(value: String): Self = this.set("imageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageURL: Self = this.set("imageURL", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

