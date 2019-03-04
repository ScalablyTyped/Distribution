package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /** The height of the display in pixels. */
  var height: chromeDashAppsLib.chromeNs.integer
  /**  The x-coordinate of the upper-left corner. */
  var left: chromeDashAppsLib.chromeNs.integer
  /**  The y-coordinate of the upper-left corner. */
  var top: chromeDashAppsLib.chromeNs.integer
  /** The width of the display in pixels. */
  var width: chromeDashAppsLib.chromeNs.integer
}

object Bounds {
  @scala.inline
  def apply(
    height: chromeDashAppsLib.chromeNs.integer,
    left: chromeDashAppsLib.chromeNs.integer,
    top: chromeDashAppsLib.chromeNs.integer,
    width: chromeDashAppsLib.chromeNs.integer
  ): Bounds = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Bounds]
  }
}

