package typings.chrome.chrome.declarativeWebRequest

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
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditResponseCookie]
  }
}

