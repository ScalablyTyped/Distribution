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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasData]
  }
}

