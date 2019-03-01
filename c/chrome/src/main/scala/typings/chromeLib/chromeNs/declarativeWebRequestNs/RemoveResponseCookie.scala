package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResponseCookie extends js.Object {
  var filter: ResponseCookie
}

object RemoveResponseCookie {
  @scala.inline
  def apply(filter: ResponseCookie): RemoveResponseCookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[RemoveResponseCookie]
  }
}

