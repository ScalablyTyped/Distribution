package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlatformVersionsRequest extends StObject {
  
  /**
    * Criteria for restricting the resulting list of platform versions. The filter is interpreted as a logical conjunction (AND) of the separate PlatformFilter terms.
    */
  var Filters: js.UndefOr[PlatformFilters] = js.undefined
  
  /**
    * The maximum number of platform version values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.undefined
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListPlatformVersionsRequest {
  
  inline def apply(): ListPlatformVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsRequest]
  }
  
  extension [Self <: ListPlatformVersionsRequest](x: Self) {
    
    inline def setFilters(value: PlatformFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: PlatformFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxRecords(value: PlatformMaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
