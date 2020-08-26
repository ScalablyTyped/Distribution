package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomOverlayOptions extends js.Object {
  /**
    * Specifies if the custom overlay should be rendered above or below the label layer of the map. When above,
    * elements in the overlay can be clickable. Default: True
    *
    * This can only be set when creating the overlay.
    */
  var beneathLabels: js.UndefOr[Boolean] = js.native
}

object ICustomOverlayOptions {
  @scala.inline
  def apply(): ICustomOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomOverlayOptions]
  }
  @scala.inline
  implicit class ICustomOverlayOptionsOps[Self <: ICustomOverlayOptions] (val x: Self) extends AnyVal {
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
    def setBeneathLabels(value: Boolean): Self = this.set("beneathLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeneathLabels: Self = this.set("beneathLabels", js.undefined)
  }
  
}

