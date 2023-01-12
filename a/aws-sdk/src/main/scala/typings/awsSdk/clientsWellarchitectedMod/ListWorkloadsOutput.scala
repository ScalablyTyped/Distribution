package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkloadsOutput extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadSummaries] = js.undefined
}
object ListWorkloadsOutput {
  
  inline def apply(): ListWorkloadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkloadsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkloadsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadSummaries(value: WorkloadSummaries): Self = StObject.set(x, "WorkloadSummaries", value.asInstanceOf[js.Any])
    
    inline def setWorkloadSummariesUndefined: Self = StObject.set(x, "WorkloadSummaries", js.undefined)
    
    inline def setWorkloadSummariesVarargs(value: WorkloadSummary*): Self = StObject.set(x, "WorkloadSummaries", js.Array(value*))
  }
}
