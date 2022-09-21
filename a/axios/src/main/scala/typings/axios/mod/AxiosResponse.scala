package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxiosResponse[T, D] extends StObject {
  
  var config: AxiosRequestConfig[D]
  
  var data: T
  
  var headers: AxiosResponseHeaders
  
  var request: js.UndefOr[Any] = js.undefined
  
  var status: Double
  
  var statusText: String
}
object AxiosResponse {
  
  inline def apply[T, D](
    config: AxiosRequestConfig[D],
    data: T,
    headers: AxiosResponseHeaders,
    status: Double,
    statusText: String
  ): AxiosResponse[T, D] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosResponse[T, D]]
  }
  
  extension [Self <: AxiosResponse[?, ?], T, D](x: Self & (AxiosResponse[T, D])) {
    
    inline def setConfig(value: AxiosRequestConfig[D]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: AxiosResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
