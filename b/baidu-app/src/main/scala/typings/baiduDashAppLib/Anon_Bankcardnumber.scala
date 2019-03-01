package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bankcardnumber extends js.Object {
  // 返回结果
  var bank_card_number: java.lang.String
   // 银行名，不能识别时为空 。
  var bank_card_type: java.lang.String
   // 银行卡卡号
  var bank_name: java.lang.String
}

object Anon_Bankcardnumber {
  @scala.inline
  def apply(bank_card_number: java.lang.String, bank_card_type: java.lang.String, bank_name: java.lang.String): Anon_Bankcardnumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bank_card_number")(bank_card_number)
    __obj.updateDynamic("bank_card_type")(bank_card_type)
    __obj.updateDynamic("bank_name")(bank_name)
    __obj.asInstanceOf[Anon_Bankcardnumber]
  }
}

