package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Bankcardnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ocrBankCardResponse extends StObject {
  
  var log_id: String = js.native
  
  // 请求标识码，随机数，唯一。
  var result: Bankcardnumber = js.native
}
object ocrBankCardResponse {
  
  @scala.inline
  def apply(log_id: String, result: Bankcardnumber): ocrBankCardResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrBankCardResponse]
  }
  
  @scala.inline
  implicit class ocrBankCardResponseMutableBuilder[Self <: ocrBankCardResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Bankcardnumber): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
