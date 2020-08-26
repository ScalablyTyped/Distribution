package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBusConnection extends js.Object {
  def disconnect(): Unit = js.native
  def getInterface(
    serviceName: String,
    objectPath: String,
    interfaceName: String,
    callback: js.Function2[/* err */ DBusError, /* iface */ DBusInterface, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class DBusConnectionOps[Self <: DBusConnection] (val x: Self) extends AnyVal {
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
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInterface(
      value: (String, String, String, js.Function2[/* err */ DBusError, /* iface */ DBusInterface, Unit]) => Unit
    ): Self = this.set("getInterface", js.Any.fromFunction4(value))
  }
  
}

