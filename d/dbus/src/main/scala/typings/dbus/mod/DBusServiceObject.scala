package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBusServiceObject extends js.Object {
  
  def createInterface(name: String): DBusServiceInterface = js.native
  
  var path: String = js.native
  
  var service: DBusService = js.native
}
object DBusServiceObject {
  
  @scala.inline
  def apply(createInterface: String => DBusServiceInterface, path: String, service: DBusService): DBusServiceObject = {
    val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface), path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
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
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: DBusService): Self = this.set("service", value.asInstanceOf[js.Any])
  }
}
