package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkloadsInput extends StObject {
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[ListWorkloadsMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadNamePrefix: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadNamePrefix] = js.undefined
}
object ListWorkloadsInput {
  
  inline def apply(): ListWorkloadsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkloadsInput]
  }
  
  extension [Self <: ListWorkloadsInput](x: Self) {
    
    inline def setMaxResults(value: ListWorkloadsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadNamePrefix(value: WorkloadNamePrefix): Self = StObject.set(x, "WorkloadNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNamePrefixUndefined: Self = StObject.set(x, "WorkloadNamePrefix", js.undefined)
  }
}
