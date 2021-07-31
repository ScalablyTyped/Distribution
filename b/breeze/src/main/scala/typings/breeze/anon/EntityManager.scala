package typings.breeze.anon

import typings.breeze.breeze.EntityQuery
import typings.breeze.breeze.HttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityManager extends StObject {
  
  var entityManager: typings.breeze.breeze.EntityManager
  
  var httpResponse: HttpResponse
  
  var message: js.UndefOr[String] = js.undefined
  
  var query: EntityQuery
  
  var stack: js.UndefOr[String] = js.undefined
}
object EntityManager {
  
  @scala.inline
  def apply(entityManager: typings.breeze.breeze.EntityManager, httpResponse: HttpResponse, query: EntityQuery): EntityManager = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityManager]
  }
  
  @scala.inline
  implicit class EntityManagerMutableBuilder[Self <: EntityManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityManager(value: typings.breeze.breeze.EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpResponse(value: HttpResponse): Self = StObject.set(x, "httpResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setQuery(value: EntityQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
