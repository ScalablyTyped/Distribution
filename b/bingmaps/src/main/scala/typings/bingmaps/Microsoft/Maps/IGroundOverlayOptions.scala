package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroundOverlayOptions extends ICustomOverlayOptions {
  /** A background color that fills the bounding box area beneath the ground overlay. */
  var backgroundColor: js.UndefOr[String | Color] = js.native
  /** The bounding box to anchor the ground overlay to. This is required when creating a ground overlay. */
  var bounds: js.UndefOr[LocationRect] = js.native
  /** The URL to the image to anchor to the map as a ground overlay. This is required when creating a ground overlay. */
  var imageUrl: js.UndefOr[String] = js.native
  /** The opacity of the ground overlay image. */
  var opacity: js.UndefOr[Double] = js.native
  /** An angle in degrees to rotate the overlay in a counter-clockwise direction where 0 = north, 90 = west, 180 = south, 270 = east */
  var rotation: js.UndefOr[Double] = js.native
  /** A boolean value indicating if the ground overlay is visible or not. */
  var visible: js.UndefOr[Boolean] = js.native
}

object IGroundOverlayOptions {
  @scala.inline
  def apply(): IGroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroundOverlayOptions]
  }
  @scala.inline
  implicit class IGroundOverlayOptionsOps[Self <: IGroundOverlayOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String | Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBounds(value: LocationRect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

