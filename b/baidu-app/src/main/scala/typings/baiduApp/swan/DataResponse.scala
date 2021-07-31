package typings.baiduApp.swan

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region 基本参数
trait DataResponse extends StObject {
  
  /** 回调函数返回的内容 */
  var data: String | ArrayBuffer
  
  var header: js.Any
  
  var result: String
  
  var statusCode: Double
}
object DataResponse {
  
  @scala.inline
  def apply(data: String | ArrayBuffer, header: js.Any, result: String, statusCode: Double): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponse]
  }
  
  @scala.inline
  implicit class DataResponseMutableBuilder[Self <: DataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
