package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensesOutput extends StObject {
  
  var LensSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensSummaries] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object ListLensesOutput {
  
  inline def apply(): ListLensesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLensesOutput]
  }
  
  extension [Self <: ListLensesOutput](x: Self) {
    
    inline def setLensSummaries(value: LensSummaries): Self = StObject.set(x, "LensSummaries", value.asInstanceOf[js.Any])
    
    inline def setLensSummariesUndefined: Self = StObject.set(x, "LensSummaries", js.undefined)
    
    inline def setLensSummariesVarargs(value: LensSummary*): Self = StObject.set(x, "LensSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
