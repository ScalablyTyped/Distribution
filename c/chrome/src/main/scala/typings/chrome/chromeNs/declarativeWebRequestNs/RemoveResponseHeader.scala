package typings.chrome.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResponseHeader extends js.Object {
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object RemoveResponseHeader {
  @scala.inline
  def apply(name: String, value: String = null): RemoveResponseHeader = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RemoveResponseHeader]
  }
}

