package typings.chrome.chrome.declarativeWebRequest

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResponseHeader]
  }
}

