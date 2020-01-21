package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChromestyle extends js.Object {
  var chrome_style: js.UndefOr[Boolean] = js.undefined
  var open_in_tab: js.UndefOr[Boolean] = js.undefined
  var page: js.UndefOr[String] = js.undefined
}

object AnonChromestyle {
  @scala.inline
  def apply(
    chrome_style: js.UndefOr[Boolean] = js.undefined,
    open_in_tab: js.UndefOr[Boolean] = js.undefined,
    page: String = null
  ): AnonChromestyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chrome_style)) __obj.updateDynamic("chrome_style")(chrome_style.asInstanceOf[js.Any])
    if (!js.isUndefined(open_in_tab)) __obj.updateDynamic("open_in_tab")(open_in_tab.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChromestyle]
  }
}

