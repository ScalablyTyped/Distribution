package typings.braintreeWeb.hostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldFieldOptions extends StObject {
  
  var cardholderName: js.UndefOr[HostedFieldsField] = js.undefined
  
  var cvv: js.UndefOr[HostedFieldsField] = js.undefined
  
  var expirationDate: js.UndefOr[HostedFieldsField] = js.undefined
  
  var expirationMonth: js.UndefOr[HostedFieldsField] = js.undefined
  
  var expirationYear: js.UndefOr[HostedFieldsField] = js.undefined
  
  var number: js.UndefOr[HostedFieldsField] = js.undefined
  
  var postalCode: js.UndefOr[HostedFieldsField] = js.undefined
}
object HostedFieldFieldOptions {
  
  inline def apply(): HostedFieldFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedFieldFieldOptions]
  }
  
  extension [Self <: HostedFieldFieldOptions](x: Self) {
    
    inline def setCardholderName(value: HostedFieldsField): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    inline def setCvv(value: HostedFieldsField): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    inline def setExpirationDate(value: HostedFieldsField): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExpirationMonth(value: HostedFieldsField): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: HostedFieldsField): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setNumber(value: HostedFieldsField): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPostalCode(value: HostedFieldsField): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
  }
}
