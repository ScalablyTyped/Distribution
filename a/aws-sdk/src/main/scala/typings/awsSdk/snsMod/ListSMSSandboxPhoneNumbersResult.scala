package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSMSSandboxPhoneNumbersResult extends StObject {
  
  /**
    * A NextToken string is returned when you call the ListSMSSandboxPhoneNumbersInput operation if additional pages of records are available.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * A list of the calling account's pending and verified phone numbers.
    */
  var PhoneNumbers: SMSSandboxPhoneNumberList
}
object ListSMSSandboxPhoneNumbersResult {
  
  inline def apply(PhoneNumbers: SMSSandboxPhoneNumberList): ListSMSSandboxPhoneNumbersResult = {
    val __obj = js.Dynamic.literal(PhoneNumbers = PhoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSMSSandboxPhoneNumbersResult]
  }
  
  extension [Self <: ListSMSSandboxPhoneNumbersResult](x: Self) {
    
    inline def setNextToken(value: java.lang.String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumbers(value: SMSSandboxPhoneNumberList): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersVarargs(value: SMSSandboxPhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
  }
}
