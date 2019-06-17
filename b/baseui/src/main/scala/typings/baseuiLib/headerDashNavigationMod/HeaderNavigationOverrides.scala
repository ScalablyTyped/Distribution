package typings
package baseuiLib.headerDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderNavigationOverrides extends js.Object {
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object HeaderNavigationOverrides {
  @scala.inline
  def apply(Root: baseuiLib.Override[_] = null): HeaderNavigationOverrides = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderNavigationOverrides]
  }
}

