package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeParametersRequest extends StObject {
  
  /**
    * This data type is deprecated. Instead, use ParameterFilters.
    */
  var Filters: js.UndefOr[ParametersFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Filters to limit the request results.
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.native
}
object DescribeParametersRequest {
  
  @scala.inline
  def apply(): DescribeParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParametersRequest]
  }
  
  @scala.inline
  implicit class DescribeParametersRequestMutableBuilder[Self <: DescribeParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ParametersFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ParametersFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParameterFilters(value: ParameterStringFilterList): Self = StObject.set(x, "ParameterFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterFiltersUndefined: Self = StObject.set(x, "ParameterFilters", js.undefined)
    
    @scala.inline
    def setParameterFiltersVarargs(value: ParameterStringFilter*): Self = StObject.set(x, "ParameterFilters", js.Array(value :_*))
  }
}
