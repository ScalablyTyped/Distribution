package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceName extends js.Object {
  var interfaceName: String
  var isDefault: Boolean
}

object InterfaceName {
  @scala.inline
  def apply(interfaceName: String, isDefault: Boolean): InterfaceName = {
    val __obj = js.Dynamic.literal(interfaceName = interfaceName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceName]
  }
}

