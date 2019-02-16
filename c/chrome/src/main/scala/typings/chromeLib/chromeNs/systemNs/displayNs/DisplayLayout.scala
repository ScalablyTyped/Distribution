package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: java.lang.String
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: scala.Double
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: java.lang.String
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum
    */
  var position: chromeLib.chromeLibStrings.top | chromeLib.chromeLibStrings.right | chromeLib.chromeLibStrings.bottom | chromeLib.chromeLibStrings.left
}

