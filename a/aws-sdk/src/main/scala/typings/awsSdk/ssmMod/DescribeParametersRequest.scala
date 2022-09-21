package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeParametersRequest extends StObject {
  
  /**
    * This data type is deprecated. Instead, use ParameterFilters.
    */
  var Filters: js.UndefOr[ParametersFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * Filters to limit the request results.
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
}
object DescribeParametersRequest {
  
  inline def apply(): DescribeParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParametersRequest]
  }
  
  extension [Self <: DescribeParametersRequest](x: Self) {
    
    inline def setFilters(value: ParametersFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ParametersFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParameterFilters(value: ParameterStringFilterList): Self = StObject.set(x, "ParameterFilters", value.asInstanceOf[js.Any])
    
    inline def setParameterFiltersUndefined: Self = StObject.set(x, "ParameterFilters", js.undefined)
    
    inline def setParameterFiltersVarargs(value: ParameterStringFilter*): Self = StObject.set(x, "ParameterFilters", js.Array(value*))
  }
}
