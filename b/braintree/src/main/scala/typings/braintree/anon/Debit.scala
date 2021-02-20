package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debit extends StObject {
  
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
  implicit class DebitMutableBuilder[Self <: Debit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommercial(value: String): Self = StObject.set(x, "Commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "CountryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: String): Self = StObject.set(x, "Debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: String): Self = StObject.set(x, "DurbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraud(value: String): Self = StObject.set(x, "Fraud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: String): Self = StObject.set(x, "Healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiper(value: String): Self = StObject.set(x, "Hiper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiperCard(value: String): Self = StObject.set(x, "HiperCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = StObject.set(x, "IssuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo(value: String): Self = StObject.set(x, "No", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: String): Self = StObject.set(x, "Payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: String): Self = StObject.set(x, "Prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: String): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
