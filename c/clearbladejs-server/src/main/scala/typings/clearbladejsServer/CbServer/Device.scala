package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var URI: String
  
  def create(newDevice: js.Object, callback: CbCallback): Unit
  
  def delete(query: Query, callback: CbCallback): Unit
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}
object Device {
  
  @scala.inline
  def apply(
    URI: String,
    create: (js.Object, CbCallback) => Unit,
    delete: (Query, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), fetch = js.Any.fromFunction2(fetch), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetch(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (Query, js.Object, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
