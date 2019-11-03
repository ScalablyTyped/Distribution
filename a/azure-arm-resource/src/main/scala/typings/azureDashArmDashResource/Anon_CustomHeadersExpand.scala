package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersExpand extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var recurse: js.UndefOr[Boolean] = js.undefined
}

object Anon_CustomHeadersExpand {
  @scala.inline
  def apply(
    customHeaders: StringDictionary[String] = null,
    expand: String = null,
    recurse: js.UndefOr[Boolean] = js.undefined
  ): Anon_CustomHeadersExpand = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    __obj.asInstanceOf[Anon_CustomHeadersExpand]
  }
}

