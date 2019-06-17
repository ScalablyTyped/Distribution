package typings
package baseuiLib.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var overrides: js.UndefOr[baseuiLib.Anon_EmptyState] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(overrides: baseuiLib.Anon_EmptyState = null): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[MenuProps]
  }
}

