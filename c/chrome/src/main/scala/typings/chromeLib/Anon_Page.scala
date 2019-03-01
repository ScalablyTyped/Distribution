package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: js.UndefOr[java.lang.String] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var scripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Page {
  @scala.inline
  def apply(
    page: java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    scripts: js.Array[java.lang.String] = null
  ): Anon_Page = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[Anon_Page]
  }
}

