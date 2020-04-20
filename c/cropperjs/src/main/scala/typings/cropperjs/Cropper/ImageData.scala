package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData extends js.Object {
  var aspectRatio: Double
  var height: Double
  var left: Double
  var naturalHeight: Double
  var naturalWidth: Double
  var rotate: Double
  var scaleX: Double
  var scaleY: Double
  var top: Double
  var width: Double
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
}

