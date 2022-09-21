package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportFailuresRequest extends StObject {
  
  /**
    *  The ID of the import. 
    */
  var ImportId: UUID
  
  /**
    *  The maximum number of failures to display on a single page. 
    */
  var MaxResults: js.UndefOr[ListImportFailuresMaxResultsCount] = js.undefined
  
  /**
    *  A token you can use to get the next page of import failures. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportFailuresRequest {
  
  inline def apply(ImportId: UUID): ListImportFailuresRequest = {
    val __obj = js.Dynamic.literal(ImportId = ImportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportFailuresRequest]
  }
  
  extension [Self <: ListImportFailuresRequest](x: Self) {
    
    inline def setImportId(value: UUID): Self = StObject.set(x, "ImportId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListImportFailuresMaxResultsCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
