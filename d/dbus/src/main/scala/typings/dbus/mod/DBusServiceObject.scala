package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBusServiceObject extends js.Object {
  def createInterface(name: String): DBusServiceInterface = js.native
}

object DBusServiceObject {
  @scala.inline
  def apply(createInterface: String => DBusServiceInterface): DBusServiceObject = {
    val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface))
    __obj.asInstanceOf[DBusServiceObject]
  }
  @scala.inline
  implicit class DBusServiceObjectOps[Self <: DBusServiceObject] (val x: Self) extends AnyVal {
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
    def setCreateInterface(value: String => DBusServiceInterface): Self = this.set("createInterface", js.Any.fromFunction1(value))
  }
  
}

