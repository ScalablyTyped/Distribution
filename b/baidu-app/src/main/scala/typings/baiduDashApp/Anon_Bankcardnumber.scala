package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bankcardnumber extends js.Object {
  // 返回结果
  var bank_card_number: String
   // 银行名，不能识别时为空 。
  var bank_card_type: String
   // 银行卡卡号
  var bank_name: String
}

object Anon_Bankcardnumber {
  @scala.inline
  def apply(bank_card_number: String, bank_card_type: String, bank_name: String): Anon_Bankcardnumber = {
    val __obj = js.Dynamic.literal(bank_card_number = bank_card_number, bank_card_type = bank_card_type, bank_name = bank_name)
  
    __obj.asInstanceOf[Anon_Bankcardnumber]
  }
}

