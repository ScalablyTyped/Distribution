package typings.baiduApp.swan

import typings.baiduApp.anon.ErrCode
import typings.baiduApp.baiduAppStrings.DELETE
import typings.baiduApp.baiduAppStrings.GET
import typings.baiduApp.baiduAppStrings.HEAD
import typings.baiduApp.baiduAppStrings.OPTIONS
import typings.baiduApp.baiduAppStrings.POST
import typings.baiduApp.baiduAppStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions
  extends StObject
     with BaseOptions[DataResponse, js.Any] {
  
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object] = js.undefined
  
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse  默认值为json */
  var dataType: js.UndefOr[String] = js.undefined
  
  @JSName("fail")
  var fail_RequestOptions: js.UndefOr[js.Function1[/* err */ ErrCode, Unit]] = js.undefined
  
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE] = js.undefined
  
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer  默认值为text
    * @version 1.7.0
    */
  var responseType: js.UndefOr[String] = js.undefined
  
  /** 开发者服务器接口地址 */
  var url: String
}
object RequestOptions {
  
  inline def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFail(value: /* err */ ErrCode => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
