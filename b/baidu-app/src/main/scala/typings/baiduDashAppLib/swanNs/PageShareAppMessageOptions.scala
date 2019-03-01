package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region Page
trait PageShareAppMessageOptions extends js.Object {
  /** 转发事件来源。button：页面内转发按钮；menu：右上角转发菜单 */
  var from: baiduDashAppLib.baiduDashAppLibStrings.button | baiduDashAppLib.baiduDashAppLibStrings.menu
  /** 如果 from 值是 button，则 target 是触发这次转发事件的 button，否则为 undefined */
  var target: js.UndefOr[js.Object]
}

object PageShareAppMessageOptions {
  @scala.inline
  def apply(
    from: baiduDashAppLib.baiduDashAppLibStrings.button | baiduDashAppLib.baiduDashAppLibStrings.menu,
    target: js.Object = null
  ): PageShareAppMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PageShareAppMessageOptions]
  }
}

