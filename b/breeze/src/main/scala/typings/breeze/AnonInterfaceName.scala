package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterfaceName extends js.Object {
  var interfaceName: String
  var isDefault: Boolean
}

object AnonInterfaceName {
  @scala.inline
  def apply(interfaceName: String, isDefault: Boolean): AnonInterfaceName = {
    val __obj = js.Dynamic.literal(interfaceName = interfaceName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInterfaceName]
  }
}

