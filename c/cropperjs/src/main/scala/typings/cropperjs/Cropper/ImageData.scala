package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageData extends js.Object {
  var aspectRatio: Double = js.native
  var height: Double = js.native
  var left: Double = js.native
  var naturalHeight: Double = js.native
  var naturalWidth: Double = js.native
  var rotate: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
}

object ImageData {
  @scala.inline
  def apply(
    aspectRatio: Double,
    height: Double,
    left: Double,
    naturalHeight: Double,
    naturalWidth: Double,
    rotate: Double,
    scaleX: Double,
    scaleY: Double,
    top: Double,
    width: Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  @scala.inline
  implicit class ImageDataOps[Self <: ImageData] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalHeight(value: Double): Self = this.set("naturalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalWidth(value: Double): Self = this.set("naturalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

