package typings.baiduApp.swan.ai

import typings.baiduApp.AnonBankcardnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrBankCardResponse extends js.Object {
  var log_id: String
   // 请求标识码，随机数，唯一。
  var result: AnonBankcardnumber
}

object ocrBankCardResponse {
  @scala.inline
  def apply(log_id: String, result: AnonBankcardnumber): ocrBankCardResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ocrBankCardResponse]
  }
}

