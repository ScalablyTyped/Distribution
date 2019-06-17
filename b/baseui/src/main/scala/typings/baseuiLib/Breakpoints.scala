package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoints extends js.Object {
  var large: js.UndefOr[scala.Double] = js.undefined
  var medium: js.UndefOr[scala.Double] = js.undefined
  var small: js.UndefOr[scala.Double] = js.undefined
}

object Breakpoints {
  @scala.inline
  def apply(
    large: scala.Int | scala.Double = null,
    medium: scala.Int | scala.Double = null,
    small: scala.Int | scala.Double = null
  ): Breakpoints = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
}

