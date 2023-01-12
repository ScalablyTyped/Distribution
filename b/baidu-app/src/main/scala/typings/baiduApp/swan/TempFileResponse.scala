package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFileResponse extends StObject {
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
  
  /** 文件的临时路径 */
  var tempFilePath: String
}
object TempFileResponse {
  
  inline def apply(statusCode: Double, tempFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TempFileResponse] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
