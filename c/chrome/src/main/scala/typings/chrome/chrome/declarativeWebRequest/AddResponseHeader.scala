package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResponseHeader extends js.Object {
  var name: String
  var value: String
}

object AddResponseHeader {
  @scala.inline
  def apply(name: String, value: String): AddResponseHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddResponseHeader]
  }
}

