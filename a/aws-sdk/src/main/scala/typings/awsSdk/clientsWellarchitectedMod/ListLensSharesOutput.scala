package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensSharesOutput extends StObject {
  
  /**
    * A list of lens share summaries.
    */
  var LensShareSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensShareSummaries] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object ListLensSharesOutput {
  
  inline def apply(): ListLensSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLensSharesOutput]
  }
  
  extension [Self <: ListLensSharesOutput](x: Self) {
    
    inline def setLensShareSummaries(value: LensShareSummaries): Self = StObject.set(x, "LensShareSummaries", value.asInstanceOf[js.Any])
    
    inline def setLensShareSummariesUndefined: Self = StObject.set(x, "LensShareSummaries", js.undefined)
    
    inline def setLensShareSummariesVarargs(value: LensShareSummary*): Self = StObject.set(x, "LensShareSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
