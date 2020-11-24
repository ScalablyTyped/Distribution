package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Triggers extends js.Object {
  
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
  implicit class TriggersOps[Self <: Triggers] (val x: Self) extends AnyVal {
    
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
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: (String, js.Object, CbCallback) => Unit): Self = this.set("create", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDelete(value: (String, CbCallback) => Unit): Self = this.set("delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetchDefinitions(value: CbCallback => Unit): Self = this.set("fetchDefinitions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (String, js.Object, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
