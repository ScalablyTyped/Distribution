package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResponseHeader extends js.Object {
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RemoveResponseHeader {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String = null): RemoveResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RemoveResponseHeader]
  }
}

