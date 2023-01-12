package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var URI: String
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newDevice: js.Object, callback: CbCallback): Unit
  
  def delete(query: Query, callback: CbCallback): Unit
  
  def deleteDeviceByName(name: String, callback: CbCallback): Unit
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  def getDeviceByName(name: String, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
  
  def updateDeviceByName(name: String, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
  
  var user: APIUser
}
object Device {
  
  inline def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (js.Object, CbCallback) => Unit,
    delete: (Query, CbCallback) => Unit,
    deleteDeviceByName: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    getDeviceByName: (String, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, Boolean, CbCallback) => Unit,
    updateDeviceByName: (String, js.Object, Boolean, CbCallback) => Unit,
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), deleteDeviceByName = js.Any.fromFunction2(deleteDeviceByName), fetch = js.Any.fromFunction2(fetch), getDeviceByName = js.Any.fromFunction2(getDeviceByName), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction4(update), updateDeviceByName = js.Any.fromFunction4(updateDeviceByName), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: CbCallback => Unit): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
    
    inline def setCount(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    inline def setCreate(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setDelete(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setDeleteDeviceByName(value: (String, CbCallback) => Unit): Self = StObject.set(x, "deleteDeviceByName", js.Any.fromFunction2(value))
    
    inline def setFetch(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    inline def setGetDeviceByName(value: (String, CbCallback) => Unit): Self = StObject.set(x, "getDeviceByName", js.Any.fromFunction2(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, Boolean, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    inline def setUpdateDeviceByName(value: (String, js.Object, Boolean, CbCallback) => Unit): Self = StObject.set(x, "updateDeviceByName", js.Any.fromFunction4(value))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
