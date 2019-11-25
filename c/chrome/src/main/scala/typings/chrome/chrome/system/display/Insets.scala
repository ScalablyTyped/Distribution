package typings.chrome.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insets extends js.Object {
  /** The y-axis distance from the bottom bound. */
  var bottom: Double
  /** The x-axis distance from the left bound. */
  var left: Double
  /** The x-axis distance from the right bound. */
  var right: Double
  /** The y-axis distance from the top bound. */
  var top: Double
}

object Insets {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Insets = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Insets]
  }
}

