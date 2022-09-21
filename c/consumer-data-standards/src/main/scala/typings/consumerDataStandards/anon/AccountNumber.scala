package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountNumber
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Account Targeted for payment
    */
  var accountNumber: String
  
  var bankAddress: js.UndefOr[Address | Null] = js.undefined
  
  /**
    * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
    */
  var beneficiaryBankBIC: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number for the Clearing House Interbank Payments System
    */
  var chipNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Country of the recipient institution. A valid [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country code
    */
  var country: String
  
  /**
    * Number for Fedwire payment (Federal Reserve Wire Network)
    */
  var fedWireNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
    */
  var legalEntityIdentifier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * International bank routing number
    */
  var routingNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sort code used for account identification in some jurisdictions
    */
  var sortCode: js.UndefOr[String | Null] = js.undefined
}
object AccountNumber {
  
  inline def apply(accountNumber: String, country: String): AccountNumber = {
    val __obj = js.Dynamic.literal(accountNumber = accountNumber.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountNumber]
  }
  
  extension [Self <: AccountNumber](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setBankAddress(value: Address): Self = StObject.set(x, "bankAddress", value.asInstanceOf[js.Any])
    
    inline def setBankAddressNull: Self = StObject.set(x, "bankAddress", null)
    
    inline def setBankAddressUndefined: Self = StObject.set(x, "bankAddress", js.undefined)
    
    inline def setBeneficiaryBankBIC(value: String): Self = StObject.set(x, "beneficiaryBankBIC", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryBankBICNull: Self = StObject.set(x, "beneficiaryBankBIC", null)
    
    inline def setBeneficiaryBankBICUndefined: Self = StObject.set(x, "beneficiaryBankBIC", js.undefined)
    
    inline def setChipNumber(value: String): Self = StObject.set(x, "chipNumber", value.asInstanceOf[js.Any])
    
    inline def setChipNumberNull: Self = StObject.set(x, "chipNumber", null)
    
    inline def setChipNumberUndefined: Self = StObject.set(x, "chipNumber", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFedWireNumber(value: String): Self = StObject.set(x, "fedWireNumber", value.asInstanceOf[js.Any])
    
    inline def setFedWireNumberNull: Self = StObject.set(x, "fedWireNumber", null)
    
    inline def setFedWireNumberUndefined: Self = StObject.set(x, "fedWireNumber", js.undefined)
    
    inline def setLegalEntityIdentifier(value: String): Self = StObject.set(x, "legalEntityIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLegalEntityIdentifierNull: Self = StObject.set(x, "legalEntityIdentifier", null)
    
    inline def setLegalEntityIdentifierUndefined: Self = StObject.set(x, "legalEntityIdentifier", js.undefined)
    
    inline def setRoutingNumber(value: String): Self = StObject.set(x, "routingNumber", value.asInstanceOf[js.Any])
    
    inline def setRoutingNumberNull: Self = StObject.set(x, "routingNumber", null)
    
    inline def setRoutingNumberUndefined: Self = StObject.set(x, "routingNumber", js.undefined)
    
    inline def setSortCode(value: String): Self = StObject.set(x, "sortCode", value.asInstanceOf[js.Any])
    
    inline def setSortCodeNull: Self = StObject.set(x, "sortCode", null)
    
    inline def setSortCodeUndefined: Self = StObject.set(x, "sortCode", js.undefined)
  }
}
