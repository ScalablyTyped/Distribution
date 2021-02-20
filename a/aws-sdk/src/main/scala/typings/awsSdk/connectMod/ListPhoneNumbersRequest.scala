package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.native
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCodes: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberCountryCodes] = js.native
  
  /**
    * The type of phone number.
    */
  var PhoneNumberTypes: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberTypes] = js.native
}
object ListPhoneNumbersRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
  
  @scala.inline
  implicit class ListPhoneNumbersRequestMutableBuilder[Self <: ListPhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountryCodes(value: PhoneNumberCountryCodes): Self = StObject.set(x, "PhoneNumberCountryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberCountryCodesUndefined: Self = StObject.set(x, "PhoneNumberCountryCodes", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountryCodesVarargs(value: PhoneNumberCountryCode*): Self = StObject.set(x, "PhoneNumberCountryCodes", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberTypes(value: PhoneNumberTypes): Self = StObject.set(x, "PhoneNumberTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberTypesUndefined: Self = StObject.set(x, "PhoneNumberTypes", js.undefined)
    
    @scala.inline
    def setPhoneNumberTypesVarargs(value: PhoneNumberType*): Self = StObject.set(x, "PhoneNumberTypes", js.Array(value :_*))
  }
}
