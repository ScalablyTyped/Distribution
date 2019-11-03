package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersHeaderName extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var skiptoken: js.UndefOr[String] = js.undefined
}

object Anon_CustomHeadersHeaderName {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, skiptoken: String = null): Anon_CustomHeadersHeaderName = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (skiptoken != null) __obj.updateDynamic("skiptoken")(skiptoken)
    __obj.asInstanceOf[Anon_CustomHeadersHeaderName]
  }
}

