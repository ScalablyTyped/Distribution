package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBankcardnumber extends js.Object {
  // 返回结果
  var bank_card_number: String
   // 银行名，不能识别时为空 。
  var bank_card_type: String
   // 银行卡卡号
  var bank_name: String
}

object AnonBankcardnumber {
  @scala.inline
  def apply(bank_card_number: String, bank_card_type: String, bank_name: String): AnonBankcardnumber = {
    val __obj = js.Dynamic.literal(bank_card_number = bank_card_number.asInstanceOf[js.Any], bank_card_type = bank_card_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBankcardnumber]
  }
}

