package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insets extends js.Object {
  /** The y-axis distance from the bottom bound. */
  var bottom: chromeDashAppsLib.chromeNs.integer
  /** The x-axis distance from the left bound. */
  var left: chromeDashAppsLib.chromeNs.integer
  /** The x-axis distance from the right bound. */
  var right: chromeDashAppsLib.chromeNs.integer
  /** The y-axis distance from the top bound. */
  var top: chromeDashAppsLib.chromeNs.integer
}

object Insets {
  @scala.inline
  def apply(
    bottom: chromeDashAppsLib.chromeNs.integer,
    left: chromeDashAppsLib.chromeNs.integer,
    right: chromeDashAppsLib.chromeNs.integer,
    top: chromeDashAppsLib.chromeNs.integer
  ): Insets = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Insets]
  }
}

