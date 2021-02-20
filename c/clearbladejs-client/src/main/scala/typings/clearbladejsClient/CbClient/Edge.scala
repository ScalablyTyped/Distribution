package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends StObject {
  
  var URI: String = js.native
  
  def columns(callback: CbCallback): Unit = js.native
  
  def count(query: Query, callback: CbCallback): Unit = js.native
  
  def create(newEdge: js.Object, name: String, callback: CbCallback): Unit = js.native
  
  def deleteEdgeByName(name: String, callback: CbCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  def updateEdgeByName(name: String, `object`: js.Object, callback: CbCallback): Unit = js.native
  
  var user: APIUser = js.native
}
object Edge {
  
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (js.Object, String, CbCallback) => Unit,
    deleteEdgeByName: (String, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    updateEdgeByName: (String, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Edge = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction3(create), deleteEdgeByName = js.Any.fromFunction2(deleteEdgeByName), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], updateEdgeByName = js.Any.fromFunction3(updateEdgeByName), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: CbCallback => Unit): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: (Query, CbCallback) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreate(value: (js.Object, String, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeleteEdgeByName(value: (String, CbCallback) => Unit): Self = StObject.set(x, "deleteEdgeByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEdgeByName(value: (String, js.Object, CbCallback) => Unit): Self = StObject.set(x, "updateEdgeByName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
