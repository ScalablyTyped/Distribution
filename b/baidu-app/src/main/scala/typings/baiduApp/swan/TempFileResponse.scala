package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempFileResponse extends StObject {
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
  
  /** 文件的临时路径 */
  var tempFilePath: String = js.native
}
object TempFileResponse {
  
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  
  @scala.inline
  implicit class TempFileResponseMutableBuilder[Self <: TempFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
