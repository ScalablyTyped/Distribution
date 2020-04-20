package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRequestHeader extends js.Object {
  var name: String
  var value: String
}

object SetRequestHeader {
  @scala.inline
  def apply(name: String, value: String): SetRequestHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestHeader]
  }
}

