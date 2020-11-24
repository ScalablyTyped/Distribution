package typings.dbus.anon

import org.scalablytyped.runtime.StringDictionary
import typings.dbus.mod.DBusConnection
import typings.dbus.mod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bus extends js.Object {
  
  var bus: DBusConnection = js.native
  
  def getProperties(callback: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[js.Any], Unit]): Unit = js.native
  
  def getProperty(name: String, callback: js.Function2[/* err */ Error | Null, /* name */ String, Unit]): Unit = js.native
  
  var interfaceName: String = js.native
  
  var objectPath: String = js.native
  
  var serviceName: String = js.native
  
  def setProperty(name: String, value: js.Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
}
object Bus {
  
  @scala.inline
  def apply(
    bus: DBusConnection,
    getProperties: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[js.Any], Unit] => Unit,
    getProperty: (String, js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => Unit,
    interfaceName: String,
    objectPath: String,
    serviceName: String,
    setProperty: (String, js.Any, js.Function1[/* err */ Error | Null, Unit]) => Unit
  ): Bus = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], getProperties = js.Any.fromFunction1(getProperties), getProperty = js.Any.fromFunction2(getProperty), interfaceName = interfaceName.asInstanceOf[js.Any], objectPath = objectPath.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], setProperty = js.Any.fromFunction3(setProperty))
    __obj.asInstanceOf[Bus]
  }
  
  @scala.inline
  implicit class BusOps[Self <: Bus] (val x: Self) extends AnyVal {
    
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
    def setGetProperties(
      value: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[js.Any], Unit] => Unit
    ): Self = this.set("getProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProperty(value: (String, js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => Unit): Self = this.set("getProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterfaceName(value: String): Self = this.set("interfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPath(value: String): Self = this.set("objectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetProperty(value: (String, js.Any, js.Function1[/* err */ Error | Null, Unit]) => Unit): Self = this.set("setProperty", js.Any.fromFunction3(value))
  }
}
