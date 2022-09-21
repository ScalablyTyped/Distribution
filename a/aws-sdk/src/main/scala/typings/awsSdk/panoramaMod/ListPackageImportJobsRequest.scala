package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackageImportJobsRequest extends StObject {
  
  /**
    * The maximum number of package import jobs to return in one page of results.
    */
  var MaxResults: js.UndefOr[MaxSize25] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.panoramaMod.NextToken] = js.undefined
}
object ListPackageImportJobsRequest {
  
  inline def apply(): ListPackageImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageImportJobsRequest]
  }
  
  extension [Self <: ListPackageImportJobsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxSize25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
