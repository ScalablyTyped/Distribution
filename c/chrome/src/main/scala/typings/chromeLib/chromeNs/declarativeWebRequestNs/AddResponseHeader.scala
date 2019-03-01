package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResponseHeader extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object AddResponseHeader {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): AddResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AddResponseHeader]
  }
}

