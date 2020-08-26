package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCroppedCanvasOptions extends js.Object {
  var fillColor: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
  var imageSmoothingQuality: js.UndefOr[ImageSmoothingQuality] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GetCroppedCanvasOptions {
  @scala.inline
  def apply(): GetCroppedCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCroppedCanvasOptions]
  }
  @scala.inline
  implicit class GetCroppedCanvasOptionsOps[Self <: GetCroppedCanvasOptions] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImageSmoothingEnabled(value: Boolean): Self = this.set("imageSmoothingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSmoothingEnabled: Self = this.set("imageSmoothingEnabled", js.undefined)
    @scala.inline
    def setImageSmoothingQuality(value: ImageSmoothingQuality): Self = this.set("imageSmoothingQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSmoothingQuality: Self = this.set("imageSmoothingQuality", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

