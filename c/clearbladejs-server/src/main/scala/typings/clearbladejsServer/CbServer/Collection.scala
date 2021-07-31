package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var URI: String
  
  def addColumn(options: js.Object, callback: CbCallback): Unit
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newItem: Item, callback: CbCallback): Unit
  
  def deleteCollection(callback: CbCallback): Unit
  
  def dropColumn(name: String, callback: CbCallback): Unit
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  def remove(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Collection {
  
  @scala.inline
  def apply(
    URI: String,
    addColumn: (js.Object, CbCallback) => Unit,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (Item, CbCallback) => Unit,
    deleteCollection: CbCallback => Unit,
    dropColumn: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], addColumn = js.Any.fromFunction2(addColumn), columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), deleteCollection = js.Any.fromFunction1(deleteCollection), dropColumn = js.Any.fromFunction2(dropColumn), fetch = js.Any.fromFunction2(fetch), remove = js.Any.fromFunction2(remove), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionMutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddColumn(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumns(value: CbCallback => Unit): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreate(value: (Item, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteCollection(value: CbCallback => Unit): Self = StObject.set(x, "deleteCollection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropColumn(value: (String, CbCallback) => Unit): Self = StObject.set(x, "dropColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetch(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (Query, js.Object, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
