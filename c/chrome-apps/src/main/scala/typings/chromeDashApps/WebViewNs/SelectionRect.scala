package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.integer
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
  var height: integer
  /** Distance from the left edge of the screen to the left edge of the rectangle. */
  var left: integer
  /** Distance from the top edge of the screen to the top edge of the rectangle. */
  var top: integer
  /** Width of the rectangle. */
  var width: integer
}

object SelectionRect {
  @scala.inline
  def apply(height: integer, left: integer, top: integer, width: integer): SelectionRect = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[SelectionRect]
  }
}

