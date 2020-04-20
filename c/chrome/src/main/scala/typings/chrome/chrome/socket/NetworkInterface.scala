package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  var address: String
  var name: String
}

object NetworkInterface {
  @scala.inline
  def apply(address: String, name: String): NetworkInterface = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

