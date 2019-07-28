package typings.cropperjs.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasData extends js.Object {
  /**
    * new height of the canvas
    */
  var height: Double
  /**
    * offset left of the canvas
    */
  var left: Double
  /**
    * new offset top of the canvas
    */
  var top: Double
  /**
    * new width of the canvas
    */
  var width: Double
}

object CanvasData {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): CanvasData = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[CanvasData]
  }
}

