package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debit extends js.Object {
  
  var Commercial: String = js.native
  
  var CountryOfIssuance: String = js.native
  
  var Debit: String = js.native
  
  var DurbinRegulated: String = js.native
  
  var Fraud: String = js.native
  
  var Healthcare: String = js.native
  
  var Hiper: String = js.native
  
  var HiperCard: String = js.native
  
  var IssuingBank: String = js.native
  
  var No: String = js.native
  
  var Payroll: String = js.native
  
  var Prepaid: String = js.native
  
  var Unknown: String = js.native
}
object Debit {
  
  @scala.inline
  def apply(
    Commercial: String,
    CountryOfIssuance: String,
    Debit: String,
    DurbinRegulated: String,
    Fraud: String,
    Healthcare: String,
    Hiper: String,
    HiperCard: String,
    IssuingBank: String,
    No: String,
    Payroll: String,
    Prepaid: String,
    Unknown: String
  ): Debit = {
    val __obj = js.Dynamic.literal(Commercial = Commercial.asInstanceOf[js.Any], CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], Debit = Debit.asInstanceOf[js.Any], DurbinRegulated = DurbinRegulated.asInstanceOf[js.Any], Fraud = Fraud.asInstanceOf[js.Any], Healthcare = Healthcare.asInstanceOf[js.Any], Hiper = Hiper.asInstanceOf[js.Any], HiperCard = HiperCard.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any], No = No.asInstanceOf[js.Any], Payroll = Payroll.asInstanceOf[js.Any], Prepaid = Prepaid.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debit]
  }
  
  @scala.inline
  implicit class DebitOps[Self <: Debit] (val x: Self) extends AnyVal {
    
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
    def setCommercial(value: String): Self = this.set("Commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("CountryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: String): Self = this.set("Debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: String): Self = this.set("DurbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraud(value: String): Self = this.set("Fraud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: String): Self = this.set("Healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiper(value: String): Self = this.set("Hiper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiperCard(value: String): Self = this.set("HiperCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = this.set("IssuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo(value: String): Self = this.set("No", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: String): Self = this.set("Payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: String): Self = this.set("Prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: String): Self = this.set("Unknown", value.asInstanceOf[js.Any])
  }
}
