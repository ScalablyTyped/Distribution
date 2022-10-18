package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationsInput extends StObject {
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[ListNotificationsMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object ListNotificationsInput {
  
  inline def apply(): ListNotificationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationsInput]
  }
  
  extension [Self <: ListNotificationsInput](x: Self) {
    
    inline def setMaxResults(value: ListNotificationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
