package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRequestHeader extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object SetRequestHeader {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): SetRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SetRequestHeader]
  }
}

