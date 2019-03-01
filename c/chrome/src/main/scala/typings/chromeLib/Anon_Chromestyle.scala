package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chromestyle extends js.Object {
  var chrome_style: js.UndefOr[scala.Boolean] = js.undefined
  var open_in_tab: js.UndefOr[scala.Boolean] = js.undefined
  var page: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Chromestyle {
  @scala.inline
  def apply(
    chrome_style: js.UndefOr[scala.Boolean] = js.undefined,
    open_in_tab: js.UndefOr[scala.Boolean] = js.undefined,
    page: java.lang.String = null
  ): Anon_Chromestyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chrome_style)) __obj.updateDynamic("chrome_style")(chrome_style)
    if (!js.isUndefined(open_in_tab)) __obj.updateDynamic("open_in_tab")(open_in_tab)
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[Anon_Chromestyle]
  }
}

