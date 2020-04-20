package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusService extends js.Object {
  def createObject(path: String): DBusServiceObject
  def disconnect(): Unit
  def removeObject(service: DBusServiceObject): Unit
}

object DBusService {
  @scala.inline
  def apply(
    createObject: String => DBusServiceObject,
    disconnect: () => Unit,
    removeObject: DBusServiceObject => Unit
  ): DBusService = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), disconnect = js.Any.fromFunction0(disconnect), removeObject = js.Any.fromFunction1(removeObject))
    __obj.asInstanceOf[DBusService]
  }
}

