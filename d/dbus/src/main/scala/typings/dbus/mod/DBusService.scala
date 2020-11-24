package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBusService extends js.Object {
  
  var bus: DBusConnection = js.native
  
  def createObject(path: String): DBusServiceObject = js.native
  
  def disconnect(): Unit = js.native
  
  def removeObject(service: DBusServiceObject): Unit = js.native
  
  var serviceName: String = js.native
}
object DBusService {
  
  @scala.inline
  def apply(
    bus: DBusConnection,
    createObject: String => DBusServiceObject,
    disconnect: () => Unit,
    removeObject: DBusServiceObject => Unit,
    serviceName: String
  ): DBusService = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], createObject = js.Any.fromFunction1(createObject), disconnect = js.Any.fromFunction0(disconnect), removeObject = js.Any.fromFunction1(removeObject), serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBusService]
  }
  
  @scala.inline
  implicit class DBusServiceOps[Self <: DBusService] (val x: Self) extends AnyVal {
    
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
    def setBus(value: DBusConnection): Self = this.set("bus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateObject(value: String => DBusServiceObject): Self = this.set("createObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveObject(value: DBusServiceObject => Unit): Self = this.set("removeObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
}
