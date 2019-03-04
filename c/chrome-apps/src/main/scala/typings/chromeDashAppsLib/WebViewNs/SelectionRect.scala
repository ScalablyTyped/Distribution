package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a rectangle in screen coordinates.
  * The containment semantics are array-like; that is, the coordinate (left, top) is considered to be contained by the rectangle,
  * but the coordinate (left + width, top) is not.
  **/
trait SelectionRect extends js.Object {
  /** Height of the rectangle. */
  var height: chromeDashAppsLib.chromeNs.integer
  /** Distance from the left edge of the screen to the left edge of the rectangle. */
  var left: chromeDashAppsLib.chromeNs.integer
  /** Distance from the top edge of the screen to the top edge of the rectangle. */
  var top: chromeDashAppsLib.chromeNs.integer
  /** Width of the rectangle. */
  var width: chromeDashAppsLib.chromeNs.integer
}

object SelectionRect {
  @scala.inline
  def apply(
    height: chromeDashAppsLib.chromeNs.integer,
    left: chromeDashAppsLib.chromeNs.integer,
    top: chromeDashAppsLib.chromeNs.integer,
    width: chromeDashAppsLib.chromeNs.integer
  ): SelectionRect = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[SelectionRect]
  }
}

