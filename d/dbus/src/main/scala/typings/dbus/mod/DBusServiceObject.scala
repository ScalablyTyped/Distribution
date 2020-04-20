package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusServiceObject extends js.Object {
  def createInterface(name: String): DBusServiceInterface
}

object DBusServiceObject {
  @scala.inline
  def apply(createInterface: String => DBusServiceInterface): DBusServiceObject = {
    val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface))
    __obj.asInstanceOf[DBusServiceObject]
  }
}

