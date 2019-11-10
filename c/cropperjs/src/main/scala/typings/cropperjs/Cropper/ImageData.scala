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
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio, height = height, left = left, naturalHeight = naturalHeight, naturalWidth = naturalWidth, rotate = rotate, scaleX = scaleX, scaleY = scaleY, top = top, width = width)
  
    __obj.asInstanceOf[ImageData]
  }
}

