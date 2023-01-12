package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileResponse extends StObject {
  
  var data: String
  
  // 开发者服务器返回的数据
  var statusCode: Double
}
object UploadFileResponse {
  
  inline def apply(data: String, statusCode: Double): UploadFileResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFileResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
