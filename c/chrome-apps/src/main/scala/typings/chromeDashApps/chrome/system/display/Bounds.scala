package typings.chromeDashApps.chrome.system.display

import typings.chromeDashApps.chrome.integer
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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds]
  }
}

