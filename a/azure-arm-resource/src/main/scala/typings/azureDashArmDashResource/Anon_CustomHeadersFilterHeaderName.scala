package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersFilterHeaderName extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Anon_CustomHeadersFilterHeaderName {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, filter: String = null, top: Int | Double = null): Anon_CustomHeadersFilterHeaderName = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomHeadersFilterHeaderName]
  }
}

