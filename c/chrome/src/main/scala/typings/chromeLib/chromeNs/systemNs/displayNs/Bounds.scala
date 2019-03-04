package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /** The height of the display in pixels. */
  var height: scala.Double
  /**  The x-coordinate of the upper-left corner. */
  var left: scala.Double
  /**  The y-coordinate of the upper-left corner. */
  var top: scala.Double
  /** The width of the display in pixels. */
  var width: scala.Double
}

object Bounds {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Bounds]
  }
}

