package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityProfilesRequest extends StObject {
  
  /**
    * A filter to limit results to the security profiles that use the defined dimension.
    */
  var dimensionName: js.UndefOr[DimensionName] = js.native
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListSecurityProfilesRequest {
  
  @scala.inline
  def apply(): ListSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesRequest]
  }
  
  @scala.inline
  implicit class ListSecurityProfilesRequestMutableBuilder[Self <: ListSecurityProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: DimensionName): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
