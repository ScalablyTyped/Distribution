package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpResponse extends StObject {
  
  var config: Any
  
  var data: js.Array[Entity]
  
  var error: js.UndefOr[Any] = js.undefined
  
  def getHeaders(headerName: String): String
  
  var saveContext: js.UndefOr[Any] = js.undefined
  
  var status: Double
}
object HttpResponse {
  
  inline def apply(config: Any, data: js.Array[Entity], getHeaders: String => String, status: Double): HttpResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getHeaders = js.Any.fromFunction1(getHeaders), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
  
  extension [Self <: HttpResponse](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Entity]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Entity*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGetHeaders(value: String => String): Self = StObject.set(x, "getHeaders", js.Any.fromFunction1(value))
    
    inline def setSaveContext(value: Any): Self = StObject.set(x, "saveContext", value.asInstanceOf[js.Any])
    
    inline def setSaveContextUndefined: Self = StObject.set(x, "saveContext", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
