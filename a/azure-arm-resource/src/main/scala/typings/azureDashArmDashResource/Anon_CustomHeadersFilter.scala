package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersFilter extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
}

object Anon_CustomHeadersFilter {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, filter: String = null): Anon_CustomHeadersFilter = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[Anon_CustomHeadersFilter]
  }
}

