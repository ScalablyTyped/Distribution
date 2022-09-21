package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyGroupSummariesResponse extends StObject {
  
  /**
    * Aggregated details about the anomaly groups.
    */
  var AnomalyGroupStatistics: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AnomalyGroupStatistics] = js.undefined
  
  /**
    * A list of anomaly group summaries.
    */
  var AnomalyGroupSummaryList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.AnomalyGroupSummaryList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutmetricsMod.NextToken] = js.undefined
}
object ListAnomalyGroupSummariesResponse {
  
  inline def apply(): ListAnomalyGroupSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnomalyGroupSummariesResponse]
  }
  
  extension [Self <: ListAnomalyGroupSummariesResponse](x: Self) {
    
    inline def setAnomalyGroupStatistics(value: AnomalyGroupStatistics): Self = StObject.set(x, "AnomalyGroupStatistics", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupStatisticsUndefined: Self = StObject.set(x, "AnomalyGroupStatistics", js.undefined)
    
    inline def setAnomalyGroupSummaryList(value: AnomalyGroupSummaryList): Self = StObject.set(x, "AnomalyGroupSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupSummaryListUndefined: Self = StObject.set(x, "AnomalyGroupSummaryList", js.undefined)
    
    inline def setAnomalyGroupSummaryListVarargs(value: AnomalyGroupSummary*): Self = StObject.set(x, "AnomalyGroupSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
