package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationsRequest extends StObject {
  
  /**
    * A valid configuration identified by Application Discovery Service. 
    */
  var configurationType: ConfigurationItemType = js.native
  
  /**
    * You can filter the request using various logical operators and a key-value format. For example:   {"key": "serverType", "value": "webServer"}  For a complete list of filter options and guidance about using them with this action, see Using the ListConfigurations Action in the AWS Application Discovery Service User Guide.
    */
  var filters: js.UndefOr[Filters] = js.native
  
  /**
    * The total number of items to return. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output characteristics for each filter, see Using the ListConfigurations Action in the AWS Application Discovery Service User Guide.
    */
  var orderBy: js.UndefOr[OrderByList] = js.native
}
object ListConfigurationsRequest {
  
  @scala.inline
  def apply(configurationType: ConfigurationItemType): ListConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListConfigurationsRequestMutableBuilder[Self <: ListConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationType(value: ConfigurationItemType): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOrderBy(value: OrderByList): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: OrderByElement*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
  }
}
