package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCheckSummariesOutput extends StObject {
  
  /**
    * List of Trusted Advisor summaries related to the Well-Architected best practice.
    */
  var CheckSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.CheckSummaries] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object ListCheckSummariesOutput {
  
  inline def apply(): ListCheckSummariesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCheckSummariesOutput]
  }
  
  extension [Self <: ListCheckSummariesOutput](x: Self) {
    
    inline def setCheckSummaries(value: CheckSummaries): Self = StObject.set(x, "CheckSummaries", value.asInstanceOf[js.Any])
    
    inline def setCheckSummariesUndefined: Self = StObject.set(x, "CheckSummaries", js.undefined)
    
    inline def setCheckSummariesVarargs(value: CheckSummary*): Self = StObject.set(x, "CheckSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
