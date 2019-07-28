package typings.chromeDashApps.chromeNs.systemNs.displayNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /** The height of the display in pixels. */
  var height: integer
  /**  The x-coordinate of the upper-left corner. */
  var left: integer
  /**  The y-coordinate of the upper-left corner. */
  var top: integer
  /** The width of the display in pixels. */
  var width: integer
}

object Bounds {
  @scala.inline
  def apply(height: integer, left: integer, top: integer, width: integer): Bounds = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Bounds]
  }
}

