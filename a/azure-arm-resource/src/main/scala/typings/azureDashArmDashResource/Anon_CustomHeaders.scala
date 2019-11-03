package typings.azureDashArmDashResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeaders extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Anon_CustomHeaders {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null): Anon_CustomHeaders = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.asInstanceOf[Anon_CustomHeaders]
  }
}

