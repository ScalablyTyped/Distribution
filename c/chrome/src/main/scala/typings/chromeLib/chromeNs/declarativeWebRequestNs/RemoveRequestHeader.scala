package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRequestHeader extends js.Object {
  var name: java.lang.String
}

object RemoveRequestHeader {
  @scala.inline
  def apply(name: java.lang.String): RemoveRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RemoveRequestHeader]
  }
}

