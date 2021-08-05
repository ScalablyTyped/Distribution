package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpResponse extends StObject {
  
  var contentType: String
  
  var data: js.Any
  
  var headers: js.Array[Header]
  
  var id: Double
  
  var redirectURL: String | Null
  
  var stage: String
  
  var status: Double
  
  var statusText: String
  
  var time: String
  
  var url: String
}
object HttpResponse {
  
  inline def apply(
    contentType: String,
    data: js.Any,
    headers: js.Array[Header],
    id: Double,
    stage: String,
    status: Double,
    statusText: String,
    time: String,
    url: String
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], redirectURL = null)
    __obj.asInstanceOf[HttpResponse]
  }
  
  extension [Self <: HttpResponse](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLNull: Self = StObject.set(x, "redirectURL", null)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
