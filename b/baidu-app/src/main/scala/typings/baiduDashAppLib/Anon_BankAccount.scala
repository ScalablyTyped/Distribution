package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BankAccount extends js.Object {
   // 银行名称
  var bankAccount: java.lang.String
   // 手机号码
  var bankName: java.lang.String
   // 抬头税号
  var companyAddress: java.lang.String
   // 银行账号
  var errMsg: java.lang.String
   // 抬头名称
  var taxNumber: java.lang.String
   // 单位地址
  var telephone: java.lang.String
   // 抬头类型（0：单位，1：个人）
  var title: java.lang.String
  var `type`: java.lang.String
}

object Anon_BankAccount {
  @scala.inline
  def apply(
    bankAccount: java.lang.String,
    bankName: java.lang.String,
    companyAddress: java.lang.String,
    errMsg: java.lang.String,
    taxNumber: java.lang.String,
    telephone: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String
  ): Anon_BankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount, bankName = bankName, companyAddress = companyAddress, errMsg = errMsg, taxNumber = taxNumber, telephone = telephone, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BankAccount]
  }
}

