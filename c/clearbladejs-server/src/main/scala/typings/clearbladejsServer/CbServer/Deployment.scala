package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  def create(name: String, description: String, options: DeploymentOptions, callback: CbCallback): Unit
  
  def delete(name: String, callback: CbCallback): Unit
  
  def read(name: String, callback: CbCallback): Unit
  
  def readAll(query: QueryObj, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(name: String, options: DeploymentOptions, callback: CbCallback): Unit
  
  var user: APIUser
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
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (String, String, DeploymentOptions, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDelete(value: (String, CbCallback) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRead(value: (String, CbCallback) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadAll(value: (QueryObj, CbCallback) => Unit): Self = StObject.set(x, "readAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (String, DeploymentOptions, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
