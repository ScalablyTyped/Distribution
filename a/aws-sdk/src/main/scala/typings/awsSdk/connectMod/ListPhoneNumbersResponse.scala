package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the phone numbers.
    */
  var PhoneNumberSummaryList: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberSummaryList] = js.undefined
}
object ListPhoneNumbersResponse {
  
  inline def apply(): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
  
  extension [Self <: ListPhoneNumbersResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberSummaryList(value: PhoneNumberSummaryList): Self = StObject.set(x, "PhoneNumberSummaryList", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberSummaryListUndefined: Self = StObject.set(x, "PhoneNumberSummaryList", js.undefined)
    
    inline def setPhoneNumberSummaryListVarargs(value: PhoneNumberSummary*): Self = StObject.set(x, "PhoneNumberSummaryList", js.Array(value :_*))
  }
}
