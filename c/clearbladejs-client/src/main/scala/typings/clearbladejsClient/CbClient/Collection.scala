package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var URI: String
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newItem: Item, callback: CbCallback): Unit
  
  var endpoint: String
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  var isUsingCollectionName: Boolean
  
  var name: String
  
  def remove(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Collection {
  
  inline def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (Item, CbCallback) => Unit,
    endpoint: String,
    fetch: (Query, CbCallback) => Unit,
    isUsingCollectionName: Boolean,
    name: String,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), endpoint = endpoint.asInstanceOf[js.Any], fetch = js.Any.fromFunction2(fetch), isUsingCollectionName = isUsingCollectionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: CbCallback => Unit): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
    
    inline def setCount(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    inline def setCreate(value: (Item, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setFetch(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    inline def setIsUsingCollectionName(value: Boolean): Self = StObject.set(x, "isUsingCollectionName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
