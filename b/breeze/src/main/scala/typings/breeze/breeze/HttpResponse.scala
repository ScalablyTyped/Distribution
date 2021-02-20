package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpResponse extends StObject {
  
  var config: js.Any = js.native
  
  var data: js.Array[Entity] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  def getHeaders(headerName: String): String = js.native
  
  var saveContext: js.UndefOr[js.Any] = js.native
  
  var status: Double = js.native
}
object HttpResponse {
  
  @scala.inline
  def apply(config: js.Any, data: js.Array[Entity], getHeaders: String => String, status: Double): HttpResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getHeaders = js.Any.fromFunction1(getHeaders), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
  
  @scala.inline
  implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[Entity]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Entity*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setGetHeaders(value: String => String): Self = StObject.set(x, "getHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveContext(value: js.Any): Self = StObject.set(x, "saveContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveContextUndefined: Self = StObject.set(x, "saveContext", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
