package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commercial extends StObject {
  
  var Commercial: String
  
  var CountryOfIssuance: String
  
  var Debit: String
  
  var DurbinRegulated: String
  
  var Fraud: String
  
  var Healthcare: String
  
  var Hiper: String
  
  var HiperCard: String
  
  var IssuingBank: String
  
  var No: String
  
  var Payroll: String
  
  var Prepaid: String
  
  var Unknown: String
}
object Commercial {
  
  inline def apply(
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
  ): Commercial = {
    val __obj = js.Dynamic.literal(Commercial = Commercial.asInstanceOf[js.Any], CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], Debit = Debit.asInstanceOf[js.Any], DurbinRegulated = DurbinRegulated.asInstanceOf[js.Any], Fraud = Fraud.asInstanceOf[js.Any], Healthcare = Healthcare.asInstanceOf[js.Any], Hiper = Hiper.asInstanceOf[js.Any], HiperCard = HiperCard.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any], No = No.asInstanceOf[js.Any], Payroll = Payroll.asInstanceOf[js.Any], Prepaid = Prepaid.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  
  extension [Self <: Commercial](x: Self) {
    
    inline def setCommercial(value: String): Self = StObject.set(x, "Commercial", value.asInstanceOf[js.Any])
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "CountryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setDebit(value: String): Self = StObject.set(x, "Debit", value.asInstanceOf[js.Any])
    
    inline def setDurbinRegulated(value: String): Self = StObject.set(x, "DurbinRegulated", value.asInstanceOf[js.Any])
    
    inline def setFraud(value: String): Self = StObject.set(x, "Fraud", value.asInstanceOf[js.Any])
    
    inline def setHealthcare(value: String): Self = StObject.set(x, "Healthcare", value.asInstanceOf[js.Any])
    
    inline def setHiper(value: String): Self = StObject.set(x, "Hiper", value.asInstanceOf[js.Any])
    
    inline def setHiperCard(value: String): Self = StObject.set(x, "HiperCard", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: String): Self = StObject.set(x, "IssuingBank", value.asInstanceOf[js.Any])
    
    inline def setNo(value: String): Self = StObject.set(x, "No", value.asInstanceOf[js.Any])
    
    inline def setPayroll(value: String): Self = StObject.set(x, "Payroll", value.asInstanceOf[js.Any])
    
    inline def setPrepaid(value: String): Self = StObject.set(x, "Prepaid", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: String): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
