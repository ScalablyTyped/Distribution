package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusConnection extends js.Object {
  def disconnect(): Unit
  def getInterface(
    serviceName: String,
    objectPath: String,
    interfaceName: String,
    callback: js.Function2[/* err */ DBusError, /* iface */ DBusInterface, Unit]
  ): Unit
}

object DBusConnection {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    getInterface: (String, String, String, js.Function2[/* err */ DBusError, /* iface */ DBusInterface, Unit]) => Unit
  ): DBusConnection = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), getInterface = js.Any.fromFunction4(getInterface))
    __obj.asInstanceOf[DBusConnection]
  }
}

