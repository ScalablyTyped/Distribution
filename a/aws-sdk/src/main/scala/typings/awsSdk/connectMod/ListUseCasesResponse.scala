package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUseCasesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * The use cases.
    */
  var UseCaseSummaryList: js.UndefOr[typings.awsSdk.connectMod.UseCaseSummaryList] = js.undefined
}
object ListUseCasesResponse {
  
  inline def apply(): ListUseCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUseCasesResponse]
  }
  
  extension [Self <: ListUseCasesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUseCaseSummaryList(value: UseCaseSummaryList): Self = StObject.set(x, "UseCaseSummaryList", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSummaryListUndefined: Self = StObject.set(x, "UseCaseSummaryList", js.undefined)
    
    inline def setUseCaseSummaryListVarargs(value: UseCase*): Self = StObject.set(x, "UseCaseSummaryList", js.Array(value*))
  }
}
