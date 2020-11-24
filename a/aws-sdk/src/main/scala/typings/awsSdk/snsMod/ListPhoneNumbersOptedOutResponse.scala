package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersOptedOutResponse extends js.Object {
  
  /**
    * A NextToken string is returned when you call the ListPhoneNumbersOptedOut action if additional records are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can contain up to 100 phone numbers.
    */
  var phoneNumbers: js.UndefOr[PhoneNumberList] = js.native
}
object ListPhoneNumbersOptedOutResponse {
  
  @scala.inline
  def apply(): ListPhoneNumbersOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
  }
  
  @scala.inline
  implicit class ListPhoneNumbersOptedOutResponseOps[Self <: ListPhoneNumbersOptedOutResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: java.lang.String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = this.set("phoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumbers(value: PhoneNumberList): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumbers: Self = this.set("phoneNumbers", js.undefined)
  }
}
