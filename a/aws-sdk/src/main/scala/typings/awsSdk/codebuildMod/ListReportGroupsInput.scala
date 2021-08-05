package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportGroupsInput extends StObject {
  
  /**
    *  The maximum number of paginated report groups returned per response. Use nextToken to iterate pages in the list of returned ReportGroup objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    *  The criterion to be used to list build report groups. Valid values include:     CREATED_TIME: List based on when each report group was created.    LAST_MODIFIED_TIME: List based on when each report group was last changed.    NAME: List based on each report group's name.  
    */
  var sortBy: js.UndefOr[ReportGroupSortByType] = js.undefined
  
  /**
    *  Used to specify the order to sort the list of returned report groups. Valid values are ASCENDING and DESCENDING. 
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.undefined
}
object ListReportGroupsInput {
  
  inline def apply(): ListReportGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportGroupsInput]
  }
  
  extension [Self <: ListReportGroupsInput](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: ReportGroupSortByType): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
