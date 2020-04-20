package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRequestHeader extends js.Object {
  var name: String
}

object RemoveRequestHeader {
  @scala.inline
  def apply(name: String): RemoveRequestHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestHeader]
  }
}

