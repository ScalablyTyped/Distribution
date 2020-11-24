package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Bankcardnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ocrBankCardResponse extends js.Object {
  
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
  implicit class ocrBankCardResponseOps[Self <: ocrBankCardResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLog_id(value: String): Self = this.set("log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Bankcardnumber): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
