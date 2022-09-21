package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLongTermPricingRequest extends StObject {
  
  /**
    * The maximum number of ListLongTermPricing objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of ListLongTermPricing to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLongTermPricingRequest {
  
  inline def apply(): ListLongTermPricingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLongTermPricingRequest]
  }
  
  extension [Self <: ListLongTermPricingRequest](x: Self) {
    
    inline def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
