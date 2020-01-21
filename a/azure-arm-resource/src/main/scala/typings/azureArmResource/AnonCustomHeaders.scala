package typings.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomHeaders extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AnonCustomHeaders {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null): AnonCustomHeaders = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomHeaders]
  }
}

