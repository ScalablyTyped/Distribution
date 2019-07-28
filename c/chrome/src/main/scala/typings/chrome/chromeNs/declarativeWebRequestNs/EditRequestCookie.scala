package typings.chrome.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRequestCookie extends js.Object {
  var filter: RequestCookie
  var modification: RequestCookie
}

object EditRequestCookie {
  @scala.inline
  def apply(filter: RequestCookie, modification: RequestCookie): EditRequestCookie = {
    val __obj = js.Dynamic.literal(filter = filter, modification = modification)
  
    __obj.asInstanceOf[EditRequestCookie]
  }
}

