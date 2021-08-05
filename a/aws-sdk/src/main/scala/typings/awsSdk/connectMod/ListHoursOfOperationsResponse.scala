package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHoursOfOperationsResponse extends StObject {
  
  /**
    * Information about the hours of operation.
    */
  var HoursOfOperationSummaryList: js.UndefOr[typings.awsSdk.connectMod.HoursOfOperationSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
}
object ListHoursOfOperationsResponse {
  
  inline def apply(): ListHoursOfOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHoursOfOperationsResponse]
  }
  
  extension [Self <: ListHoursOfOperationsResponse](x: Self) {
    
    inline def setHoursOfOperationSummaryList(value: HoursOfOperationSummaryList): Self = StObject.set(x, "HoursOfOperationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationSummaryListUndefined: Self = StObject.set(x, "HoursOfOperationSummaryList", js.undefined)
    
    inline def setHoursOfOperationSummaryListVarargs(value: HoursOfOperationSummary*): Self = StObject.set(x, "HoursOfOperationSummaryList", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
