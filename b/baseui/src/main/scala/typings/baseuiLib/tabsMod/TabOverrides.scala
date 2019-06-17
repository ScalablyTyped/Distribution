package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabOverrides[T] extends js.Object {
  var Tab: js.UndefOr[baseuiLib.Override[T]] = js.undefined
}

object TabOverrides {
  @scala.inline
  def apply[T](Tab: baseuiLib.Override[T] = null): TabOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (Tab != null) __obj.updateDynamic("Tab")(Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOverrides[T]]
  }
}

