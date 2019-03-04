package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditResponseCookie extends js.Object {
  var filter: ResponseCookie
  var modification: ResponseCookie
}

object EditResponseCookie {
  @scala.inline
  def apply(filter: ResponseCookie, modification: ResponseCookie): EditResponseCookie = {
    val __obj = js.Dynamic.literal(filter = filter, modification = modification)
  
    __obj.asInstanceOf[EditResponseCookie]
  }
}

