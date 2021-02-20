package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlatformVersionsRequest extends StObject {
  
  /**
    * Criteria for restricting the resulting list of platform versions. The filter is interpreted as a logical conjunction (AND) of the separate PlatformFilter terms.
    */
  var Filters: js.UndefOr[PlatformFilters] = js.native
  
  /**
    * The maximum number of platform version values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformMaxRecords] = js.native
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListPlatformVersionsRequest {
  
  @scala.inline
  def apply(): ListPlatformVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsRequest]
  }
  
  @scala.inline
  implicit class ListPlatformVersionsRequestMutableBuilder[Self <: ListPlatformVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: PlatformFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: PlatformFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxRecords(value: PlatformMaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
