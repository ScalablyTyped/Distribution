package typings
package containerDashQueryDashToolkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxHeight extends js.Object {
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxHeight {
  @scala.inline
  def apply(
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null
  ): Anon_MaxHeight = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxHeight]
  }
}

