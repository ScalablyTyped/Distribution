package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConformancePackComplianceScoresRequest extends StObject {
  
  /**
    * Filters the results based on the ConformancePackComplianceScoresFilters.
    */
  var Filters: js.UndefOr[ConformancePackComplianceScoresFilters] = js.undefined
  
  /**
    * The maximum number of conformance pack compliance scores returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.undefined
  
  /**
    * The nextToken string in a prior request that you can use to get the paginated response for next set of conformance pack compliance scores.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
  
  /**
    * Sorts your conformance pack compliance scores in either ascending or descending order, depending on SortOrder. By default, conformance pack compliance scores are sorted in ascending order by compliance score and alphabetically by name of the conformance pack if there is more than one conformance pack with the same compliance score.
    */
  var SortBy: js.UndefOr[typings.awsSdk.configserviceMod.SortBy] = js.undefined
  
  /**
    * Determines the order in which conformance pack compliance scores are sorted. Either in ascending or descending order. Conformance packs with a compliance score of INSUFFICIENT_DATA will be first when sorting by ascending order and last when sorting by descending order.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.configserviceMod.SortOrder] = js.undefined
}
object ListConformancePackComplianceScoresRequest {
  
  inline def apply(): ListConformancePackComplianceScoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConformancePackComplianceScoresRequest]
  }
  
  extension [Self <: ListConformancePackComplianceScoresRequest](x: Self) {
    
    inline def setFilters(value: ConformancePackComplianceScoresFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setLimit(value: PageSizeLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
