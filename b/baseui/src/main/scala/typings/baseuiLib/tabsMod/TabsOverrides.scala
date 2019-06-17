package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsOverrides[T] extends js.Object {
  var Root: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var TabBar: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var TabContent: js.UndefOr[baseuiLib.Override[T]] = js.undefined
}

object TabsOverrides {
  @scala.inline
  def apply[T](
    Root: baseuiLib.Override[T] = null,
    TabBar: baseuiLib.Override[T] = null,
    TabContent: baseuiLib.Override[T] = null
  ): TabsOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (TabBar != null) __obj.updateDynamic("TabBar")(TabBar.asInstanceOf[js.Any])
    if (TabContent != null) __obj.updateDynamic("TabContent")(TabContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsOverrides[T]]
  }
}

