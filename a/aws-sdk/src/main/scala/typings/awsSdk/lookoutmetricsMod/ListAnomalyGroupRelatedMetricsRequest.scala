package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyGroupRelatedMetricsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: UUID
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.lookoutmetricsMod.MaxResults] = js.undefined
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutmetricsMod.NextToken] = js.undefined
  
  /**
    * Filter for potential causes (CAUSE_OF_INPUT_ANOMALY_GROUP) or downstream effects (EFFECT_OF_INPUT_ANOMALY_GROUP) of the anomaly group.
    */
  var RelationshipTypeFilter: js.UndefOr[RelationshipType] = js.undefined
}
object ListAnomalyGroupRelatedMetricsRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, AnomalyGroupId: UUID): ListAnomalyGroupRelatedMetricsRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], AnomalyGroupId = AnomalyGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnomalyGroupRelatedMetricsRequest]
  }
  
  extension [Self <: ListAnomalyGroupRelatedMetricsRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRelationshipTypeFilter(value: RelationshipType): Self = StObject.set(x, "RelationshipTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypeFilterUndefined: Self = StObject.set(x, "RelationshipTypeFilter", js.undefined)
  }
}
