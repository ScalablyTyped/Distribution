package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCodes: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberCountryCodes] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberTypes: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberTypes] = js.undefined
}
object ListPhoneNumbersRequest {
  
  inline def apply(InstanceId: InstanceId): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
  
  extension [Self <: ListPhoneNumbersRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberCountryCodes(value: PhoneNumberCountryCodes): Self = StObject.set(x, "PhoneNumberCountryCodes", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodesUndefined: Self = StObject.set(x, "PhoneNumberCountryCodes", js.undefined)
    
    inline def setPhoneNumberCountryCodesVarargs(value: PhoneNumberCountryCode*): Self = StObject.set(x, "PhoneNumberCountryCodes", js.Array(value :_*))
    
    inline def setPhoneNumberTypes(value: PhoneNumberTypes): Self = StObject.set(x, "PhoneNumberTypes", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypesUndefined: Self = StObject.set(x, "PhoneNumberTypes", js.undefined)
    
    inline def setPhoneNumberTypesVarargs(value: PhoneNumberType*): Self = StObject.set(x, "PhoneNumberTypes", js.Array(value :_*))
  }
}
