package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBusConnection extends js.Object {
  
  def disconnect(): Unit = js.native
  
  /* tslint:disable-next-line:no-unnecessary-generics */
  def getInterface[T](
    serviceName: String,
    objectPath: String,
    interfaceName: String,
    callback: js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[T], Unit]
  ): Unit = js.native
  
  def getUniqueServiceName(serviceName: String, callback: js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]): Unit = js.native
  
  def reconnect(callback: js.Function0[Unit]): Unit = js.native
}
object DBusConnection {
  
  @scala.inline
  def apply(
    disconnect: () => Unit,
    getInterface: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[js.Any], Unit]) => Unit,
    getUniqueServiceName: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Unit,
    reconnect: js.Function0[Unit] => Unit
  ): DBusConnection = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), getInterface = js.Any.fromFunction4(getInterface), getUniqueServiceName = js.Any.fromFunction2(getUniqueServiceName), reconnect = js.Any.fromFunction1(reconnect))
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
      value: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[js.Any], Unit]) => Unit
    ): Self = this.set("getInterface", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetUniqueServiceName(value: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Unit): Self = this.set("getUniqueServiceName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReconnect(value: js.Function0[Unit] => Unit): Self = this.set("reconnect", js.Any.fromFunction1(value))
  }
}
