package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesRequest extends StObject {
  
  /**
    * The maximum number of tables to return in each page of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the workbook whose tables are being retrieved.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object ListTablesRequest {
  
  inline def apply(workbookId: ResourceId): ListTablesRequest = {
    val __obj = js.Dynamic.literal(workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTablesRequest]
  }
  
  extension [Self <: ListTablesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
