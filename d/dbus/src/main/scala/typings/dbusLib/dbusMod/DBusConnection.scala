package typings
package dbusLib.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusConnection extends js.Object {
  def disconnect(): scala.Unit
  def getInterface(
    serviceName: java.lang.String,
    objectPath: java.lang.String,
    interfaceName: java.lang.String,
    callback: js.Function2[/* err */ DBusError, /* iface */ DBusInterface, scala.Unit]
  ): scala.Unit
}

object DBusConnection {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    getInterface: (java.lang.String, java.lang.String, java.lang.String, js.Function2[/* err */ DBusError, /* iface */ DBusInterface, scala.Unit]) => scala.Unit
  ): DBusConnection = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), getInterface = js.Any.fromFunction4(getInterface))
  
    __obj.asInstanceOf[DBusConnection]
  }
}

