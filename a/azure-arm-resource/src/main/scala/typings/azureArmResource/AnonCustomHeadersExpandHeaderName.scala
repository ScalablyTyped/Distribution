package typings.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomHeadersExpandHeaderName extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object AnonCustomHeadersExpandHeaderName {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, expand: String = null, top: Int | Double = null): AnonCustomHeadersExpandHeaderName = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomHeadersExpandHeaderName]
  }
}

