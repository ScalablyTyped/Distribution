package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersResponse extends StObject {
  
  /**
    * A list of available phone numbers that you can claim for your Amazon Connect instance.
    */
  var AvailableNumbersList: js.UndefOr[typings.awsSdk.connectMod.AvailableNumbersList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[LargeNextToken] = js.undefined
}
object SearchAvailablePhoneNumbersResponse {
  
  inline def apply(): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
  
  extension [Self <: SearchAvailablePhoneNumbersResponse](x: Self) {
    
    inline def setAvailableNumbersList(value: AvailableNumbersList): Self = StObject.set(x, "AvailableNumbersList", value.asInstanceOf[js.Any])
    
    inline def setAvailableNumbersListUndefined: Self = StObject.set(x, "AvailableNumbersList", js.undefined)
    
    inline def setAvailableNumbersListVarargs(value: AvailableNumberSummary*): Self = StObject.set(x, "AvailableNumbersList", js.Array(value*))
    
    inline def setNextToken(value: LargeNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
