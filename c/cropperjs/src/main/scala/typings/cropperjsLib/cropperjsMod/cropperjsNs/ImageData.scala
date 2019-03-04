package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData extends js.Object {
  /**
    * the aspect ratio of the image
    */
  var aspectRatio: scala.Double
  /**
    * the height of the image
    */
  var height: scala.Double
  /**
    * the offset left of the image
    */
  var left: scala.Double
  /**
    * the natural height of the image
    */
  var naturalHeight: scala.Double
  /**
    * the natural width of the image
    */
  var naturalWidth: scala.Double
  /**
    * the rotated degrees of the image if rotated
    */
  var rotate: scala.Double
  /**
    * the scaling factor to apply on the abscissa of the image if scaled
    */
  var scaleX: scala.Double
  /**
    * the scaling factor to apply on the ordinate of the image if scaled
    */
  var scaleY: scala.Double
  /**
    * the offset top of the image
    */
  var top: scala.Double
  /**
    * the width of the image
    */
  var width: scala.Double
}

object ImageData {
  @scala.inline
  def apply(
    aspectRatio: scala.Double,
    height: scala.Double,
    left: scala.Double,
    naturalHeight: scala.Double,
    naturalWidth: scala.Double,
    rotate: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio, height = height, left = left, naturalHeight = naturalHeight, naturalWidth = naturalWidth, rotate = rotate, scaleX = scaleX, scaleY = scaleY, top = top, width = width)
  
    __obj.asInstanceOf[ImageData]
  }
}

