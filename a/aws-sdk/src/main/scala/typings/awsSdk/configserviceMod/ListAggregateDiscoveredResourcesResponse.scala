package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAggregateDiscoveredResourcesResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  
  /**
    * Returns a list of ResourceIdentifiers objects.
    */
  var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.native
}
object ListAggregateDiscoveredResourcesResponse {
  
  @scala.inline
  def apply(): ListAggregateDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
  }
  
  @scala.inline
  implicit class ListAggregateDiscoveredResourcesResponseMutableBuilder[Self <: ListAggregateDiscoveredResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceIdentifiers(value: DiscoveredResourceIdentifierList): Self = StObject.set(x, "ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifiersUndefined: Self = StObject.set(x, "ResourceIdentifiers", js.undefined)
    
    @scala.inline
    def setResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = StObject.set(x, "ResourceIdentifiers", js.Array(value :_*))
  }
}
