package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var URI: String
  
  var callTimeout: Double
  
  def create(name: String, body: String, callback: CbCallback): Unit
  
  def delete(name: String, callback: CbCallback): Unit
  
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
  
  def getAllServices(callback: CbCallback): Unit
  
  def getCompletedServices(callback: CbCallback): Unit
  
  def getFailedServices(callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(name: String, body: String, callback: CbCallback): Unit
  
  var user: APIUser
}
object Code {
  
  inline def apply(
    URI: String,
    callTimeout: Double,
    create: (String, String, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    execute: (String, js.Object, CbCallback) => Unit,
    getAllServices: CbCallback => Unit,
    getCompletedServices: CbCallback => Unit,
    getFailedServices: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, String, CbCallback) => Unit,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), execute = js.Any.fromFunction3(execute), getAllServices = js.Any.fromFunction1(getAllServices), getCompletedServices = js.Any.fromFunction1(getCompletedServices), getFailedServices = js.Any.fromFunction1(getFailedServices), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: (String, String, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    inline def setDelete(value: (String, CbCallback) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setExecute(value: (String, js.Object, CbCallback) => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
    
    inline def setGetAllServices(value: CbCallback => Unit): Self = StObject.set(x, "getAllServices", js.Any.fromFunction1(value))
    
    inline def setGetCompletedServices(value: CbCallback => Unit): Self = StObject.set(x, "getCompletedServices", js.Any.fromFunction1(value))
    
    inline def setGetFailedServices(value: CbCallback => Unit): Self = StObject.set(x, "getFailedServices", js.Any.fromFunction1(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (String, String, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
