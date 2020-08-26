package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceName extends js.Object {
  var interfaceName: String = js.native
  var isDefault: Boolean = js.native
}

object InterfaceName {
  @scala.inline
  def apply(interfaceName: String, isDefault: Boolean): InterfaceName = {
    val __obj = js.Dynamic.literal(interfaceName = interfaceName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceName]
  }
  @scala.inline
  implicit class InterfaceNameOps[Self <: InterfaceName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInterfaceName(value: String): Self = this.set("interfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
  }
  
}

