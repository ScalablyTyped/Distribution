package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var page: js.UndefOr[String] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    page: String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    scripts: js.Array[String] = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

