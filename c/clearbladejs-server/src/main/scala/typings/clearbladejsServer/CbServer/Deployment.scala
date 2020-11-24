package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends js.Object {
  
  def create(name: String, description: String, options: DeploymentOptions, callback: CbCallback): Unit = js.native
  
  def delete(name: String, callback: CbCallback): Unit = js.native
  
  def read(name: String, callback: CbCallback): Unit = js.native
  
  def readAll(query: QueryObj, callback: CbCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  def update(name: String, options: DeploymentOptions, callback: CbCallback): Unit = js.native
  
  var user: APIUser = js.native
}
object Deployment {
  
  @scala.inline
  def apply(
    create: (String, String, DeploymentOptions, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    read: (String, CbCallback) => Unit,
    readAll: (QueryObj, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, DeploymentOptions, CbCallback) => Unit,
    user: APIUser
  ): Deployment = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction2(delete), read = js.Any.fromFunction2(read), readAll = js.Any.fromFunction2(readAll), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (String, String, DeploymentOptions, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDelete(value: (String, CbCallback) => Unit): Self = this.set("delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRead(value: (String, CbCallback) => Unit): Self = this.set("read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadAll(value: (QueryObj, CbCallback) => Unit): Self = this.set("readAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (String, DeploymentOptions, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
