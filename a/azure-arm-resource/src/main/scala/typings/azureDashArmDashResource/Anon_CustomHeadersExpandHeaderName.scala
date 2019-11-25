package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersExpandHeaderName extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Anon_CustomHeadersExpandHeaderName {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, expand: String = null, top: Int | Double = null): Anon_CustomHeadersExpandHeaderName = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomHeadersExpandHeaderName]
  }
}

