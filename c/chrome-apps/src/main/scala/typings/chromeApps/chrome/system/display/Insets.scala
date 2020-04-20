package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insets extends js.Object {
  /** The y-axis distance from the bottom bound. */
  var bottom: integer
  /** The x-axis distance from the left bound. */
  var left: integer
  /** The x-axis distance from the right bound. */
  var right: integer
  /** The y-axis distance from the top bound. */
  var top: integer
}

object Insets {
  @scala.inline
  def apply(bottom: integer, left: integer, right: integer, top: integer): Insets = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insets]
  }
}

