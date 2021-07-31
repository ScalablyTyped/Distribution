package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoverersRequest extends StObject {
  
  /**
    * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
    */
  var DiscovererIdPrefix: js.UndefOr[string] = js.undefined
  
  var Limit: js.UndefOr[integer] = js.undefined
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Specifying this limits the results to only those ARNs that start with the specified prefix.
    */
  var SourceArnPrefix: js.UndefOr[string] = js.undefined
}
object ListDiscoverersRequest {
  
  @scala.inline
  def apply(): ListDiscoverersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoverersRequest]
  }
  
  @scala.inline
  implicit class ListDiscoverersRequestMutableBuilder[Self <: ListDiscoverersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscovererIdPrefix(value: string): Self = StObject.set(x, "DiscovererIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovererIdPrefixUndefined: Self = StObject.set(x, "DiscovererIdPrefix", js.undefined)
    
    @scala.inline
    def setLimit(value: integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSourceArnPrefix(value: string): Self = StObject.set(x, "SourceArnPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnPrefixUndefined: Self = StObject.set(x, "SourceArnPrefix", js.undefined)
  }
}
