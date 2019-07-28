package typings.cropperjs.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * the height of the cropped area
    */
  var height: Double
  /**
    * the rotated degrees of the image
    */
  var rotate: Double
  /**
    * the scaling factor to apply on the abscissa of the image
    */
  var scaleX: Double
  /**
    * the scaling factor to apply on the ordinate of the image
    */
  var scaleY: Double
  /**
    * the width of the cropped area
    */
  var width: Double
  /**
    * the offset left of the cropped area
    */
  var x: Double
  /**
    * the offset top of the cropped area
    */
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
    val __obj = js.Dynamic.literal(height = height, rotate = rotate, scaleX = scaleX, scaleY = scaleY, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Data]
  }
}

