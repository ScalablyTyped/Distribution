package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Triggers extends StObject {
  
  var URI: String = js.native
  
  def create(name: String, data: js.Object, callback: CbCallback): Unit = js.native
  
  def delete(name: String, callback: CbCallback): Unit = js.native
  
  def fetchDefinitions(callback: CbCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  def update(name: String, data: js.Object, callback: CbCallback): Unit = js.native
  
  var user: APIUser = js.native
}
object Triggers {
  
  @scala.inline
  def apply(
    URI: String,
    create: (String, js.Object, CbCallback) => Unit,
    delete: (String, CbCallback) => Unit,
    fetchDefinitions: CbCallback => Unit,
    systemKey: String,
    systemSecret: String,
    update: (String, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Triggers = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], create = js.Any.fromFunction3(create), delete = js.Any.fromFunction2(delete), fetchDefinitions = js.Any.fromFunction1(fetchDefinitions), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triggers]
  }
  
  @scala.inline
  implicit class TriggersMutableBuilder[Self <: Triggers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (String, js.Object, CbCallback) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDelete(value: (String, CbCallback) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetchDefinitions(value: CbCallback => Unit): Self = StObject.set(x, "fetchDefinitions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (String, js.Object, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
