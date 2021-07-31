package typings.breeze.anon

import typings.breeze.breeze.EntityError
import typings.breeze.breeze.HttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityErrors extends StObject {
  
  var entityErrors: js.Array[EntityError]
  
  var httpResponse: HttpResponse
  
  var message: String
  
  var stack: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
}
object EntityErrors {
  
  @scala.inline
  def apply(entityErrors: js.Array[EntityError], httpResponse: HttpResponse, message: String): EntityErrors = {
    val __obj = js.Dynamic.literal(entityErrors = entityErrors.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityErrors]
  }
  
  @scala.inline
  implicit class EntityErrorsMutableBuilder[Self <: EntityErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityErrors(value: js.Array[EntityError]): Self = StObject.set(x, "entityErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityErrorsVarargs(value: EntityError*): Self = StObject.set(x, "entityErrors", js.Array(value :_*))
    
    @scala.inline
    def setHttpResponse(value: HttpResponse): Self = StObject.set(x, "httpResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
