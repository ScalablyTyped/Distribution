package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsRequest extends StObject {
  
  /**
    * The time when creation of the recovery point finished.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var maxResults: js.UndefOr[ListRecoveryPointsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The name of the namespace to list recovery points for.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * If your initial ListRecoveryPoints operation returns a nextToken, you can include the returned nextToken in subsequent ListRecoveryPoints operations, which returns results in the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the recovery point's creation was initiated.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object ListRecoveryPointsRequest {
  
  inline def apply(): ListRecoveryPointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryPointsRequest]
  }
  
  extension [Self <: ListRecoveryPointsRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaxResults(value: ListRecoveryPointsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
