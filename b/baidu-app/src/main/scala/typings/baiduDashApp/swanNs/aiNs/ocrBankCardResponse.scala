package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.Anon_Bankcardnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrBankCardResponse extends js.Object {
  var log_id: String
   // 请求标识码，随机数，唯一。
  var result: Anon_Bankcardnumber
}

object ocrBankCardResponse {
  @scala.inline
  def apply(log_id: String, result: Anon_Bankcardnumber): ocrBankCardResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result)
  
    __obj.asInstanceOf[ocrBankCardResponse]
  }
}

