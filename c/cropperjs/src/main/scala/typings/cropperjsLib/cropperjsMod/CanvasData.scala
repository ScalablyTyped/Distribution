package typings
package cropperjsLib.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasData extends js.Object {
  /**
    * new height of the canvas
    */
  var height: scala.Double
  /**
    * offset left of the canvas
    */
  var left: scala.Double
  /**
    * new offset top of the canvas
    */
  var top: scala.Double
  /**
    * new width of the canvas
    */
  var width: scala.Double
}

object CanvasData {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): CanvasData = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[CanvasData]
  }
}

