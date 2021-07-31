package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagesRequest extends StObject {
  
  /**
    * Only returns packages that match the DescribePackagesFilterList values.
    */
  var Filters: js.UndefOr[DescribePackagesFilterList] = js.undefined
  
  /**
    * Limits results to a maximum number of packages.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.undefined
  
  /**
    * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided, returns results for the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.undefined
}
object DescribePackagesRequest {
  
  @scala.inline
  def apply(): DescribePackagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesRequest]
  }
  
  @scala.inline
  implicit class DescribePackagesRequestMutableBuilder[Self <: DescribePackagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: DescribePackagesFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DescribePackagesFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
