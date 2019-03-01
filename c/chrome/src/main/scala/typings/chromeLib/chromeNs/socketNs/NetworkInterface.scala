package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  var address: java.lang.String
  var name: java.lang.String
}

object NetworkInterface {
  @scala.inline
  def apply(address: java.lang.String, name: java.lang.String): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NetworkInterface]
  }
}

