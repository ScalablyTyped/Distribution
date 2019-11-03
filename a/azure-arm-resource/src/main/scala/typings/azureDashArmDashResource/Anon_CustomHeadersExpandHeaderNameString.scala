package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersExpandHeaderNameString extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
}

object Anon_CustomHeadersExpandHeaderNameString {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, expand: String = null): Anon_CustomHeadersExpandHeaderNameString = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[Anon_CustomHeadersExpandHeaderNameString]
  }
}

