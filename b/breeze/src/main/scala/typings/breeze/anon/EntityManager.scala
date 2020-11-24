package typings.breeze.anon

import typings.breeze.breeze.EntityQuery
import typings.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityManager extends js.Object {
  
  var entityManager: typings.breeze.breeze.EntityManager = js.native
  
  var httpResponse: HttpResponse = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var query: EntityQuery = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object EntityManager {
  
  @scala.inline
  def apply(entityManager: typings.breeze.breeze.EntityManager, httpResponse: HttpResponse, query: EntityQuery): EntityManager = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityManager]
  }
  
  @scala.inline
  implicit class EntityManagerOps[Self <: EntityManager] (val x: Self) extends AnyVal {
    
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
    def setEntityManager(value: typings.breeze.breeze.EntityManager): Self = this.set("entityManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpResponse(value: HttpResponse): Self = this.set("httpResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: EntityQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
