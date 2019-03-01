package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Toggled extends js.Object {
  var toggled: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Toggled {
  @scala.inline
  def apply(toggled: js.UndefOr[scala.Boolean] = js.undefined, tooltip: java.lang.String = null): Anon_Toggled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Anon_Toggled]
  }
}

