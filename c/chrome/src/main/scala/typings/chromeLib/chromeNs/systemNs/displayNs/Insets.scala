package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insets extends js.Object {
  /** The y-axis distance from the bottom bound. */
  var bottom: scala.Double
  /** The x-axis distance from the left bound. */
  var left: scala.Double
  /** The x-axis distance from the right bound. */
  var right: scala.Double
  /** The y-axis distance from the top bound. */
  var top: scala.Double
}

object Insets {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): Insets = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Insets]
  }
}

