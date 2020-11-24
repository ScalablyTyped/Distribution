package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersRequest extends js.Object {
  
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
  implicit class ListPhoneNumbersRequestOps[Self <: ListPhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResult1000): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountryCodesVarargs(value: PhoneNumberCountryCode*): Self = this.set("PhoneNumberCountryCodes", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberCountryCodes(value: PhoneNumberCountryCodes): Self = this.set("PhoneNumberCountryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberCountryCodes: Self = this.set("PhoneNumberCountryCodes", js.undefined)
    
    @scala.inline
    def setPhoneNumberTypesVarargs(value: PhoneNumberType*): Self = this.set("PhoneNumberTypes", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberTypes(value: PhoneNumberTypes): Self = this.set("PhoneNumberTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberTypes: Self = this.set("PhoneNumberTypes", js.undefined)
  }
}
