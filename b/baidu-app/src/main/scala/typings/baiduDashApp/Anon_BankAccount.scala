package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BankAccount extends js.Object {
   // 银行名称
  var bankAccount: String
   // 手机号码
  var bankName: String
   // 抬头税号
  var companyAddress: String
   // 银行账号
  var errMsg: String
   // 抬头名称
  var taxNumber: String
   // 单位地址
  var telephone: String
   // 抬头类型（0：单位，1：个人）
  var title: String
  var `type`: String
}

object Anon_BankAccount {
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: String
  ): Anon_BankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount, bankName = bankName, companyAddress = companyAddress, errMsg = errMsg, taxNumber = taxNumber, telephone = telephone, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BankAccount]
  }
}

