package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMilestonesOutput extends StObject {
  
  var MilestoneSummaries: js.UndefOr[typings.awsSdk.wellarchitectedMod.MilestoneSummaries] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.wellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
}
object ListMilestonesOutput {
  
  inline def apply(): ListMilestonesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMilestonesOutput]
  }
  
  extension [Self <: ListMilestonesOutput](x: Self) {
    
    inline def setMilestoneSummaries(value: MilestoneSummaries): Self = StObject.set(x, "MilestoneSummaries", value.asInstanceOf[js.Any])
    
    inline def setMilestoneSummariesUndefined: Self = StObject.set(x, "MilestoneSummaries", js.undefined)
    
    inline def setMilestoneSummariesVarargs(value: MilestoneSummary*): Self = StObject.set(x, "MilestoneSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
