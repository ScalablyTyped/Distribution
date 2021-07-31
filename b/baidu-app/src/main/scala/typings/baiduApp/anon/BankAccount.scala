package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAccount extends StObject {
  
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
object BankAccount {
  
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
  ): BankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  
  @scala.inline
  implicit class BankAccountMutableBuilder[Self <: BankAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankAccount(value: String): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyAddress(value: String): Self = StObject.set(x, "companyAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNumber(value: String): Self = StObject.set(x, "taxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephone(value: String): Self = StObject.set(x, "telephone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
