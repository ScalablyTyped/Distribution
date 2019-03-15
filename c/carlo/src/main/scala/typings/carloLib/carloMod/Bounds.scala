package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /**
    * Height in pixels.
    */
  var height: scala.Double
  /**
    * Left offset in pixels.
    */
  var left: scala.Double
  /**
    * Top offset in pixels.
    */
  var top: scala.Double
  /**
    * Width in pixels.
    */
  var width: scala.Double
}

object Bounds {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Bounds]
  }
}

