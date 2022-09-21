package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalousLogGroupsResponse extends StObject {
  
  /**
    *  The list of Amazon CloudWatch log groups that are related to an insight. 
    */
  var AnomalousLogGroups: typings.awsSdk.devopsguruMod.AnomalousLogGroups
  
  /**
    *  The ID of the insight containing the log groups. 
    */
  var InsightId: typings.awsSdk.devopsguruMod.InsightId
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListAnomalousLogGroupsResponse {
  
  inline def apply(AnomalousLogGroups: AnomalousLogGroups, InsightId: InsightId): ListAnomalousLogGroupsResponse = {
    val __obj = js.Dynamic.literal(AnomalousLogGroups = AnomalousLogGroups.asInstanceOf[js.Any], InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnomalousLogGroupsResponse]
  }
  
  extension [Self <: ListAnomalousLogGroupsResponse](x: Self) {
    
    inline def setAnomalousLogGroups(value: AnomalousLogGroups): Self = StObject.set(x, "AnomalousLogGroups", value.asInstanceOf[js.Any])
    
    inline def setAnomalousLogGroupsVarargs(value: AnomalousLogGroup*): Self = StObject.set(x, "AnomalousLogGroups", js.Array(value*))
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
