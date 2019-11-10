package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasData extends js.Object {
  var height: Double
  var left: Double
  var naturalHeight: Double
  var naturalWidth: Double
  var top: Double
  var width: Double
}

object CanvasData {
  @scala.inline
  def apply(
    height: Double,
    left: Double,
    naturalHeight: Double,
    naturalWidth: Double,
    top: Double,
    width: Double
  ): CanvasData = {
    val __obj = js.Dynamic.literal(height = height, left = left, naturalHeight = naturalHeight, naturalWidth = naturalWidth, top = top, width = width)
  
    __obj.asInstanceOf[CanvasData]
  }
}

