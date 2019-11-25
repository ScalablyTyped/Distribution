package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var height: Double
  var rotate: Double
  var scaleX: Double
  var scaleY: Double
  var width: Double
  var x: Double
  var y: Double
}

object Data {
  @scala.inline
  def apply(
    height: Double,
    rotate: Double,
    scaleX: Double,
    scaleY: Double,
    width: Double,
    x: Double,
    y: Double
  ): Data = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

